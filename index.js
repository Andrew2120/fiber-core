"use strict";
var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
Object.defineProperty(exports, "__esModule", { value: true });
var SwiftLanguage_1 = require("./src/Languages/SwiftLanguage");
var fs = require("fs");
var Types_1 = require("./src/Utility/Types");
var Helpers_1 = require("./src/Utility/Helpers");
var Config_1 = require("./src/Config");
var KotlinLanguage_1 = require("./src/Languages/KotlinLanguage");
var JavaScriptLanguage_1 = require("./src/Languages/JavaScriptLanguage");
var args = process.argv.slice(2);
var tokensFilePath = args[0];
var packageName = args.pop();
var languageFiles = args.slice(1);
var lightJsonFilePath = './light.json';
var darkJsonFilePath = './dark.json';
var execSync = require('child_process').execSync;
execSync("npx token-transformer ".concat(tokensFilePath, " ").concat(lightJsonFilePath, " global,alias,component/light global"), {
    encoding: 'utf-8',
});
execSync("npx token-transformer ".concat(tokensFilePath, " ").concat(darkJsonFilePath, " global,alias,component/dark global"), {
    encoding: 'utf-8',
});
var accessModifier = 'public';
var structOccurrencesByName = {};
// const valueContainerStructs: Struct[] = [];
var instanceStructsSet = new Types_1.StructsSet([]);
var generatedObjectSignatures = [];
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
var getStructFrom = function (object, name, isStatic, propertiesHaveDefaultValues, originalStructName, isRootObject) {
    var properties = [];
    Object.keys(object).forEach(function (key) {
        var propertyName = (0, Helpers_1.getPropertyName)(key, originalStructName, Config_1.jsonKeyMap);
        var _a = (0, Helpers_1.getValueAndTypeFrom)(object[key], Config_1.mapOfUnits), value = _a.value, type = _a.type;
        var property = {
            accessModifier: accessModifier,
            isStatic: isStatic,
            hasDefaultValue: propertiesHaveDefaultValues,
            isConstant: true,
            nameInObject: key,
            name: propertyName,
        };
        if (type.endsWith('-array')) {
            var structInstances = value.map(function (element) {
                var structName = type.replace('-array', '');
                return getStructInstance(structName, element);
            });
            properties.push(__assign(__assign({}, property), { type: type, value: structInstances }));
            return;
        }
        if (type.endsWith('-object')) {
            var structName = (0, Helpers_1.capitalizeFirstLetter)(type.replace('-object', '').replace('colorLight', 'color').replace('colorDark', 'color'));
            var structInstance = getStructInstance(structName, value);
            properties.push(__assign(__assign({}, property), { type: type, value: structInstance }));
            return;
        }
        if (type === 'valueContainerObject') {
            var structName = propertyName.replace('colorLight', 'color').replace('colorDark', 'color');
            var structInstance = getStaticStruct(structName, value);
            if (isRootObject) {
                if (propertyName == 'color') {
                    var darkStructInstance = overrideValues(darkJson.color, structInstance);
                    property.name = 'colorLight';
                    property.accessModifier = 'private';
                    properties.push(__assign(__assign({}, property), { name: 'colorDark', type: type, value: darkStructInstance }));
                }
            }
            properties.push(__assign(__assign({}, property), { type: type, value: structInstance }));
            return;
        }
        properties.push(__assign(__assign({}, property), { type: type, value: value }));
    });
    return { accessModifier: accessModifier, name: name, properties: properties, computedProperties: [] };
};
/** @Mutating */
var getStaticStruct = function (name, object) {
    var originalStructName = 'DS' + (0, Helpers_1.capitalizeFirstLetter)(name);
    var structName = originalStructName;
    var numberOfOccurrences = structOccurrencesByName[originalStructName];
    var isStatic = false;
    var hasDefaultValues = false;
    var objectSignature = (0, Helpers_1.getObjectSignature)(object);
    if (typeof numberOfOccurrences === 'number') {
        if (!generatedObjectSignatures.includes(objectSignature)) {
            structName += numberOfOccurrences;
            structOccurrencesByName[originalStructName] = numberOfOccurrences + 1;
        }
    }
    else {
        structOccurrencesByName[originalStructName] = 1;
    }
    generatedObjectSignatures.push(objectSignature);
    var struct = getStructFrom(object, structName, isStatic, hasDefaultValues, name, false);
    instanceStructsSet.append(struct);
    var structInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    return structInstance;
};
/** @Mutating */
var getStructInstance = function (name, object) {
    var isStatic = false;
    var hasDefaultValues = false;
    var struct = getStructFrom(object, name, isStatic, hasDefaultValues, name, false);
    instanceStructsSet.append(struct);
    var structInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    return structInstance;
};
var generateSourceCodeDecelerationOf = function (json, language, structName, importPath) {
    var propertiesHaveDefaultValues = false;
    var isStatic = false;
    var struct = getStructFrom(json, structName, isStatic, propertiesHaveDefaultValues, structName, true);
    var isDarkProperty = {
        accessModifier: accessModifier,
        isStatic: isStatic,
        hasDefaultValue: true,
        isConstant: false,
        nameInObject: 'isDark',
        name: 'isDark',
        type: 'boolean',
        value: 'false',
    };
    var swiftColorComputedPropertyValue = 'isDark ? colorDark : colorLight';
    var kotlinColorComputedPropertyValue = 'if (isDark) colorDark else colorLight';
    var colorComputedPropertyValue = language.extension === 'swift' ? swiftColorComputedPropertyValue : kotlinColorComputedPropertyValue;
    var colorComputedProperty = {
        accessModifier: accessModifier,
        isStatic: isStatic,
        hasDefaultValue: true,
        isConstant: false,
        nameInObject: 'color',
        name: 'color',
        type: 'color-computedProperty',
        value: colorComputedPropertyValue,
    };
    struct.properties = __spreadArray([isDarkProperty], struct.properties, true);
    struct.computedProperties = [colorComputedProperty];
    var rootStructDeceleration = language.generateStructDeclaration(struct, true);
    var instanceStructDeceleration = instanceStructsSet.values().map(function (instanceStruct) {
        return language.generateInstanceStructDeclaration(instanceStruct);
    });
    var rootStructInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    var declaration = {
        accessModifier: 'public',
        isStatic: false,
        hasDefaultValue: true,
        isConstant: true,
        nameInObject: '',
        name: (0, Helpers_1.lowerCaseFirstLetter)(structName),
        type: "".concat(struct.name, "-object"),
        value: rootStructInstance,
    };
    var rootStructInstanceDeceleration = language.generateDecelerationStatement(declaration);
    var instanceImportStatements = language.importStatements;
    var typesImportStatements = language.importStatements;
    if (language.extension === 'kt') {
        typesImportStatements = 'package com.b_labs.fiber_tokens\n' + language.importStatements;
        var packageDeclaration = 'package com.b_labs.' + packageName;
        var typesNames = __spreadArray([struct.name], instanceStructsSet.values().map(function (struct) { return struct.name; }), true);
        instanceImportStatements = packageDeclaration + '\n' + instanceImportStatements;
        instanceImportStatements +=
            '\n' + typesNames.map(function (typeName) { return 'import ' + importPath + ".".concat(typeName); }).join('\n');
    }
    else if (language.extension === 'swift') {
        instanceImportStatements = instanceImportStatements + '\nimport FiberCore';
    }
    return {
        types: __spreadArray([typesImportStatements, rootStructDeceleration], instanceStructDeceleration, true).join('\n\n'),
        instances: [instanceImportStatements, rootStructInstanceDeceleration].join('\n\n'),
    };
};
var transpileTo = function (language, lightJson, darkJson, fileName, importPath) {
    if (language.name === 'javascript') {
        var jsLanguage = language;
        var content = jsLanguage.generateThemeData(lightJson);
        fs.writeFile('./'.concat(fileName, '.').concat(jsLanguage.extension), content, function (err) {
            if (err)
                console.error(err);
        });
    }
    else {
        var _a = generateSourceCodeDecelerationOf(lightJson, language, fileName, importPath), types = _a.types, instances = _a.instances;
        fs.writeFile("./".concat(fileName, "Types.").concat(language.extension), types, function (err) {
            if (err)
                console.error(err);
        });
        fs.writeFile("./".concat(fileName, "Values.").concat(language.extension), instances, function (err) {
            if (err)
                console.error(err);
        });
    }
};
var supportedLanguages = [
    new SwiftLanguage_1.SwiftLanguage(),
    new KotlinLanguage_1.KotlinLanguage(),
    new JavaScriptLanguage_1.JavaScriptLanguage(),
];
var getLanguageWithExtension = function (extension, listOfLanguages) {
    for (var index = 0; index < listOfLanguages.length; index++) {
        var language = listOfLanguages[index];
        if (language.extension === extension)
            return language;
    }
    console.error("Language is with extension ".concat(extension, " is not supported"));
};
var darkJson = require(darkJsonFilePath);
var lightJson = require(lightJsonFilePath);
languageFiles.forEach(function (languageFile) {
    var _a = languageFile.split('.'), filename = _a[0], extension = _a[1];
    var language = getLanguageWithExtension(extension, supportedLanguages);
    transpileTo(language, lightJson, darkJson, filename, 'com.b_labs.fiber_tokens');
    structOccurrencesByName = {};
    generatedObjectSignatures = [];
    instanceStructsSet = new Types_1.StructsSet([]);
});
function overrideValues(json, colorProperty) {
    var allColorValues = getAllColorValuesIn(json);
    var stringifiedColorProperty = JSON.stringify(colorProperty);
    Object.keys(allColorValues).forEach(function (propertyName) {
        var value = allColorValues[propertyName];
        var pattern = "name\":\"".concat(propertyName, "\",\"type\":\"color\",\"value\":\"#([0-9A-Fa-f]{3,4}|[0-9A-Fa-f]{6}|[0-9A-Fa-f]{8})\"");
        var regex = new RegExp(pattern, 'g');
        if (regex.test(stringifiedColorProperty)) {
            stringifiedColorProperty = stringifiedColorProperty.replace(regex, "name\":\"".concat(propertyName, "\",\"type\":\"color\",\"value\":\"").concat(value, "\""));
        }
    });
    return JSON.parse(stringifiedColorProperty);
}
function getAllColorValuesIn(obj, parentKey) {
    if (parentKey === void 0) { parentKey = ''; }
    var colorValues = {};
    Object.keys(obj).forEach(function (key) {
        var value = obj[key];
        if (typeof value['value'] === 'string') {
            var propertyName = (0, Helpers_1.getPropertyName)(key, parentKey, Config_1.jsonKeyMap);
            colorValues[propertyName] = value['value'];
        }
        else {
            var childColorValues = getAllColorValuesIn(value, key);
            colorValues = __assign(__assign({}, colorValues), childColorValues);
        }
    });
    return colorValues;
}
function includesStructCalled(structsSet, name) {
    var isIncluded = false;
    structsSet.values().forEach(function (instance) {
        if (instance.name === name) {
            isIncluded = true;
        }
    });
    return isIncluded;
}
