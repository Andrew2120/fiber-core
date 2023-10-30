"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getStructInstanceOf = exports.getValueAndTypeFrom = exports.getValueAndTypeFromWrappedValue = exports.getPropertyName = exports.lowerCaseFirstLetter = exports.capitalizeFirstLetter = exports.replaceKeysWithValuesIn = exports.getStructSignature = exports.getPropertySignature = exports.convertToCamelCase = exports.isHexColor = exports.isStruct = exports.isWrappedValue = exports.indentMultilineString = exports.indentStatements = void 0;
const indentStatements = (statements, numberOfIndentations, joiner = '\n') => {
    const indentation = '    ';
    return statements.map(statement => indentation.repeat(numberOfIndentations) + statement).join(joiner);
};
exports.indentStatements = indentStatements;
const indentMultilineString = (string, numberOfIndentations) => {
    const indentation = '    ';
    return string
        .split('\n')
        .map(statement => indentation.repeat(numberOfIndentations) + statement)
        .join('\n');
};
exports.indentMultilineString = indentMultilineString;
/**
 * Checks if the object contains a value and it's type following the structure `{ value: any, type: string }`
 * @param {any}  object - The object that is to be checked
 * @returns {boolean} `true` if the object includes only two keys called `value` and `type` and the value of type
 * is a string, otherwise returns `false`.
 */
const isWrappedValue = (object) => {
    const objectKeys = Object.keys(object);
    return (objectKeys.length === 2 &&
        objectKeys.includes('value') &&
        objectKeys.includes('type') &&
        typeof object.type === 'string');
};
exports.isWrappedValue = isWrappedValue;
const isStruct = (object) => {
    const objectKeys = Object.keys(object);
    return (objectKeys.length === 3 &&
        objectKeys.includes('accessModifier') &&
        objectKeys.includes('name') &&
        objectKeys.includes('properties'));
};
exports.isStruct = isStruct;
const isHexColor = (color) => {
    const hexColorRegex = /^#?([0-9A-F]{3}|[0-9A-F]{4}|[0-9A-F]{6}|[0-9A-F]{8})$/i;
    return hexColorRegex.test(color);
};
exports.isHexColor = isHexColor;
const convertToCamelCase = (str) => {
    // Check if the string is empty or not a string
    if (typeof str !== 'string' || str.length === 0)
        return '';
    if (!(str.includes('_') || str.includes('-')))
        return str;
    // Split the string by underscore or hyphen
    const words = str.split(/[_-]/);
    // Capitalize the first letter of each word except the first word
    const camelCaseWords = words.map((word, index) => {
        return index === 0 ? (0, exports.lowerCaseFirstLetter)(word) : (0, exports.capitalizeFirstLetter)(word);
    });
    // Join the words together
    return camelCaseWords.join('');
};
exports.convertToCamelCase = convertToCamelCase;
const getPropertySignature = (property) => {
    return `${property.name}${property.type}`;
};
exports.getPropertySignature = getPropertySignature;
const getStructSignature = (struct) => {
    const sortedProperties = struct.properties.sort((p1, p2) => p2.name.localeCompare(p1.name));
    return sortedProperties.map(property => (0, exports.getPropertySignature)(property)).join('');
};
exports.getStructSignature = getStructSignature;
const replaceKeysWithValuesIn = (str, map) => {
    Object.keys(map).forEach(key => (str = str.replace(key, map[key])));
    return str;
};
exports.replaceKeysWithValuesIn = replaceKeysWithValuesIn;
const capitalizeFirstLetter = (str) => {
    return str.charAt(0).toUpperCase() + str.slice(1);
};
exports.capitalizeFirstLetter = capitalizeFirstLetter;
const lowerCaseFirstLetter = (str) => {
    return str.charAt(0).toLowerCase() + str.slice(1);
};
exports.lowerCaseFirstLetter = lowerCaseFirstLetter;
const getPropertyName = (key, originalStructName, jsonKeyMap) => {
    let modifiedKey = (0, exports.replaceKeysWithValuesIn)(key, jsonKeyMap);
    let propertyName = (0, exports.convertToCamelCase)(modifiedKey);
    const propertyNameStartsWithStructName = propertyName
        .toLowerCase()
        .startsWith(originalStructName.toLocaleLowerCase());
    const propertyNameEqualsStructName = propertyName.toLowerCase() === originalStructName.toLowerCase();
    const propertyNameContainsNumber = !Number.isNaN(parseFloat(propertyName.replace(originalStructName, '')));
    if (propertyNameStartsWithStructName && !propertyNameEqualsStructName && !propertyNameContainsNumber)
        propertyName = (0, exports.lowerCaseFirstLetter)(propertyName.replace(originalStructName, ''));
    return propertyName;
};
exports.getPropertyName = getPropertyName;
const getValueAndTypeFromWrappedValue = (wrappedValue, mapOfUnits) => {
    if (!(0, exports.isWrappedValue)(wrappedValue))
        throw new Error(`Cannot extract the wrapped value from\n${wrappedValue}`);
    const { value, type } = wrappedValue;
    if (type === 'color') {
        // if (!isHexColor(wrappedValue)) throw new Error(`Unexpected string ${value}, expected a hexadecimal color`);
        return { value, type: 'color' };
    }
    if (typeof value === 'string') {
        const units = Object.keys(mapOfUnits);
        for (let index = 0; index < units.length; index++) {
            const unit = units[index];
            const { type, converter: unitConverter } = mapOfUnits[unit];
            if (value.endsWith(unit))
                return { value: unitConverter(value), type: type };
        }
        if (!isNaN(Number(value)))
            return { value: parseFloat(value), type: 'number' };
        return { value, type: 'string' };
    }
    if (typeof value === 'number')
        return { value, type: 'number' };
    if (Array.isArray(value)) {
        return { value: value, type: `${(0, exports.capitalizeFirstLetter)(type)}-array` };
    }
    if (typeof value === 'object')
        return { value, type: `${(0, exports.capitalizeFirstLetter)(type)}-object` };
};
exports.getValueAndTypeFromWrappedValue = getValueAndTypeFromWrappedValue;
const getValueAndTypeFrom = (value, mapOfUnits) => {
    if (typeof value === 'string') {
        const units = Object.keys(mapOfUnits);
        for (let index = 0; index < units.length; index++) {
            const unit = units[index];
            const { type, converter: unitConverter } = mapOfUnits[unit];
            if (value.endsWith(unit))
                return { value: unitConverter(value), type: type };
        }
        if (!isNaN(Number(value)))
            return { value: parseFloat(value), type: 'number' };
        return { value, type: 'string' };
    }
    if (typeof value === 'number')
        return { value: value.toString(), type: 'number' };
    if (Array.isArray(value))
        return { value: value, type: 'array' };
    if (typeof value === 'object') {
        if ((0, exports.isWrappedValue)(value)) {
            const { value: wrappedValue, type: wrappedValueType } = (0, exports.getValueAndTypeFromWrappedValue)(value, mapOfUnits);
            return { value: wrappedValue, type: wrappedValueType };
        }
        return { value: value, type: 'valueContainerObject' };
    }
};
exports.getValueAndTypeFrom = getValueAndTypeFrom;
const getStructInstanceOf = (struct) => {
    const propertyValues = struct.properties
        .filter(property => !property.hasDefaultValue)
        .map(property => {
        return { name: property.name, type: property.type, value: property.value };
    });
    return { struct, propertyValues };
};
exports.getStructInstanceOf = getStructInstanceOf;
