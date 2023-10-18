"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.KotlinLanguage = void 0;
var InconsistentArgumentsError_1 = require("../Errors/InconsistentArgumentsError");
var Helpers_1 = require("../Utility/Helpers");
var KotlinLanguage = /** @class */ (function () {
    function KotlinLanguage() {
        this.name = 'Kotlin';
        this.extension = 'kt';
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
        this.importStatements = [
            'import androidx.compose.ui.unit.*',
            'import androidx.compose.ui.graphics.Color',
            'import android.graphics.Color.parseColor',
            'import androidx.compose.runtime.Composable',
            'import androidx.compose.ui.platform.LocalDensity',
        ].join('\n');
    }
    KotlinLanguage.prototype.generateStructDeclaration = function (struct) {
        var _this = this;
        var numberOfIndentations = 1;
        var propertyDeclarations = struct.properties.map(function (property) { return _this.generatePropertyDeclaration(property); });
        var indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        return "".concat(struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : '', "object ").concat(struct.name, " {\n").concat(indentedPropertiesDeclarations, "\n}");
    };
    KotlinLanguage.prototype.generateInstanceStructDeclaration = function (struct) {
        var _this = this;
        var numberOfIndentations = 1;
        var propertyDeclarations = struct.properties.map(function (property) { return _this.generatePropertyDeclaration(property) + ', '; });
        var indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        return "".concat(struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : '', "data class ").concat(struct.name, " (\n").concat(indentedPropertiesDeclarations, "\n)");
    };
    KotlinLanguage.prototype.generatePropertyDeclaration = function (property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError("Property has a default value but no value is provided\n".concat(JSON.stringify(property)));
        }
        var _a = this.convertTokenTypeAndValue(property.type, property.value), type = _a.type, value = _a.value;
        var propertyName = this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
        var decelerationKeyword = property.isConstant ? 'val' : 'var';
        var decelerationBeginning = "".concat(decelerationKeyword, " ").concat(propertyName);
        if (property.hasDefaultValue)
            return "".concat(decelerationBeginning, " = ").concat(value);
        return "".concat(decelerationBeginning, ": ").concat(type);
    };
    KotlinLanguage.prototype.generateObjectDecelerationOf = function (struct) {
        var propertyParameters = struct.properties.map(function (property) { return "".concat(property.name, ": ").concat(property.value); }).join(', ');
        return "".concat(struct.name, "(").concat(propertyParameters, ")");
    };
    KotlinLanguage.prototype.convertTokenTypeAndValue = function (tokenValueType, value) {
        switch (tokenValueType) {
            case 'string':
                return { type: 'String', value: "\"".concat(value, "\"") };
            case 'number':
                var number = parseFloat(value);
                return { type: 'Double', value: this.getStringifiedNumberAsFloat(number) };
            case 'color':
                return { type: 'Color', value: this.generateColorObjectDecelerationFrom(value) };
            case 'valueContainerObject':
                return { type: value.name, value: "".concat(value.name) };
        }
        if (tokenValueType.endsWith('-object'))
            return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };
        if (tokenValueType.endsWith('-array'))
            return { type: "[".concat(value[0].struct.name, "]"), value: this.generateArrayOfInstancesDeceleration(value) };
    };
    KotlinLanguage.prototype.generateColorObjectDecelerationFrom = function (hex) {
        return "Color(parseColor(\"".concat(hex, "\"))");
    };
    KotlinLanguage.prototype.generateInstanceDeceleration = function (instance) {
        var _this = this;
        var propertyValues = instance.propertyValues
            .map(function (propertyValue) {
            var value = _this.convertTokenTypeAndValue(propertyValue.type, propertyValue.value).value;
            return "".concat(propertyValue.name, " = ").concat(value);
        })
            .join(', ');
        return "".concat(instance.struct.name, "(").concat(propertyValues, ")");
    };
    KotlinLanguage.prototype.generateArrayOfInstancesDeceleration = function (instances) {
        var _this = this;
        var instancesDecelerations = instances
            .map(function (structInstance) { return _this.generateInstanceDeceleration(structInstance); })
            .join(', ');
        return "listOf(".concat(instancesDecelerations, ")");
    };
    KotlinLanguage.prototype.getStringifiedNumberAsFloat = function (number) {
        return "".concat(number).concat(Number.isInteger(number) ? '.0' : '');
    };
    return KotlinLanguage;
}());
exports.KotlinLanguage = KotlinLanguage;
