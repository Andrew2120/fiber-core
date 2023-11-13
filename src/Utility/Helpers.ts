import { Property, PropertyValue, TypeData, InstanceData } from '../Struct';
import { RGBAColor, TokenValueType } from './Types';

export const indentStatements = (
  statements: String[],
  numberOfIndentations: number,
  joiner: string = '\n'
): string => {
  const indentation = '    ';
  return statements.map(statement => indentation.repeat(numberOfIndentations) + statement).join(joiner);
};

export const indentMultilineString = (string: String, numberOfIndentations: number): string => {
  const indentation = '    ';
  return string
    .split('\n')
    .map(statement => indentation.repeat(numberOfIndentations) + statement)
    .join('\n');
};

/**
 * Checks if the object contains a value and it's type following the structure `{ value: any, type: string }`
 * @param {any}  object - The object that is to be checked
 * @returns {boolean} `true` if the object includes only two keys called `value` and `type` and the value of type
 * is a string, otherwise returns `false`.
 */
export const isWrappedValue = (object: any): boolean => {
  const objectKeys = Object.keys(object);
  return (
    objectKeys.length === 2 &&
    objectKeys.includes('value') &&
    objectKeys.includes('type') &&
    typeof object.type === 'string'
  );
};

export const isStruct = (object: any): boolean => {
  const objectKeys = Object.keys(object);
  return (
    objectKeys.length === 3 &&
    objectKeys.includes('accessModifier') &&
    objectKeys.includes('name') &&
    objectKeys.includes('properties')
  );
};

export const isHexColor = (color: string): boolean => {
  const hexColorRegex = /^#?([0-9A-F]{3}|[0-9A-F]{4}|[0-9A-F]{6}|[0-9A-F]{8})$/i;
  return hexColorRegex.test(color);
};

export const convertToCamelCase = (str: string): string => {
  // Check if the string is empty or not a string
  if (typeof str !== 'string' || str.length === 0) return '';

  if (!(str.includes('_') || str.includes('-'))) return str;

  // Split the string by underscore or hyphen
  const words = str.split(/[_-]/);

  // Capitalize the first letter of each word except the first word
  const camelCaseWords = words.map((word, index) => {
    return index === 0 ? lowerCaseFirstLetter(word) : capitalizeFirstLetter(word);
  });

  // Join the words together
  return camelCaseWords.join('');
};

export const getPropertySignature = (property: Property): string => {
  return `${property.name}${property.type}`;
};

export const getStructSignature = (struct: TypeData): string => {
  const sortedProperties = struct.properties.sort((p1, p2) => p2.name.localeCompare(p1.name));
  return sortedProperties.map(property => getPropertySignature(property)).join('') + struct.name;
};

export const replaceKeysWithValuesIn = (str: string, map: object): string => {
  Object.keys(map).forEach(key => (str = str.replace(key, map[key])));
  return str;
};

export const capitalizeFirstLetter = (str: string): string => {
  return str.charAt(0).toUpperCase() + str.slice(1);
};

export const lowerCaseFirstLetter = (str: string): string => {
  return str.charAt(0).toLowerCase() + str.slice(1);
};

export const getPropertyName = (key: string, originalStructName: string, jsonKeyMap: object) => {
  let modifiedKey = replaceKeysWithValuesIn(key, jsonKeyMap);
  let propertyName = convertToCamelCase(modifiedKey);

  const propertyNameStartsWithStructName = propertyName
    .toLowerCase()
    .startsWith(originalStructName.toLocaleLowerCase());
  const propertyNameEqualsStructName = propertyName.toLowerCase() === originalStructName.toLowerCase();
  const propertyNameContainsNumber = !Number.isNaN(parseFloat(propertyName.replace(originalStructName, '')));

  if (propertyNameStartsWithStructName && !propertyNameEqualsStructName && !propertyNameContainsNumber)
    propertyName = lowerCaseFirstLetter(propertyName.replace(originalStructName, ''));
  return propertyName;
};

export const getStructInstanceOf = (struct: TypeData): InstanceData => {
  const propertyValues: PropertyValue[] = struct.properties
    .filter(property => !property.hasDefaultValue)
    .map(property => {
      return {
        name: property.name,
        zNameInObject: property.zNameInObject,
        type: property.type,
        value: property.value,
      };
    });

  return { struct, propertyValues };
};

export const getObjectSignature = obj => {
  let sortedKeys = Object.keys(obj).sort((a, b) => b.localeCompare(a));
  let values = sortedKeys.map(key => obj[key]);
  let valueTypes = values.map(value => {
    if (typeof value === 'object') return getObjectSignature(value);
    return typeof value;
  });

  return sortedKeys.join('') + valueTypes.join('');
};

/** Converts the abbreviated hex string to the non abbreviated with two characters for each color or alpha */
const spreadHexColorStringToFullForm = (hexString: string) => {
  if (hexString.length === 3 || hexString.length === 4) {
    const spreadHexString = Array.from(hexString)
      .map(character => character + character)
      .join('');

    return spreadHexString;
  }

  return hexString;
};

export const convertHexColorStringToRGBAColor = (hexString: string): RGBAColor => {
  hexString = hexString.replace('#', '');
  const spreadHexString = spreadHexColorStringToFullForm(hexString);
  const hexNumbers = spreadHexString.match(/.{2}/g);
  const [hexRed, hexGreen, hexBlue, hexAlpha] = hexNumbers;

  const hexadecimalBase = 16;

  const rgbaColor: RGBAColor = {
    red: parseInt(hexRed, hexadecimalBase),
    green: parseInt(hexGreen, hexadecimalBase),
    blue: parseInt(hexBlue, hexadecimalBase),
    alpha: parseInt(hexAlpha, hexadecimalBase) || 255,
  };

  return rgbaColor;
};

/**
 * Converts a string path to a value that is existing in a json object.
 *
 * @param {Object} jsonData Json data to use for searching the value.
 * @param {Object} path the path to use to find the value.
 * @returns {valueOfThePath|null}
 */
export const jsonPathToValue = (jsonData, path) => {
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
