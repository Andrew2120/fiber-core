"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getStructInstanceOf = exports.getValueAndTypeFrom = exports.getValueAndTypeFromWrappedValue = exports.getPropertyName = exports.lowerCaseFirstLetter = exports.capitalizeFirstLetter = exports.replaceKeysWithValuesIn = exports.getStructSignature = exports.getPropertySignature = exports.convertToCamelCase = exports.isHexColor = exports.isStruct = exports.isWrappedValue = exports.indentStatements = void 0;
var indentStatements = function (statements, numberOfIndentations, joiner) {
    if (joiner === void 0) { joiner = '\n'; }
    var indentation = '    ';
    return statements.map(function (statement) { return indentation.repeat(numberOfIndentations) + statement; }).join(joiner);
};
exports.indentStatements = indentStatements;
/**
 * Checks if the object contains a value and it's type following the structure `{ value: any, type: string }`
 * @param {any}  object - The object that is to be checked
 * @returns {boolean} `true` if the object includes only two keys called `value` and `type` and the value of type
 * is a string, otherwise returns `false`.
 */
var isWrappedValue = function (object) {
    var objectKeys = Object.keys(object);
    return (objectKeys.length === 2 &&
        objectKeys.includes('value') &&
        objectKeys.includes('type') &&
        typeof object.type === 'string');
};
exports.isWrappedValue = isWrappedValue;
var isStruct = function (object) {
    var objectKeys = Object.keys(object);
    return (objectKeys.length === 3 &&
        objectKeys.includes('accessModifier') &&
        objectKeys.includes('name') &&
        objectKeys.includes('properties'));
};
exports.isStruct = isStruct;
var isHexColor = function (color) {
    var hexColorRegex = /^#?([0-9A-F]{3}|[0-9A-F]{4}|[0-9A-F]{6}|[0-9A-F]{8})$/i;
    return hexColorRegex.test(color);
};
exports.isHexColor = isHexColor;
var convertToCamelCase = function (str) {
    // Check if the string is empty or not a string
    if (typeof str !== 'string' || str.length === 0)
        return '';
    if (!(str.includes('_') || str.includes('-')))
        return str;
    // Split the string by underscore or hyphen
    var words = str.split(/[_-]/);
    // Capitalize the first letter of each word except the first word
    var camelCaseWords = words.map(function (word, index) {
        return index === 0 ? (0, exports.lowerCaseFirstLetter)(word) : (0, exports.capitalizeFirstLetter)(word);
    });
    // Join the words together
    return camelCaseWords.join('');
};
exports.convertToCamelCase = convertToCamelCase;
var getPropertySignature = function (property) {
    return "".concat(property.name).concat(property.type);
};
exports.getPropertySignature = getPropertySignature;
var getStructSignature = function (struct) {
    var sortedProperties = struct.properties.sort(function (p1, p2) { return p2.name.localeCompare(p1.name); });
    return sortedProperties.map(function (property) { return (0, exports.getPropertySignature)(property); }).join('');
};
exports.getStructSignature = getStructSignature;
var replaceKeysWithValuesIn = function (str, map) {
    Object.keys(map).forEach(function (key) { return (str = str.replace(key, map[key])); });
    return str;
};
exports.replaceKeysWithValuesIn = replaceKeysWithValuesIn;
var capitalizeFirstLetter = function (str) {
    return str.charAt(0).toUpperCase() + str.slice(1);
};
exports.capitalizeFirstLetter = capitalizeFirstLetter;
var lowerCaseFirstLetter = function (str) {
    return str.charAt(0).toLowerCase() + str.slice(1);
};
exports.lowerCaseFirstLetter = lowerCaseFirstLetter;
var getPropertyName = function (key, originalStructName, jsonKeyMap) {
    var modifiedKey = (0, exports.replaceKeysWithValuesIn)(key, jsonKeyMap);
    var propertyName = (0, exports.convertToCamelCase)(modifiedKey);
    var propertyNameStartsWithStructName = propertyName
        .toLowerCase()
        .startsWith(originalStructName.toLocaleLowerCase());
    var propertyNameEqualsStructName = propertyName.toLowerCase() === originalStructName.toLowerCase();
    var propertyNameContainsNumber = !Number.isNaN(parseFloat(propertyName.replace(originalStructName, '')));
    if (propertyNameStartsWithStructName && !propertyNameEqualsStructName && !propertyNameContainsNumber)
        propertyName = (0, exports.lowerCaseFirstLetter)(propertyName.replace(originalStructName, ''));
    return propertyName;
};
exports.getPropertyName = getPropertyName;
var getValueAndTypeFromWrappedValue = function (wrappedValue, mapOfUnits) {
    if (!(0, exports.isWrappedValue)(wrappedValue))
        throw new Error("Cannot extract the wrapped value from\n".concat(wrappedValue));
    var value = wrappedValue.value, type = wrappedValue.type;
    if (type === 'color') {
        // if (!isHexColor(wrappedValue)) throw new Error(`Unexpected string ${value}, expected a hexadecimal color`);
        return { value: value, type: 'color' };
    }
    if (typeof value === 'string') {
        var units = Object.keys(mapOfUnits);
        for (var index = 0; index < units.length; index++) {
            var unit = units[index];
            var _a = mapOfUnits[unit], type_1 = _a.type, unitConverter = _a.converter;
            if (value.endsWith(unit))
                return { value: unitConverter(value), type: type_1 };
        }
        if (!isNaN(Number(value)))
            return { value: parseFloat(value), type: 'number' };
        return { value: value, type: 'string' };
    }
    if (typeof value === 'number')
        return { value: value, type: 'number' };
    if (Array.isArray(value)) {
        return { value: value, type: "".concat((0, exports.capitalizeFirstLetter)(type), "-array") };
    }
    if (typeof value === 'object')
        return { value: value, type: "".concat((0, exports.capitalizeFirstLetter)(type), "-object") };
};
exports.getValueAndTypeFromWrappedValue = getValueAndTypeFromWrappedValue;
var getValueAndTypeFrom = function (value, mapOfUnits) {
    if (typeof value === 'string') {
        var units = Object.keys(mapOfUnits);
        for (var index = 0; index < units.length; index++) {
            var unit = units[index];
            var _a = mapOfUnits[unit], type = _a.type, unitConverter = _a.converter;
            if (value.endsWith(unit))
                return { value: unitConverter(value), type: type };
        }
        if (!isNaN(Number(value)))
            return { value: parseFloat(value), type: 'number' };
        return { value: value, type: 'string' };
    }
    if (typeof value === 'number')
        return { value: value.toString(), type: 'number' };
    if (Array.isArray(value))
        return { value: value, type: 'array' };
    if (typeof value === 'object') {
        if ((0, exports.isWrappedValue)(value)) {
            var _b = (0, exports.getValueAndTypeFromWrappedValue)(value, mapOfUnits), wrappedValue = _b.value, wrappedValueType = _b.type;
            return { value: wrappedValue, type: wrappedValueType };
        }
        return { value: value, type: 'valueContainerObject' };
    }
};
exports.getValueAndTypeFrom = getValueAndTypeFrom;
var getStructInstanceOf = function (struct) {
    var propertyValues = struct.properties
        .filter(function (property) { return !property.hasDefaultValue; })
        .map(function (property) {
        return { name: property.name, type: property.type, value: property.value };
    });
    return { struct: struct, propertyValues: propertyValues };
};
exports.getStructInstanceOf = getStructInstanceOf;
