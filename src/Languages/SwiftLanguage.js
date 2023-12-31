"use strict";
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
exports.SwiftLanguage = void 0;
var InconsistentArgumentsError_1 = require("../Errors/InconsistentArgumentsError");
var Helpers_1 = require("../Utility/Helpers");
var SwiftLanguage = /** @class */ (function () {
    function SwiftLanguage() {
        this.name = 'Swift';
        this.extension = 'swift';
        this.keywords = [
            'associatedtype',
            'class',
            'deinit',
            'enum',
            'extension',
            'fileprivate',
            'func',
            'import',
            'init',
            'inout',
            'internal',
            'let',
            'open',
            'operator',
            'private',
            'precedencegroup',
            'protocol',
            'public',
            'rethrows',
            'static',
            'struct',
            'subscript',
            'typealias',
            'var',
            'break',
            'case',
            'catch',
            'continue',
            'default',
            'defer',
            'do',
            'else',
            'fallthrough',
            'for',
            'guard',
            'if',
            'in',
            'repeat',
            'return',
            'throw',
            'switch',
            'where',
            'while',
            'Any',
            'as',
            'await',
            'false',
            'is',
            'nil',
            'self',
            'Self',
            'super',
            'throws',
            'true',
            'try',
        ];
        this.importStatements = 'import SwiftUI';
        this.numberOfIndentations = 0;
    }
    SwiftLanguage.prototype.generateStructDeclaration = function (struct, isReferenceType) {
        var _this = this;
        var numberOfIndentations = 1;
        var initializerDeclaration = "\n\n" + this.generateInitializerDeclaration(struct.properties, struct.accessModifier);
        var propertyDeclarations = struct.properties.map(function (property) { return _this.generatePropertyDeclaration(property); });
        var computedPropertyDeclarations = struct.computedProperties.map(function (property) {
            return _this.generateComputedPropertyDeclaration(property);
        });
        var allPropertyDeclarations = __spreadArray(__spreadArray(__spreadArray([], propertyDeclarations, true), [['\n']], false), computedPropertyDeclarations, true).join('\n');
        var indentedPropertiesDeclarations = (0, Helpers_1.indentMultilineString)(allPropertyDeclarations, numberOfIndentations);
        var typeDecelerationKeyword = isReferenceType ? 'class' : 'struct';
        return "".concat(struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : '').concat(typeDecelerationKeyword, " ").concat(struct.name, " {\n").concat(indentedPropertiesDeclarations).concat(initializerDeclaration, "\n}");
    };
    SwiftLanguage.prototype.generateInitializerDeclaration = function (properties, accessModifier) {
        var _this = this;
        var modifier = accessModifier != 'internal' ? accessModifier + ' ' : '';
        var requiredProperties = properties.filter(function (property) { return !property.hasDefaultValue; });
        var propertiesParameters = requiredProperties
            .map(function (property) { return property.name + ': ' + _this.convertTokenTypeAndValue(property.type, property.value).type; })
            .join(',\n');
        var indentedPropertiesParameters = (0, Helpers_1.indentMultilineString)(propertiesParameters, 1);
        var propertiesAssignment = requiredProperties
            .map(function (property) {
            var propertyName = _this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
            return "self.".concat(property.name, " = ").concat(propertyName);
        })
            .join('\n');
        var indentedPropertiesAssignment = (0, Helpers_1.indentMultilineString)(propertiesAssignment, 1);
        return (0, Helpers_1.indentMultilineString)("".concat(modifier, "init(\n").concat(indentedPropertiesParameters, "\n) {\n").concat(indentedPropertiesAssignment, "\n}"), 1);
    };
    SwiftLanguage.prototype.generateInstanceStructDeclaration = function (struct) {
        return this.generateStructDeclaration(struct, false);
    };
    SwiftLanguage.prototype.generatePropertyDeclaration = function (property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError("Property has a default value but no value is provided\n".concat(JSON.stringify(property)));
        }
        var modifier = property.accessModifier != 'internal' ? property.accessModifier + ' ' : '';
        var _a = this.convertTokenTypeAndValue(property.type, property.value), type = _a.type, value = _a.value;
        var propertyName = this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
        var decelerationKeyword = property.isConstant ? 'let' : 'var';
        var decelerationBeginning = "".concat(modifier).concat(property.isStatic ? 'static ' : '').concat(decelerationKeyword, " ").concat(propertyName);
        if (property.hasDefaultValue)
            return "".concat(decelerationBeginning, " = ").concat(value);
        return "".concat(decelerationBeginning, ": ").concat(type);
    };
    SwiftLanguage.prototype.generateComputedPropertyDeclaration = function (property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError("Property has a default value but no value is provided\n".concat(JSON.stringify(property)));
        }
        var modifier = property.accessModifier != 'internal' ? property.accessModifier + ' ' : '';
        var _a = this.convertTokenTypeAndValue(property.type, property.value), type = _a.type, value = _a.value;
        var propertyName = this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
        var decelerationBeginning = "".concat(modifier).concat(property.isStatic ? 'static ' : '', "var ").concat(propertyName);
        return "".concat(decelerationBeginning, ": ").concat(type, " {\n").concat((0, Helpers_1.indentMultilineString)(value, 1), "\n}");
    };
    SwiftLanguage.prototype.convertTokenTypeAndValue = function (tokenValueType, value) {
        switch (tokenValueType) {
            case 'string':
                return { type: 'String', value: "\"".concat(value, "\"") };
            case 'number':
                var number = parseFloat(value);
                return { type: 'CGFloat', value: "".concat(number) };
            case 'boolean':
                return { type: 'Bool', value: value };
            case 'color-computedProperty':
                return { type: 'DSColor', value: value };
            case 'color':
                return { type: 'SwiftUI.Color', value: this.generateColorObjectDecelerationFrom(value) };
        }
        if (tokenValueType.endsWith('-object') || tokenValueType === 'valueContainerObject')
            return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };
        if (tokenValueType.endsWith('-array'))
            return { type: "[".concat(value[0].struct.name, "]"), value: this.generateArrayOfInstancesDeceleration(value) };
    };
    SwiftLanguage.prototype.generateColorObjectDecelerationFrom = function (hex) {
        if (hex.startsWith('#'))
            hex = hex.substring(1);
        return "SwiftUI.Color(hex: \"".concat(hex, "\")");
    };
    SwiftLanguage.prototype.generateInstanceDeceleration = function (instance) {
        var _this = this;
        this.numberOfIndentations++;
        var indentation = '    '.repeat(this.numberOfIndentations);
        var propertyValues = instance.propertyValues
            .map(function (propertyValue) {
            var value = _this.convertTokenTypeAndValue(propertyValue.type, propertyValue.value).value;
            return "".concat(propertyValue.name, ": ").concat(value);
        })
            .map(function (statement) { return indentation + statement; })
            .join(',\n');
        this.numberOfIndentations--;
        indentation = '    '.repeat(this.numberOfIndentations);
        var deceleration = "".concat(instance.struct.name, "(\n").concat(propertyValues, "\n").concat(indentation, ")");
        return deceleration;
    };
    SwiftLanguage.prototype.generateArrayOfInstancesDeceleration = function (instances) {
        var _this = this;
        var instancesDecelerations = instances
            .map(function (structInstance) { return _this.generateInstanceDeceleration(structInstance); })
            .join(', ');
        return "[".concat(instancesDecelerations, "]");
    };
    SwiftLanguage.prototype.generateDecelerationStatement = function (declaration) {
        return this.generatePropertyDeclaration(declaration);
    };
    SwiftLanguage.prototype.getStringifiedNumberAsFloat = function (number) {
        return "".concat(number).concat(Number.isInteger(number) ? '.0' : '');
    };
    return SwiftLanguage;
}());
exports.SwiftLanguage = SwiftLanguage;
