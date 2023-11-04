import { SwiftLanguage } from './src/Languages/SwiftLanguage';
import { Declaration, Property, TypeData, InstanceData, ComputedProperty } from './src/Struct';
import * as fs from 'fs';
import { AccessModifier, StructsSet } from './src/Utility/Types';
import {
  capitalizeFirstLetter,
  getObjectSignature,
  getPropertyName,
  getStructInstanceOf,
  getValueAndTypeFrom,
  lowerCaseFirstLetter,
} from './src/Utility/Helpers';
import { jsonKeyMap, mapOfUnits } from './src/Config';
import { Language, JSLanguage } from './src/Languages/Language';
import { KotlinLanguage } from './src/Languages/kotlinLanguage';
import { JavaScriptLanguage } from './src/Languages/JavaScriptLanguage';

const args = process.argv.slice(2);
const tokensFilePath = args[0];
const packageName = args.pop();
const languageFiles = args.slice(1);

const lightJsonFilePath = './light.json';
const darkJsonFilePath = './dark.json';

const execSync = require('child_process').execSync;
execSync(`npx token-transformer ${tokensFilePath} ${lightJsonFilePath} global,alias,component/light global`, {
  encoding: 'utf-8',
});

execSync(`npx token-transformer ${tokensFilePath} ${darkJsonFilePath} global,alias,component/dark global`, {
  encoding: 'utf-8',
});

const accessModifier: AccessModifier = 'public';

var structOccurrencesByName = {};
// const valueContainerStructs: Struct[] = [];
var instanceStructsSet = new StructsSet([]);

var generatedObjectSignatures: string[] = [];

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
  originalStructName: string,
  isRootObject: boolean
): TypeData => {
  var properties: Property[] = [];

  Object.keys(object).forEach(key => {
    let propertyName = getPropertyName(key, originalStructName, jsonKeyMap);

    const { value, type } = getValueAndTypeFrom(object[key], mapOfUnits);

    const property = {
      accessModifier: accessModifier,
      isStatic: isStatic,
      hasDefaultValue: propertiesHaveDefaultValues,
      isConstant: true,
      nameInObject: key,
      name: propertyName,
    };

    if (type.endsWith('-array')) {
      const structInstances: InstanceData[] = value.map(element => {
        var structName = type.replace('-array', '');
        return getStructInstance(structName, element);
      });

      properties.push({ ...property, type, value: structInstances });
      return;
    }

    if (type.endsWith('-object')) {
      var structName = capitalizeFirstLetter(
        type.replace('-object', '').replace('colorLight', 'color').replace('colorDark', 'color')
      );
      let structInstance = getStructInstance(structName, value);
      properties.push({ ...property, type, value: structInstance });
      return;
    }

    if (type === 'valueContainerObject') {
      var structName = propertyName.replace('colorLight', 'color').replace('colorDark', 'color');
      const structInstance = getStaticStruct(structName, value);
      if (isRootObject) {
        if (propertyName == 'color') {
          const darkStructInstance = overrideValues(darkJson.color, structInstance) as InstanceData;
          property.name = 'colorLight';
          property.accessModifier = 'private' as 'public';

          properties.push({
            ...property,
            name: 'colorDark',
            type,
            value: darkStructInstance,
          });
        }
      }
      properties.push({ ...property, type, value: structInstance });
      return;
    }

    properties.push({ ...property, type, value: value });
  });

  return { accessModifier, name, properties, computedProperties: [] };
};

/** @Mutating */
const getStaticStruct = (name: string, object: object): InstanceData => {
  const originalStructName = 'DS' + capitalizeFirstLetter(name);
  let structName = originalStructName;

  const numberOfOccurrences = structOccurrencesByName[originalStructName];

  const isStatic = false;
  const hasDefaultValues = false;
  const objectSignature = getObjectSignature(object);

  if (typeof numberOfOccurrences === 'number') {
    if (!generatedObjectSignatures.includes(objectSignature)) {
      structName += numberOfOccurrences;
      structOccurrencesByName[originalStructName] = numberOfOccurrences + 1;
    }
  } else {
    structOccurrencesByName[originalStructName] = 1;
  }

  generatedObjectSignatures.push(objectSignature);
  let struct = getStructFrom(object, structName, isStatic, hasDefaultValues, name, false);

  instanceStructsSet.append(struct);

  let structInstance = getStructInstanceOf(struct);

  return structInstance;
};

/** @Mutating */
const getStructInstance = (name: string, object: object): InstanceData => {
  const isStatic = false;
  const hasDefaultValues = false;

  let struct = getStructFrom(object, name, isStatic, hasDefaultValues, name, false);

  instanceStructsSet.append(struct);
  let structInstance = getStructInstanceOf(struct);

  return structInstance;
};

