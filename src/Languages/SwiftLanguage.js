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
    }
    SwiftLanguage.prototype.generateStructDeclaration = function (struct) {
        var _this = this;
        var numberOfIndentations = 1;
        var propertyDeclarations = struct.properties.map(function (property) { return _this.generatePropertyDeclaration(property); });
        var indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        return "".concat(struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : '', "struct ").concat(struct.name, " {\n").concat(indentedPropertiesDeclarations, "\n}");
    };
    SwiftLanguage.prototype.generateInstanceStructDeclaration = function (struct) {
        return this.generateStructDeclaration(struct);
    };
    SwiftLanguage.prototype.generatePropertyDeclaration = function (property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError("Property has a default value but no value is provided\n".concat(JSON.stringify(property)));
        }
        var _a = this.convertTokenTypeAndValue(property.type, property.value), type = _a.type, value = _a.value;
        var propertyName = this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
        var decelerationKeyword = property.isConstant ? 'let' : 'var';
        var decelerationBeginning = "".concat(decelerationKeyword, " ").concat(propertyName);
        if (property.hasDefaultValue)
            return "".concat(decelerationBeginning, " = ").concat(value);
        return "".concat(decelerationBeginning, ": ").concat(type);
    };
    SwiftLanguage.prototype.generateObjectDecelerationOf = function (struct) {
        var propertyParameters = struct.properties.map(function (property) { return "".concat(property.name, ": ").concat(property.value); }).join(', ');
        return "".concat(struct.name, "(").concat(propertyParameters, ")");
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
            case 'valueContainerObject':
                return { type: value.name, value: "".concat(value.name, "()") };
        }
        if (tokenValueType.endsWith('-object'))
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
        var propertyValues = instance.propertyValues
            .map(function (propertyValue) {
            var value = _this.convertTokenTypeAndValue(propertyValue.type, propertyValue.value).value;
            return "".concat(propertyValue.name, ": ").concat(value);
        })
            .join(', ');
        return "".concat(instance.struct.name, "(").concat(propertyValues, ")");
    };
    SwiftLanguage.prototype.generateArrayOfInstancesDeceleration = function (instances) {
        var _this = this;
        var instancesDecelerations = instances
            .map(function (structInstance) { return _this.generateInstanceDeceleration(structInstance); })
            .join(', ');
        return "[".concat(instancesDecelerations, "]");
    };
    SwiftLanguage.prototype.getStringifiedNumberAsFloat = function (number) {
        return "".concat(number).concat(Number.isInteger(number) ? '.0' : '');
    };
    return SwiftLanguage;
}());
exports.SwiftLanguage = SwiftLanguage;
