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
var kotlinLanguage_1 = require("./src/Languages/kotlinLanguage");
var JavaScriptLanguage_1= require("./src/Languages/JavaScriptLanguage");
var args = process.argv.slice(2);
var jsonFilePath = args[0];
var languageFiles = args.slice(1);
var accessModifier = 'internal';
var structOccurrencesByName = {};
var valueContainerStructs = [];
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
var getStructFrom = function (object, name, propertiesHaveDefaultValues, originalStructName) {
    var properties = [];
    Object.keys(object).forEach(function (key) {
        var propertyName = (0, Helpers_1.getPropertyName)(key, originalStructName, Config_1.jsonKeyMap);
        var _a = (0, Helpers_1.getValueAndTypeFrom)(object[key], Config_1.mapOfUnits), value = _a.value, type = _a.type;
        var property = {
            accessModifier: accessModifier,
            hasDefaultValue: propertiesHaveDefaultValues,
            isConstant: true,
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
            var structName = type.replace('-object', '');
            var structInstance = getStructInstance(structName, value);
            properties.push(__assign(__assign({}, property), { type: type, value: structInstance }));
            return;
        }
        if (type === 'valueContainerObject') {
            var struct = getStaticStruct(propertyName, value);
            properties.push(__assign(__assign({}, property), { type: type, value: struct }));
            return;
        }
        properties.push(__assign(__assign({}, property), { type: type, value: value }));
    });
    return { accessModifier: accessModifier, name: name, properties: properties };
};
/** @Mutating */
var getStaticStruct = function (name, object) {
    var originalStructName = (0, Helpers_1.capitalizeFirstLetter)(name) + 'ValuesContainer';
    var structName = originalStructName;
    var numberOfOccurrences = structOccurrencesByName[originalStructName];
    if (typeof numberOfOccurrences === 'number') {
        structName += numberOfOccurrences;
        structOccurrencesByName[originalStructName] = numberOfOccurrences + 1;
    }
    else {
        structOccurrencesByName[originalStructName] = 1;
    }
    var struct = getStructFrom(object, structName, true, name);
    valueContainerStructs.push(struct);
    return struct;
};
/** @Mutating */
var getStructInstance = function (name, object) {
    var struct = getStructFrom(object, name, false, name);
    instanceStructsSet.append(struct);
    var structInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    return structInstance;
};
var generateSourceCodeDecelerationOf = function (json, language, structName) {

    if (language.name === 'javascript') {
        return language.generateThemeData(json);
    } else {
        var propertiesHaveDefaultValues = true;
        var struct = getStructFrom(json, structName, propertiesHaveDefaultValues, structName);
        var rootStructDeceleration = language.generateStructDeclaration(struct);
        var valueContainerStructsDeceleration = valueContainerStructs.map(function (staticStruct) {
            return language.generateStructDeclaration(staticStruct);
        });
        var instanceStructDeceleration = instanceStructsSet.values().map(function (instanceStruct) {
            return language.generateInstanceStructDeclaration(instanceStruct);
        });
        return __spreadArray(__spreadArray([
            language.importStatements,
            rootStructDeceleration
        ], valueContainerStructsDeceleration, true), instanceStructDeceleration, true).join('\n\n');
    }
    
};
var transpileTo = function (language, json, fileName) {
    var content = generateSourceCodeDecelerationOf(json, language, fileName);
    try {
        fs.writeFile("./".concat(fileName, ".").concat(language.extension), content, function (err) {
            if (err)
                console.error(err);
        });
    } catch (e) {
        console.log(e);
    }

};

var supportedLanguages = [new SwiftLanguage_1.SwiftLanguage(), new kotlinLanguage_1.KotlinLanguage(), new JavaScriptLanguage_1.JavaScriptLanguage()];
var getLanguageWithExtension = function (extension, listOfLanguages) {
    for (var index = 0; index < listOfLanguages.length; index++) {
        var language = listOfLanguages[index];
        if (language.extension === extension)
            return language;
    }
    console.error("Language is with extension ".concat(extension, " is not supported"));
};
var json = require(jsonFilePath);
languageFiles.forEach(function (languageFile) {
    var _a = languageFile.split('.'), filename = _a[0], extension = _a[1];
    var language = getLanguageWithExtension(extension, supportedLanguages);
    transpileTo(language, json, filename);
});
