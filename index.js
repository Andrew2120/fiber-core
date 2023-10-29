"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (k !== "default" && Object.prototype.hasOwnProperty.call(mod, k)) __createBinding(result, mod, k);
    __setModuleDefault(result, mod);
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
const SwiftLanguage_1 = require("./src/Languages/SwiftLanguage");
const fs = __importStar(require("fs"));
const Types_1 = require("./src/Utility/Types");
const Helpers_1 = require("./src/Utility/Helpers");
const Config_1 = require("./src/Config");
const KotlinLanguage_1 = require("./src/Languages/KotlinLanguage");
const JavaScriptLanguage_1 = require("./src/Languages/JavaScriptLanguage");
const args = process.argv.slice(2);
const jsonFilePath = args[0];
const languageFiles = args.slice(1);
const accessModifier = 'internal';
var structOccurrencesByName = {};
// const valueContainerStructs: Struct[] = [];
var instanceStructsSet = new Types_1.StructsSet([]);
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
const getStructFrom = (object, name, isStatic, propertiesHaveDefaultValues, originalStructName) => {
    var properties = [];
    Object.keys(object).forEach(key => {
        let propertyName = (0, Helpers_1.getPropertyName)(key, originalStructName, Config_1.jsonKeyMap);
        const { value, type } = (0, Helpers_1.getValueAndTypeFrom)(object[key], Config_1.mapOfUnits);
        const property = {
            accessModifier: accessModifier,
            isStatic: isStatic,
            hasDefaultValue: propertiesHaveDefaultValues,
            isConstant: true,
            name: propertyName,
        };
        if (type.endsWith('-array')) {
            const structInstances = value.map(element => {
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
const getStaticStruct = (name, object) => {
    const originalStructName = (0, Helpers_1.capitalizeFirstLetter)(name) + 'ValuesContainer';
    let structName = originalStructName;
    const numberOfOccurrences = structOccurrencesByName[originalStructName];
    if (typeof numberOfOccurrences === 'number') {
        structName += numberOfOccurrences;
        structOccurrencesByName[originalStructName] = numberOfOccurrences + 1;
    }
    else {
        structOccurrencesByName[originalStructName] = 1;
    }
    const isStatic = false;
    const hasDefaultValues = false;
    let struct = getStructFrom(object, structName, isStatic, hasDefaultValues, name);
    instanceStructsSet.append(struct);
    let structInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    return structInstance;
};
/** @Mutating */
const getStructInstance = (name, object) => {
    const isStatic = false;
    const hasDefaultValues = false;
    let struct = getStructFrom(object, name, isStatic, hasDefaultValues, name);
    instanceStructsSet.append(struct);
    let structInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    return structInstance;
};
// const types: Struct[] = [];
// const typesNames = types.map(type => type.name);
// const importPath = ""
// const importStatements = typesNames.map(typeName => importPath + typeName);
// const typeDecelerations: string[] = [];
// const instances: StructInstance[] = [];
// const instancesDecelerations: string[] = [];
const generateSourceCodeDecelerationOf = (json, language, structName, importPath) => {
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
    const rootStructInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    const declaration = {
        accessModifier: 'public',
        isStatic: false,
        hasDefaultValue: true,
        isConstant: true,
        name: (0, Helpers_1.lowerCaseFirstLetter)(structName),
        type: `${struct.name}-object`,
        value: rootStructInstance,
    };
    const rootStructInstanceDeceleration = language.generateDecelerationStatement(declaration);
    var instanceImportStatements = language.importStatements;
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
const transpileTo = (language, json, fileName, importPath) => {
    if (language.name === "javascript") {
        const jsLanguage = language;
        const content = jsLanguage.generateThemeData(json);
        fs.writeFile("./".concat(fileName, ".").concat(jsLanguage.extension), content, function (err) {
            if (err)
                console.error(err);
        });
    }
    else {
        const { types, instances } = generateSourceCodeDecelerationOf(json, language, fileName, importPath);
        fs.writeFile(`./${fileName}Types.${language.extension}`, types, err => {
            if (err)
                console.error(err);
        });
        fs.writeFile(`./${fileName}Values.${language.extension}`, instances, err => {
            if (err)
                console.error(err);
        });
    }
};
const supportedLanguages = [new SwiftLanguage_1.SwiftLanguage(), new KotlinLanguage_1.KotlinLanguage(), new JavaScriptLanguage_1.JavaScriptLanguage()];
const getLanguageWithExtension = (extension, listOfLanguages) => {
    for (let index = 0; index < listOfLanguages.length; index++) {
        const language = listOfLanguages[index];
        if (language.extension === extension)
            return language;
    }
    console.error(`Language is with extension ${extension} is not supported`);
};
const json = require(jsonFilePath);
languageFiles.forEach(languageFile => {
    const [filename, extension] = languageFile.split('.');
    const language = getLanguageWithExtension(extension, supportedLanguages);
    transpileTo(language, json, filename, 'com.b_labs.fiber_tokens');
    structOccurrencesByName = {};
    instanceStructsSet = new Types_1.StructsSet([]);
});
