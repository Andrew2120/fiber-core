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
var args = process.argv.slice(2);
var jsonFilePath = args[0];
var languageFiles = args.slice(1);
var accessModifier = 'internal';
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
var getStructFrom = function (object, name, isStatic, propertiesHaveDefaultValues, originalStructName) {
    var properties = [];
    Object.keys(object).forEach(function (key) {
        var propertyName = (0, Helpers_1.getPropertyName)(key, originalStructName, Config_1.jsonKeyMap);
        var _a = (0, Helpers_1.getValueAndTypeFrom)(object[key], Config_1.mapOfUnits), value = _a.value, type = _a.type;
        var property = {
            accessModifier: accessModifier,
            isStatic: isStatic,
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
            var structInstance = getStaticStruct(propertyName, value);
            properties.push(__assign(__assign({}, property), { type: type, value: structInstance }));
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
    var isStatic = false;
    var hasDefaultValues = false;
    var struct = getStructFrom(object, structName, isStatic, hasDefaultValues, name);
    instanceStructsSet.append(struct);
    var structInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    return structInstance;
};
/** @Mutating */
var getStructInstance = function (name, object) {
    var isStatic = false;
    var hasDefaultValues = false;
    var struct = getStructFrom(object, name, isStatic, hasDefaultValues, name);
    instanceStructsSet.append(struct);
    var structInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    return structInstance;
};
// const types: Struct[] = [];
// const typesNames = types.map(type => type.name);
// const importPath = ""
// const importStatements = typesNames.map(typeName => importPath + typeName);
// const typeDecelerations: string[] = [];
// const instances: StructInstance[] = [];
// const instancesDecelerations: string[] = [];
var generateSourceCodeDecelerationOf = function (json, language, structName, importPath) {
    var propertiesHaveDefaultValues = false;
    var isStatic = false;
    var struct = getStructFrom(json, structName, isStatic, propertiesHaveDefaultValues, structName);
    var rootStructDeceleration = language.generateStructDeclaration(struct, true);
    // const valueContainerStructsDeceleration = valueContainerStructs.map(staticStruct => {
    //   return language.generateStructDeclaration(staticStruct);
    // });
    var instanceStructDeceleration = instanceStructsSet.values().map(function (instanceStruct) {
        return language.generateInstanceStructDeclaration(instanceStruct);
    });
    var rootStructInstance = (0, Helpers_1.getStructInstanceOf)(struct);
    var declaration = {
        accessModifier: 'public',
        isStatic: false,
        hasDefaultValue: true,
        isConstant: true,
        name: (0, Helpers_1.lowerCaseFirstLetter)(structName),
        type: "".concat(struct.name, "-object"),
        value: rootStructInstance,
    };
    var rootStructInstanceDeceleration = language.generateDecelerationStatement(declaration);
    // `var ${lowerCaseFirstLetter(structName)} = ` + language.generateInstanceDeceleration(rootStructInstance);
    var instanceImportStatements = '';
    if (language.extension === 'kt') {
        var typesNames = __spreadArray([struct.name], instanceStructsSet.values().map(function (struct) { return struct.name; }), true);
        instanceImportStatements =
            language.importStatements +
                '\n' +
                typesNames.map(function (typeName) { return 'import ' + importPath + ".".concat(typeName); }).join('\n');
    }
    return {
        types: __spreadArray([language.importStatements, rootStructDeceleration], instanceStructDeceleration, true).join('\n\n'),
        instances: [instanceImportStatements, '\n', rootStructInstanceDeceleration].join('\n\n'),
    };
};
var transpileTo = function (language, json, fileName, importPath) {
    var _a = generateSourceCodeDecelerationOf(json, language, fileName, importPath), types = _a.types, instances = _a.instances;
    fs.writeFile("./".concat(fileName, "Types.").concat(language.extension), types, function (err) {
        if (err)
            console.error(err);
    });
    fs.writeFile("./".concat(fileName, "Values.").concat(language.extension), instances, function (err) {
        if (err)
            console.error(err);
    });
};
var supportedLanguages = [new SwiftLanguage_1.SwiftLanguage(), new KotlinLanguage_1.KotlinLanguage()];
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
    transpileTo(language, json, filename, 'com.b_labs.fiber_tokens');
    structOccurrencesByName = {};
    instanceStructsSet = new Types_1.StructsSet([]);
});
