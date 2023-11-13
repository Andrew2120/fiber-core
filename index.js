'use strict';
var __assign =
  (this && this.__assign) ||
  function () {
    __assign =
      Object.assign ||
      function (t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
          s = arguments[i];
          for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p)) t[p] = s[p];
        }
        return t;
      };
    return __assign.apply(this, arguments);
  };
var __spreadArray =
  (this && this.__spreadArray) ||
  function (to, from, pack) {
    if (pack || arguments.length === 2)
      for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
          if (!ar) ar = Array.prototype.slice.call(from, 0, i);
          ar[i] = from[i];
        }
      }
    return to.concat(ar || Array.prototype.slice.call(from));
  };
Object.defineProperty(exports, '__esModule', { value: true });
var SwiftLanguage_1 = require('./src/Languages/SwiftLanguage');
var fs = require('fs');
var Types_1 = require('./src/Utility/Types');
var Helpers_1 = require('./src/Utility/Helpers');
var Config_1 = require('./src/Config');
var kotlinLanguage_1 = require('./src/Languages/kotlinLanguage');
var JavaScriptLanguage_1 = require('./src/Languages/JavaScriptLanguage');
var args = process.argv.slice(2);
var tokensFilePath = args[0];
var packageName = args.pop();
var languageFiles = args.slice(1);
var lightJsonFilePath = './light.json';
var darkJsonFilePath = './dark.json';
var execSync = require('child_process').execSync;
execSync(
  'npx token-transformer '
    .concat(tokensFilePath, ' ')
    .concat(lightJsonFilePath, ' global,alias,component/light global'),
  {
    encoding: 'utf-8',
  }
);
execSync(
  'npx token-transformer '
    .concat(tokensFilePath, ' ')
    .concat(darkJsonFilePath, ' global,alias,component/dark global'),
  {
    encoding: 'utf-8',
  }
);
var accessModifier = 'public';
var structOccurrencesByName = {};
var instanceStructsSet = new Types_1.StructsSet([]);
var generatedObjectSignatures = [];
var extractLightThemeAndDarkThemeColors = false;
var pathInObject = new Types_1.ObjectPath();
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
var getStructFrom = function (
  object,
  name,
  isStatic,
  propertiesHaveDefaultValues,
  originalStructName,
  isRootObject,
  duplicateLightAndDarkColorProperty
) {
  if (duplicateLightAndDarkColorProperty === void 0) {
    duplicateLightAndDarkColorProperty = false;
  }
  var properties = [];
  Object.keys(object).forEach(function (key) {
    pathInObject.push(key);
    var _a = getValueAndTypeFrom(object[key], Config_1.mapOfUnits),
      value = _a.value,
      type = _a.type;
    var propertyName = (0, Helpers_1.getPropertyName)(key, originalStructName, Config_1.jsonKeyMap);
    var property = {
      accessModifier: accessModifier,
      isStatic: isStatic,
      hasDefaultValue: propertiesHaveDefaultValues,
      isConstant: true,
      zNameInObject: key,
      name: propertyName,
    };
    if (type.endsWith('-array')) {
      var structInstances = value.map(function (element) {
        var structName = type.replace('-array', '');
        pathInObject.pop();
        return getStructInstance(structName, element);
      });
      properties.push(__assign(__assign({}, property), { type: type, value: structInstances }));
      pathInObject.pop();
      return;
    }
    if (type.endsWith('-object')) {
      var structName = (0, Helpers_1.capitalizeFirstLetter)(type.replace('-object', ''));
      var structInstance_1 = getStructInstance(structName, value);
      properties.push(__assign(__assign({}, property), { type: type, value: structInstance_1 }));
      pathInObject.pop();
      return;
    }
    if (type === 'valueContainerObject') {
      var structName = propertyName;
      var structInstance = getStaticStruct(structName, value);
      if (isRootObject) {
        if (propertyName == 'color' && duplicateLightAndDarkColorProperty) {
          var darkStructInstance = overrideValues(darkJson.color, structInstance);
          property.name = 'colorLight';
          property.accessModifier = 'private';
          properties.push(
            __assign(__assign({}, property), { name: 'colorDark', type: type, value: darkStructInstance })
          );
        }
      }
      properties.push(__assign(__assign({}, property), { type: type, value: structInstance }));
      pathInObject.pop();
      return;
    }
    properties.push(__assign(__assign({}, property), { type: type, value: value }));
    pathInObject.pop();
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
  } else {
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
  var duplicateLightAndDarkColorProperty = language.extension === 'kt';
  var struct = getStructFrom(
    json,
    structName,
    isStatic,
    propertiesHaveDefaultValues,
    structName,
    true,
    duplicateLightAndDarkColorProperty
  );
  var isDarkProperty = {
    accessModifier: accessModifier,
    isStatic: isStatic,
    hasDefaultValue: true,
    isConstant: false,
    zNameInObject: 'isDarkTheme',
    name: 'isDarkTheme',
    type: 'boolean',
    value: 'false',
  };
  if (language.extension === 'kt') {
    var colorComputedProperty = {
      accessModifier: accessModifier,
      isStatic: isStatic,
      hasDefaultValue: true,
      isConstant: false,
      zNameInObject: 'color',
      name: 'color',
      type: 'color-computedProperty',
      value: 'if (isDarkTheme) colorDark else colorLight',
    };
    struct.computedProperties = [colorComputedProperty];
  }
  struct.properties = __spreadArray([isDarkProperty], struct.properties, true);
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
    zNameInObject: '',
    name: (0, Helpers_1.lowerCaseFirstLetter)(structName),
    type: ''.concat(struct.name, '-object'),
    value: rootStructInstance,
  };
  var rootStructInstanceDeceleration = language.generateDecelerationStatement(declaration);
  var instanceImportStatements = language.importStatements;
  var typesImportStatements = language.importStatements;
  if (language.extension === 'kt') {
    typesImportStatements = 'package com.b_labs.fiber_tokens\n' + language.importStatements;
    var packageDeclaration = 'package com.b_labs.' + packageName;
    var typesNames = __spreadArray(
      [struct.name],
      instanceStructsSet.values().map(function (struct) {
        return struct.name;
      }),
      true
    );
    instanceImportStatements = packageDeclaration + '\n' + instanceImportStatements;
    instanceImportStatements +=
      '\n' +
      typesNames
        .map(function (typeName) {
          return 'import ' + importPath + '.'.concat(typeName);
        })
        .join('\n');
  } else if (language.extension === 'swift') {
    instanceImportStatements = instanceImportStatements + '\nimport FiberCore';
  }
  return {
    types: __spreadArray([typesImportStatements, rootStructDeceleration], instanceStructDeceleration, true).join(
      '\n\n'
    ),
    instances: [instanceImportStatements, rootStructInstanceDeceleration].join('\n\n'),
  };
};
var transpileTo = function (language, lightJson, darkJson, fileName, importPath) {
  if (language.name === 'javascript') {
    var jsLanguage = language;
    var content = jsLanguage.generateThemeData(lightJson);
    fs.writeFile('./'.concat(fileName, '.').concat(jsLanguage.extension), content, function (err) {
      if (err) console.error(err);
    });
  } else {
    extractLightThemeAndDarkThemeColors = language.extension === 'swift';
    var _a = generateSourceCodeDecelerationOf(lightJson, language, fileName, importPath),
      types = _a.types,
      instances = _a.instances;
    fs.writeFile('./'.concat(fileName, 'Types.').concat(language.extension), types, function (err) {
      if (err) console.error(err);
    });
    fs.writeFile('./'.concat(fileName, 'Values.').concat(language.extension), instances, function (err) {
      if (err) console.error(err);
    });
    if (language.extension == 'swift') {
      // (language as Language).generatedFolders.forEach(folder => folder.generate());
    }
  }
};
var supportedLanguages = [
  new SwiftLanguage_1.SwiftLanguage(),
  new kotlinLanguage_1.KotlinLanguage(),
  new JavaScriptLanguage_1.JavaScriptLanguage(),
];
var getLanguageWithExtension = function (extension, listOfLanguages) {
  for (var index = 0; index < listOfLanguages.length; index++) {
    var language = listOfLanguages[index];
    if (language.extension === extension) return language;
  }
  console.error('Language is with extension '.concat(extension, ' is not supported'));
};
var darkJson = require(darkJsonFilePath);
var lightJson = require(lightJsonFilePath);
languageFiles.forEach(function (languageFile) {
  var _a = languageFile.split('.'),
    filename = _a[0],
    extension = _a[1];
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
    var patternWithNameInObject = '"name":"'.concat(
      propertyName,
      '","zNameInObject":"[a-zA-Z0-9]+","type":"color","value":"#([0-9A-Fa-f]{3,4}|[0-9A-Fa-f]{6}|[0-9A-Fa-f]{8})"'
    );
    var patternWithoutNameInObject = '"name":"'.concat(
      propertyName,
      '","type":"color","value":"#([0-9A-Fa-f]{3,4}|[0-9A-Fa-f]{6}|[0-9A-Fa-f]{8})"'
    );
    var regexWithNameInObject = new RegExp(patternWithNameInObject, 'g');
    var regexWithoutNameInObject = new RegExp(patternWithoutNameInObject, 'g');
    var matches = stringifiedColorProperty.match(regexWithNameInObject);
    console.log('{'.concat(matches[0], '}'));
    // let originalNameInObject = JSON.parse(`{${matches[0]}}`).zNameInObject;
    // stringifiedColorProperty = stringifiedColorProperty.replace(
    //   regexWithNameInObject,
    //   `"name":"${propertyName}","zNameInObject":"${originalNameInObject}","type":"color","value":"${value}"`
    // );
    // stringifiedColorProperty = stringifiedColorProperty.replace(
    //   regexWithoutNameInObject,
    //   `"name":"${propertyName}","type":"color","value":"${value}"`
    // );
    // if (propertyName === 'primary') {
    //   console.log(`"name":"${propertyName}","type":"color","value":"${value}"`);
    //   fs.writeFileSync('test.json', stringifiedColorProperty);
    // }
  });
  return JSON.parse(stringifiedColorProperty);
}
function appendValues(json, colorProperty) {
  var allColorValues = getAllColorValuesIn(json);
  var stringifiedColorProperty = JSON.stringify(colorProperty);
  Object.keys(allColorValues).forEach(function (propertyName) {
    var value = allColorValues[propertyName];
    var pattern = '"name":"'.concat(
      propertyName,
      '","type":"color","value":"#([0-9A-Fa-f]{3,4}|[0-9A-Fa-f]{6}|[0-9A-Fa-f]{8})"'
    );
    var regex = new RegExp(pattern, 'g');
    var matches = stringifiedColorProperty.match(regex);
    var originalValue = JSON.parse('{'.concat(matches[0], '}')).value;
    stringifiedColorProperty = stringifiedColorProperty.replace(
      regex,
      '"name":"'.concat(propertyName, '","type":"color","value":"').concat(originalValue + value, '"')
    );
  });
  return JSON.parse(stringifiedColorProperty);
}
function getAllColorValuesIn(obj, parentKey) {
  if (parentKey === void 0) {
    parentKey = '';
  }
  var colorValues = {};
  Object.keys(obj).forEach(function (key) {
    var value = obj[key];
    if (typeof value['value'] === 'string') {
      var propertyName = (0, Helpers_1.getPropertyName)(key, parentKey, Config_1.jsonKeyMap);
      colorValues[propertyName] = value['value'];
    } else {
      var childColorValues = getAllColorValuesIn(value, key);
      colorValues = __assign(__assign({}, colorValues), childColorValues);
    }
  });
  return colorValues;
}
function getValueAndTypeFromWrappedValue(wrappedValue, mapOfUnits) {
  if (!(0, Helpers_1.isWrappedValue)(wrappedValue))
    throw new Error('Cannot extract the wrapped value from\n'.concat(wrappedValue));
  var value = wrappedValue.value,
    type = wrappedValue.type;
  if (type === 'color') {
    var colorValue = value;
    if (extractLightThemeAndDarkThemeColors) {
      var darkThemeColor = (0, Helpers_1.jsonPathToValue)(darkJson, pathInObject.path() + '.value');
      colorValue += darkThemeColor;
    }
    return { value: colorValue, type: 'color' };
  }
  if (typeof value === 'string') {
    var units = Object.keys(mapOfUnits);
    for (var index = 0; index < units.length; index++) {
      var unit = units[index];
      var _a = mapOfUnits[unit],
        type_1 = _a.type,
        unitConverter = _a.converter;
      if (value.endsWith(unit)) return { value: unitConverter(value), type: type_1 };
    }
    if (!isNaN(Number(value))) return { value: parseFloat(value), type: 'number' };
    return { value: value, type: 'string' };
  }
  if (typeof value === 'number') return { value: value, type: 'number' };
  if (Array.isArray(value)) {
    return { value: value, type: ''.concat((0, Helpers_1.capitalizeFirstLetter)(type), '-array') };
  }
  if (typeof value === 'object')
    return { value: value, type: ''.concat((0, Helpers_1.capitalizeFirstLetter)(type), '-object') };
}
function getValueAndTypeFrom(value, mapOfUnits) {
  if (typeof value === 'string') {
    var units = Object.keys(mapOfUnits);
    for (var index = 0; index < units.length; index++) {
      var unit = units[index];
      var _a = mapOfUnits[unit],
        type = _a.type,
        unitConverter = _a.converter;
      if (value.endsWith(unit)) return { value: unitConverter(value), type: type };
    }
    if (!isNaN(Number(value))) return { value: parseFloat(value), type: 'number' };
    return { value: value, type: 'string' };
  }
  if (typeof value === 'number') return { value: value.toString(), type: 'number' };
  if (Array.isArray(value)) return { value: value, type: 'array' };
  if (typeof value === 'object') {
    if ((0, Helpers_1.isWrappedValue)(value)) {
      var _b = getValueAndTypeFromWrappedValue(value, mapOfUnits),
        wrappedValue = _b.value,
        wrappedValueType = _b.type;
      return { value: wrappedValue, type: wrappedValueType };
    }
    return { value: value, type: 'valueContainerObject' };
  }
}
