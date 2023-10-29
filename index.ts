import { SwiftLanguage } from './src/Languages/SwiftLanguage';
import { Declaration, Property, Struct, StructInstance } from './src/Struct';
import * as fs from 'fs';
import { AccessModifier, StructsSet } from './src/Utility/Types';
import {
  capitalizeFirstLetter,
  getPropertyName,
  getStructInstanceOf,
  getValueAndTypeFrom,
  lowerCaseFirstLetter,
} from './src/Utility/Helpers';
import { jsonKeyMap, mapOfUnits } from './src/Config';
import { Language, JSLanguage } from './src/Languages/Language';
import { KotlinLanguage } from './src/Languages/KotlinLanguage';
import { JavaScriptLanguage } from './src/Languages/JavaScriptLanguage';

const args = process.argv.slice(2);
const jsonFilePath = args[0];
const languageFiles = args.slice(1);

const accessModifier: AccessModifier = 'internal';

var structOccurrencesByName = {};
// const valueContainerStructs: Struct[] = [];
var instanceStructsSet = new StructsSet([]);

/**
 * Creates and returns a `Struct` object form the provided object
 * @param object The object from which the properties should be generated
 * @param name The name of the generated struct
 * @param propertiesHaveDefaultValues Whether or not the properties of the struct should have a default value
 * @param originalStructName The original name of the struct before adding any set of charters for the
 * purpose of name uniqueness
 * @returns A `Struct` object containing all the necessary information for source code deceleration of
 * this object as a Struct
 */
const getStructFrom = (
  object: any,
  name: string,
  isStatic: boolean,
  propertiesHaveDefaultValues: boolean,
  originalStructName: string
): Struct => {
  var properties: Property[] = [];

  Object.keys(object).forEach(key => {
    let propertyName = getPropertyName(key, originalStructName, jsonKeyMap);

    const { value, type } = getValueAndTypeFrom(object[key], mapOfUnits);

    const property = {
      accessModifier: accessModifier,
      isStatic: isStatic,
      hasDefaultValue: propertiesHaveDefaultValues,
      isConstant: true,
      name: propertyName,
    };

    if (type.endsWith('-array')) {
      const structInstances: StructInstance[] = value.map(element => {
        var structName = type.replace('-array', '');
        return getStructInstance(structName, element);
      });

      properties.push({ ...property, type, value: structInstances });
      return;
    }

    if (type.endsWith('-object')) {
      var structName = type.replace('-object', '');
      let structInstance = getStructInstance(structName, value);
      properties.push({ ...property, type, value: structInstance });
      return;
    }

    if (type === 'valueContainerObject') {
      const structInstance = getStaticStruct(propertyName, value);
      properties.push({ ...property, type, value: structInstance });
      return;
    }

    properties.push({ ...property, type, value: value });
  });

  return { accessModifier, name, properties };
};

/** @Mutating */
const getStaticStruct = (name: string, object: object): StructInstance => {
  const originalStructName = capitalizeFirstLetter(name) + 'ValuesContainer';
  let structName = originalStructName;

  const numberOfOccurrences = structOccurrencesByName[originalStructName];

  if (typeof numberOfOccurrences === 'number') {
    structName += numberOfOccurrences;
    structOccurrencesByName[originalStructName] = numberOfOccurrences + 1;
  } else {
    structOccurrencesByName[originalStructName] = 1;
  }
  const isStatic = false;
  const hasDefaultValues = false;

  let struct = getStructFrom(object, structName, isStatic, hasDefaultValues, name);

  instanceStructsSet.append(struct);
  let structInstance = getStructInstanceOf(struct);

  return structInstance;
};

/** @Mutating */
const getStructInstance = (name: string, object: object): StructInstance => {
  const isStatic = false;
  const hasDefaultValues = false;

  let struct = getStructFrom(object, name, isStatic, hasDefaultValues, name);

  instanceStructsSet.append(struct);
  let structInstance = getStructInstanceOf(struct);

  return structInstance;
};

// const types: Struct[] = [];
// const typesNames = types.map(type => type.name);
// const importPath = ""
// const importStatements = typesNames.map(typeName => importPath + typeName);
// const typeDecelerations: string[] = [];
// const instances: StructInstance[] = [];
// const instancesDecelerations: string[] = [];

const generateSourceCodeDecelerationOf = (
  json: object,
  language: Language,
  structName,
  importPath: string
): { types: string; instances: string } => {
  const propertiesHaveDefaultValues = false;
  const isStatic = false;

  const struct = getStructFrom(json, structName, isStatic, propertiesHaveDefaultValues, structName);
  const rootStructDeceleration = language.generateStructDeclaration(struct, true);

  // const valueContainerStructsDeceleration = valueContainerStructs.map(staticStruct => {
  //   return language.generateStructDeclaration(staticStruct);
  // });

  const instanceStructDeceleration = instanceStructsSet.values().map(instanceStruct => {
    return language.generateInstanceStructDeclaration(instanceStruct);
  });

  const rootStructInstance = getStructInstanceOf(struct);

  const declaration: Declaration = {
    accessModifier: 'public',
    isStatic: false,
    hasDefaultValue: true,
    isConstant: true,
    name: lowerCaseFirstLetter(structName),
    type: `${struct.name}-object`,
    value: rootStructInstance,
  };
  const rootStructInstanceDeceleration = language.generateDecelerationStatement(declaration);

  var instanceImportStatements: string = language.importStatements;
  if (language.extension === 'kt') {
    const typesNames = [struct.name, ...instanceStructsSet.values().map(struct => struct.name)];
    instanceImportStatements +=
      '\n' + typesNames.map(typeName => 'import ' + importPath + `.${typeName}`).join('\n');
  }

  return {
    types: [language.importStatements, rootStructDeceleration, ...instanceStructDeceleration].join('\n\n'),
    instances: [instanceImportStatements, rootStructInstanceDeceleration].join('\n\n'),
  };
};

const transpileTo = (language: Language|JSLanguage, json: object, fileName: string, importPath: string) => {
  if(language.name === "javascript" ){
    const jsLanguage = language as JSLanguage
    const content = jsLanguage.generateThemeData(json)
    fs.writeFile("./".concat(fileName, ".").concat(jsLanguage.extension), content, function (err) {
      if (err)
        console.error(err);
    });
  } else {
    const { types, instances } = generateSourceCodeDecelerationOf(json, language as Language, fileName, importPath);

    fs.writeFile(`./${fileName}Types.${language.extension}`, types, err => {
      if (err) console.error(err);
    });
  
    fs.writeFile(`./${fileName}Values.${language.extension}`, instances, err => {
      if (err) console.error(err);
    });
  }
};

const supportedLanguages: (Language|JSLanguage)[] = [new SwiftLanguage(), new KotlinLanguage(), new JavaScriptLanguage()];

const getLanguageWithExtension = (extension: string, listOfLanguages: (Language|JSLanguage)[]): (Language|JSLanguage) => {
  for (let index = 0; index < listOfLanguages.length; index++) {
    const language = listOfLanguages[index];
    if (language.extension === extension) return language;
  }

  console.error(`Language is with extension ${extension} is not supported`);
};

const json = require(jsonFilePath);

languageFiles.forEach(languageFile => {
  const [filename, extension] = languageFile.split('.');
  const language = getLanguageWithExtension(extension, supportedLanguages);
  transpileTo(language, json, filename, 'com.b_labs.fiber_tokens');
  structOccurrencesByName = {};
  instanceStructsSet = new StructsSet([]);
});