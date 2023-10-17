import { Property, PropertyValue, Struct, StructInstance } from '../Struct';
import { TokenValueType } from './Types';

export const indentStatements = (statements: String[], numberOfIndentations: number): string => {
  const indentation = '    ';
  return statements.map(statement => indentation.repeat(numberOfIndentations) + statement).join('\n');
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

export const getStructSignature = (struct: Struct): string => {
  const sortedProperties = struct.properties.sort((p1, p2) => p2.name.localeCompare(p1.name));
  return sortedProperties.map(property => getPropertySignature(property)).join('');
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

export const getValueAndTypeFromWrappedValue = (
  wrappedValue: any,
  mapOfUnits: object
): { value: any; type: TokenValueType } => {
  if (!isWrappedValue(wrappedValue)) throw new Error(`Cannot extract the wrapped value from\n${wrappedValue}`);

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
      if (value.endsWith(unit)) return { value: unitConverter(value), type: type };
    }

    if (!isNaN(Number(value))) return { value: parseFloat(value), type: 'number' };

    return { value, type: 'string' };
  }

  if (typeof value === 'number') return { value, type: 'number' };

  if (Array.isArray(value)) {
    return { value: value, type: `${capitalizeFirstLetter(type)}-array` };
  }

  if (typeof value === 'object') return { value, type: `${capitalizeFirstLetter(type)}-object` };
};

export const getValueAndTypeFrom = (value: any, mapOfUnits: object): { value: any; type: TokenValueType } => {
  if (typeof value === 'string') {
    const units = Object.keys(mapOfUnits);
    for (let index = 0; index < units.length; index++) {
      const unit = units[index];
      const { type, converter: unitConverter } = mapOfUnits[unit];
      if (value.endsWith(unit)) return { value: unitConverter(value), type: type };
    }

    if (!isNaN(Number(value))) return { value: parseFloat(value), type: 'number' };

    return { value, type: 'string' };
  }

  if (typeof value === 'number') return { value: value.toString(), type: 'number' };

  if (Array.isArray(value)) return { value: value, type: 'array' };

  if (typeof value === 'object') {
    if (isWrappedValue(value)) {
      const { value: wrappedValue, type: wrappedValueType } = getValueAndTypeFromWrappedValue(value, mapOfUnits);
      return { value: wrappedValue, type: wrappedValueType };
    }

    return { value: value, type: 'valueContainerObject' };
  }
};

export const getStructInstanceOf = (struct: Struct): StructInstance => {
  const propertyValues: PropertyValue[] = struct.properties
    .filter(property => !property.hasDefaultValue)
    .map(property => {
      return { name: property.name, type: property.type, value: property.value };
    });

  return { struct, propertyValues };
};
