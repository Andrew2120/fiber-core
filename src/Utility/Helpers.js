'use strict';
Object.defineProperty(exports, '__esModule', { value: true });
exports.jsonPathToValue =
  exports.convertHexColorStringToRGBAColor =
  exports.getObjectSignature =
  exports.getStructInstanceOf =
  exports.getPropertyName =
  exports.lowerCaseFirstLetter =
  exports.capitalizeFirstLetter =
  exports.replaceKeysWithValuesIn =
  exports.getStructSignature =
  exports.getPropertySignature =
  exports.convertToCamelCase =
  exports.isHexColor =
  exports.isStruct =
  exports.isWrappedValue =
  exports.indentMultilineString =
  exports.indentStatements =
    void 0;
var indentStatements = function (statements, numberOfIndentations, joiner) {
  if (joiner === void 0) {
    joiner = '\n';
  }
  var indentation = '    ';
  return statements
    .map(function (statement) {
      return indentation.repeat(numberOfIndentations) + statement;
    })
    .join(joiner);
};
exports.indentStatements = indentStatements;
var indentMultilineString = function (string, numberOfIndentations) {
  var indentation = '    ';
  return string
    .split('\n')
    .map(function (statement) {
      return indentation.repeat(numberOfIndentations) + statement;
    })
    .join('\n');
};
exports.indentMultilineString = indentMultilineString;
/**
 * Checks if the object contains a value and it's type following the structure `{ value: any, type: string }`
 * @param {any}  object - The object that is to be checked
 * @returns {boolean} `true` if the object includes only two keys called `value` and `type` and the value of type
 * is a string, otherwise returns `false`.
 */
var isWrappedValue = function (object) {
  var objectKeys = Object.keys(object);
  return (
    objectKeys.length === 2 &&
    objectKeys.includes('value') &&
    objectKeys.includes('type') &&
    typeof object.type === 'string'
  );
};
exports.isWrappedValue = isWrappedValue;
var isStruct = function (object) {
  var objectKeys = Object.keys(object);
  return (
    objectKeys.length === 3 &&
    objectKeys.includes('accessModifier') &&
    objectKeys.includes('name') &&
    objectKeys.includes('properties')
  );
};
exports.isStruct = isStruct;
var isHexColor = function (color) {
  var hexColorRegex = /^#?([0-9A-F]{3}|[0-9A-F]{4}|[0-9A-F]{6}|[0-9A-F]{8})$/i;
  return hexColorRegex.test(color);
};
exports.isHexColor = isHexColor;
var convertToCamelCase = function (str) {
  // Check if the string is empty or not a string
  if (typeof str !== 'string' || str.length === 0) return '';
  if (!(str.includes('_') || str.includes('-'))) return str;
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
  return ''.concat(property.name).concat(property.type);
};
exports.getPropertySignature = getPropertySignature;
var getStructSignature = function (struct) {
  var sortedProperties = struct.properties.sort(function (p1, p2) {
    return p2.name.localeCompare(p1.name);
  });
  return (
    sortedProperties
      .map(function (property) {
        return (0, exports.getPropertySignature)(property);
      })
      .join('') + struct.name
  );
};
exports.getStructSignature = getStructSignature;
var replaceKeysWithValuesIn = function (str, map) {
  Object.keys(map).forEach(function (key) {
    return (str = str.replace(key, map[key]));
  });
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
var getStructInstanceOf = function (struct) {
  var propertyValues = struct.properties
    .filter(function (property) {
      return !property.hasDefaultValue;
    })
    .map(function (property) {
      return {
        name: property.name,
        zNameInObject: property.zNameInObject,
        type: property.type,
        value: property.value,
      };
    });
  return { struct: struct, propertyValues: propertyValues };
};
exports.getStructInstanceOf = getStructInstanceOf;
var getObjectSignature = function (obj) {
  var sortedKeys = Object.keys(obj).sort(function (a, b) {
    return b.localeCompare(a);
  });
  var values = sortedKeys.map(function (key) {
    return obj[key];
  });
  var valueTypes = values.map(function (value) {
    if (typeof value === 'object') return (0, exports.getObjectSignature)(value);
    return typeof value;
  });
  return sortedKeys.join('') + valueTypes.join('');
};
exports.getObjectSignature = getObjectSignature;
/** Converts the abbreviated hex string to the non abbreviated with two characters for each color or alpha */
var spreadHexColorStringToFullForm = function (hexString) {
  if (hexString.length === 3 || hexString.length === 4) {
    var spreadHexString = Array.from(hexString)
      .map(function (character) {
        return character + character;
      })
      .join('');
    return spreadHexString;
  }
  return hexString;
};
var convertHexColorStringToRGBAColor = function (hexString) {
  hexString = hexString.replace('#', '');
  var spreadHexString = spreadHexColorStringToFullForm(hexString);
  var hexNumbers = spreadHexString.match(/.{2}/g);
  var hexRed = hexNumbers[0],
    hexGreen = hexNumbers[1],
    hexBlue = hexNumbers[2],
    hexAlpha = hexNumbers[3];
  var hexadecimalBase = 16;
  var rgbaColor = {
    red: parseInt(hexRed, hexadecimalBase),
    green: parseInt(hexGreen, hexadecimalBase),
    blue: parseInt(hexBlue, hexadecimalBase),
    alpha: parseInt(hexAlpha, hexadecimalBase) || 255,
  };
  return rgbaColor;
};
exports.convertHexColorStringToRGBAColor = convertHexColorStringToRGBAColor;
/**
 * Converts a string path to a value that is existing in a json object.
 *
 * @param {Object} jsonData Json data to use for searching the value.
 * @param {Object} path the path to use to find the value.
 * @returns {valueOfThePath|null}
 */
var jsonPathToValue = function (jsonData, path) {
  if (!(jsonData instanceof Object) || typeof path === 'undefined') {
    throw 'Not valid argument:jsonData:' + jsonData + ', path:' + path;
  }
  path = path.replace(/\[(\w+)\]/g, '.$1'); // convert indexes to properties
  path = path.replace(/^\./, ''); // strip a leading dot
  var pathArray = path.split('.');
  for (var i = 0, n = pathArray.length; i < n; ++i) {
    var key = pathArray[i];
    if (key in jsonData) {
      if (jsonData[key] !== null) {
        jsonData = jsonData[key];
      } else {
        return null;
      }
    } else {
      return key;
    }
  }
  return jsonData;
};
exports.jsonPathToValue = jsonPathToValue;
