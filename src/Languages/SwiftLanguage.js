"use strict";
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
        var propertyDeclarations = struct.properties.map(function (property) { return _this.generatePropertyDeclaration(property); });
        var indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        var typeDecelerationKeyword = isReferenceType ? 'class' : 'struct';
        return "".concat(struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : '').concat(typeDecelerationKeyword, " ").concat(struct.name, " {\n").concat(indentedPropertiesDeclarations, "\n}");
    };
    SwiftLanguage.prototype.generateInstanceStructDeclaration = function (struct) {
        return this.generateStructDeclaration(struct, false);
    };
    SwiftLanguage.prototype.generatePropertyDeclaration = function (property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError("Property has a default value but no value is provided\n".concat(JSON.stringify(property)));
        }
        var _a = this.convertTokenTypeAndValue(property.type, property.value), type = _a.type, value = _a.value;
        var propertyName = this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
        var decelerationKeyword = property.isConstant ? 'let' : 'var';
        var decelerationBeginning = "".concat(property.isStatic ? 'static ' : '').concat(decelerationKeyword, " ").concat(propertyName);
        if (property.hasDefaultValue)
            return "".concat(decelerationBeginning, " = ").concat(value);
        return "".concat(decelerationBeginning, ": ").concat(type);
    };
    SwiftLanguage.prototype.convertTokenTypeAndValue = function (tokenValueType, value) {
        switch (tokenValueType) {
            case 'string':
                return { type: 'String', value: "\"".concat(value, "\"") };
            case 'number':
                var number = parseFloat(value);
                return { type: 'CGFloat', value: this.getStringifiedNumberAsFloat(number) };
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