const generateSourceCodeDecelerationOf = (
  json: object,
  language: Language,
  structName,
  importPath: string
): { types: string; instances: string } => {
  const propertiesHaveDefaultValues = false;
  const isStatic = false;

  const struct = getStructFrom(json, structName, isStatic, propertiesHaveDefaultValues, structName, true);
  const isDarkProperty: Property = {
    accessModifier: accessModifier,
    isStatic: isStatic,
    hasDefaultValue: true,
    isConstant: false,
    nameInObject: 'isDark',
    name: 'isDark',
    type: 'boolean',
    value: 'false',
  };

  const swiftColorComputedPropertyValue = 'isDark ? colorDark : colorLight';
  const kotlinColorComputedPropertyValue = 'if (isDark) colorDark else colorLight';

  const colorComputedPropertyValue =
    language.extension === 'swift' ? swiftColorComputedPropertyValue : kotlinColorComputedPropertyValue;

  const colorComputedProperty: ComputedProperty = {
    accessModifier: accessModifier,
    isStatic: isStatic,
    hasDefaultValue: true,
    isConstant: false,
    nameInObject: 'color',
    name: 'color',
    type: 'color-computedProperty',
    value: colorComputedPropertyValue,
  };
  struct.properties = [isDarkProperty, ...struct.properties];
  struct.computedProperties = [colorComputedProperty];
  const rootStructDeceleration = language.generateStructDeclaration(struct, true);

  const instanceStructDeceleration = instanceStructsSet.values().map(instanceStruct => {
    return language.generateInstanceStructDeclaration(instanceStruct);
  });

  const rootStructInstance = getStructInstanceOf(struct);

  const declaration: Declaration = {
    accessModifier: 'public',
    isStatic: false,
    hasDefaultValue: true,
    isConstant: true,
    nameInObject: '',
    name: lowerCaseFirstLetter(structName),
    type: `${struct.name}-object`,
    value: rootStructInstance,
  };
  const rootStructInstanceDeceleration = language.generateDecelerationStatement(declaration);

  let instanceImportStatements: string = language.importStatements;
  let typesImportStatements: string = language.importStatements;
  if (language.extension === 'kt') {
    typesImportStatements = 'package com.blabs.hicomponents.theme\n' + language.importStatements;
    const packageDeclaration = 'package com.blabs.' + packageName;
    const typesNames = [struct.name, ...instanceStructsSet.values().map(struct => struct.name)];
    instanceImportStatements = packageDeclaration + '\n' + instanceImportStatements;
    instanceImportStatements +=
      '\n' + typesNames.map(typeName => 'import ' + importPath + `.${typeName}`).join('\n');
  } else if (language.extension === 'swift') {
    instanceImportStatements = instanceImportStatements + '\nimport FiberCore';
  }

  return {
    types: [typesImportStatements, rootStructDeceleration, ...instanceStructDeceleration].join('\n\n'),
    instances: [instanceImportStatements, rootStructInstanceDeceleration].join('\n\n'),
  };
};

const transpileTo = (
  language: Language | JSLanguage,
  lightJson: object,
  darkJson,
  fileName: string,
  importPath: string
) => {
  if (language.name === 'javascript') {
    const jsLanguage = language as JSLanguage;
    const content = jsLanguage.generateThemeData(lightJson);
    fs.writeFile('./'.concat(fileName, '.').concat(jsLanguage.extension), content, function (err) {
      if (err) console.error(err);
    });
  } else {
    const { types, instances } = generateSourceCodeDecelerationOf(
      lightJson,
      language as Language,
      fileName,
      importPath
    );

    fs.writeFile(`./${fileName}Types.${language.extension}`, types, err => {
      if (err) console.error(err);
    });

    fs.writeFile(`./${fileName}Values.${language.extension}`, instances, err => {
      if (err) console.error(err);
    });
  }
};

const supportedLanguages: (Language | JSLanguage)[] = [
  new SwiftLanguage(),
  new KotlinLanguage(),
  new JavaScriptLanguage(),
];

const getLanguageWithExtension = (
  extension: string,
  listOfLanguages: (Language | JSLanguage)[]
): Language | JSLanguage => {
  for (let index = 0; index < listOfLanguages.length; index++) {
    const language = listOfLanguages[index];
    if (language.extension === extension) return language;
  }

  console.error(`Language is with extension ${extension} is not supported`);
};

const darkJson = require(darkJsonFilePath);
const lightJson = require(lightJsonFilePath);

languageFiles.forEach(languageFile => {
  const [filename, extension] = languageFile.split('.');
  const language = getLanguageWithExtension(extension, supportedLanguages);
  transpileTo(language, lightJson, darkJson, filename, 'com.blabs.hicomponents.theme');
  structOccurrencesByName = {};
  generatedObjectSignatures = [];
  instanceStructsSet = new StructsSet([]);
});

function overrideValues(json: object, colorProperty: InstanceData): object {
  const allColorValues = getAllColorValuesIn(json);
  var stringifiedColorProperty = JSON.stringify(colorProperty);
  Object.keys(allColorValues).forEach(propertyName => {
    let value = allColorValues[propertyName];
    let pattern = `name":"${propertyName}","type":"color","value":"#([0-9A-Fa-f]{3,4}|[0-9A-Fa-f]{6}|[0-9A-Fa-f]{8})"`;
    let regex = new RegExp(pattern, 'g');
    if (regex.test(stringifiedColorProperty)) {
      stringifiedColorProperty = stringifiedColorProperty.replace(
        regex,
        `name":"${propertyName}","type":"color","value":"${value}"`
      );
    }
  });
  return JSON.parse(stringifiedColorProperty);
}

function getAllColorValuesIn(obj: object, parentKey = '') {
  let colorValues = {};

  Object.keys(obj).forEach(key => {
    const value = obj[key];
    if (typeof value['value'] === 'string') {
      let propertyName = getPropertyName(key, parentKey, jsonKeyMap);
      colorValues[propertyName] = value['value'];
    } else {
      const childColorValues = getAllColorValuesIn(value, key);
      colorValues = { ...colorValues, ...childColorValues };
    }
  });
  return colorValues;
}

function includesStructCalled(structsSet: StructsSet, name: string): boolean {
  let isIncluded = false;
  structsSet.values().forEach(instance => {
    if (instance.name === name) {
      isIncluded = true;
    }
  });

  return isIncluded;
}
