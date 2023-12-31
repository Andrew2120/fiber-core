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
            'as',
            'break',
            'class',
            'continue',
            'do',
            'else',
            'false',
            'for',
            'fun',
            'if',
            'in',
            'interface',
            'is',
            'null',
            'object',
            'package',
            'return',
            'super',
            'this',
            'throw',
            'true',
            'try',
            'typealias',
            'typeof',
            'val',
            'var',
            'when',
            'while',
            'by',
            'catch',
            'constructor',
            'delegate',
            'dynamic',
            'field',
            'file',
            'finally',
            'get',
            'import',
            'init',
            'param',
            'property',
            'receiver',
            'set',
            'setparam',
            'value',
            'where',
            'abstract',
            'actual',
            'annotation',
            'companion',
            'const',
            'crossinline',
            'data',
            'enum',
            'expect',
            'external',
            'final',
            'infix',
            'inline',
            'inner',
            'internal',
            'lateinit',
            'noinline',
            'open',
            'operator',
            'out',
            'override',
            'private',
            'protected',
            'public',
            'reified',
            'sealed',
            'suspend',
            'tailrec',
            'vararg',
            'field',
            'it',
        ];
        this.importStatements = [
            'import androidx.compose.ui.unit.*',
            'import androidx.compose.ui.graphics.Color',
            'import androidx.core.graphics.toColorInt',
            'import androidx.compose.runtime.Composable',
            'import androidx.compose.ui.platform.LocalDensity',
        ].join('\n');
        this.numberOfIndentations = 0;
    }
    KotlinLanguage.prototype.generateStructDeclaration = function (struct, isReferenceType) {
        var _this = this;
        var numberOfIndentations = 1;
        var propertyDeclarations = struct.properties.map(function (property) { return _this.generatePropertyDeclaration(property) + ','; });
        var computedPropertyDeclarations = struct.computedProperties.map(function (property) {
            return _this.generateComputedPropertyDeclaration(property);
        });
        var indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        var indentedComputedPropertiesDeclarations = (0, Helpers_1.indentStatements)(computedPropertyDeclarations, numberOfIndentations);
        var dataClassDeclaration = "".concat(struct.accessModifier != 'public' ? struct.accessModifier + ' ' : '', "data class ").concat(struct.name, " (\n").concat(indentedPropertiesDeclarations, "\n)");
        if (computedPropertyDeclarations.length > 0) {
            dataClassDeclaration += " {\n".concat(indentedComputedPropertiesDeclarations, "\n}");
        }
        return dataClassDeclaration;
    };
    KotlinLanguage.prototype.generateInstanceStructDeclaration = function (struct) {
        var _this = this;
        var numberOfIndentations = 1;
        var propertyDeclarations = struct.properties.map(function (property) { return _this.generatePropertyDeclaration(property) + ', '; });
        var indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        return "".concat(struct.accessModifier != 'public' ? struct.accessModifier + ' ' : '', "data class ").concat(struct.name, " (\n").concat(indentedPropertiesDeclarations, "\n)");
    };
    KotlinLanguage.prototype.generatePropertyDeclaration = function (property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError("Property has a default value but no value is provided\n".concat(JSON.stringify(property)));
        }
        var modifier = property.accessModifier != 'public' ? property.accessModifier + ' ' : '';
        var _a = this.convertTokenTypeAndValue(property.type, property.value), type = _a.type, value = _a.value;
        var propertyName = this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
        var decelerationKeyword = property.isConstant ? 'val' : 'var';
        var decelerationBeginning = "".concat(modifier).concat(decelerationKeyword, " ").concat(propertyName);
        if (property.hasDefaultValue)
            return "".concat(decelerationBeginning, ": ").concat(type, " = ").concat(value);
        return "".concat(decelerationBeginning, ": ").concat(type);
    };
    KotlinLanguage.prototype.generateComputedPropertyDeclaration = function (property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError("Property has a default value but no value is provided\n".concat(JSON.stringify(property)));
        }
        var modifier = property.accessModifier != 'public' ? property.accessModifier + ' ' : '';
        var _a = this.convertTokenTypeAndValue(property.type, property.value), type = _a.type, value = _a.value;
        var propertyName = this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
        var decelerationBeginning = "".concat(modifier).concat(property.isStatic ? 'static ' : '', "val ").concat(propertyName);
        return "".concat(decelerationBeginning, ": ").concat(type, " get() = ").concat(value);
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
            case 'boolean':
                return { type: 'Boolean', value: value };
            case 'color-computedProperty':
                return { type: 'DSColor', value: value };
            case 'color':
                return { type: 'Color', value: this.generateColorObjectDecelerationFrom(value) };
            case 'valueContainerObject':
                return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };
        }
        if (tokenValueType.endsWith('-object'))
            return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };
        if (tokenValueType.endsWith('-array'))
            return { type: "List<".concat(value[0].struct.name, ">"), value: this.generateArrayOfInstancesDeceleration(value) };
    };
    KotlinLanguage.prototype.generateColorObjectDecelerationFrom = function (hex) {
        return "Color(\"".concat(hex, "\".toColorInt())");
    };
    KotlinLanguage.prototype.generateInstanceDeceleration = function (instance) {
        var _this = this;
        this.numberOfIndentations++;
        var indentation = '    '.repeat(this.numberOfIndentations);
        var propertyValues = instance.propertyValues
            .map(function (propertyValue) {
            var value = _this.convertTokenTypeAndValue(propertyValue.type, propertyValue.value).value;
            return "".concat(propertyValue.name, " = ").concat(value);
        })
            .map(function (statement) { return indentation + statement; })
            .join(',\n');
        this.numberOfIndentations--;
        indentation = '    '.repeat(this.numberOfIndentations);
        var deceleration = "".concat(instance.struct.name, "(\n").concat(propertyValues, "\n").concat(indentation, ")");
        return deceleration;
    };
    KotlinLanguage.prototype.generateArrayOfInstancesDeceleration = function (instances) {
        var _this = this;
        var instancesDecelerations = instances
            .map(function (structInstance) { return _this.generateInstanceDeceleration(structInstance); })
            .join(', ');
        return "listOf(".concat(instancesDecelerations, ")");
    };
    KotlinLanguage.prototype.generateDecelerationStatement = function (declaration) {
        return this.generatePropertyDeclaration(declaration);
    };
    KotlinLanguage.prototype.getStringifiedNumberAsFloat = function (number) {
        return "".concat(number).concat(Number.isInteger(number) ? '.0' : '');
    };
    return KotlinLanguage;
}());
exports.KotlinLanguage = KotlinLanguage;
