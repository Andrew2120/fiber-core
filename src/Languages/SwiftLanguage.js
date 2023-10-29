"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SwiftLanguage = void 0;
const InconsistentArgumentsError_1 = require("../Errors/InconsistentArgumentsError");
const Helpers_1 = require("../Utility/Helpers");
class SwiftLanguage {
    constructor() {
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
<<<<<<< HEAD
    generateStructDeclaration(struct) {
        const numberOfIndentations = 1;
        const propertyDeclarations = struct.properties.map(property => this.generatePropertyDeclaration(property));
        const indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        return `${struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : ''}struct ${struct.name} {\n${indentedPropertiesDeclarations}\n}`;
    }
    generateInstanceStructDeclaration(struct) {
        return this.generateStructDeclaration(struct);
    }
    generatePropertyDeclaration(property) {
=======
    SwiftLanguage.prototype.generateStructDeclaration = function (struct, isReferenceType) {
        var _this = this;
        var numberOfIndentations = 1;
        var initializerDeclaration = isReferenceType
            ? "\n\n" + this.generateInitializerDeclaration(struct.properties)
            : '';
        var propertyDeclarations = struct.properties.map(function (property) { return _this.generatePropertyDeclaration(property); });
        var indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        var typeDecelerationKeyword = isReferenceType ? 'class' : 'struct';
        return "".concat(struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : '').concat(typeDecelerationKeyword, " ").concat(struct.name, " {\n").concat(indentedPropertiesDeclarations).concat(initializerDeclaration, "\n}");
    };
    SwiftLanguage.prototype.generateInitializerDeclaration = function (properties) {
        var _this = this;
        var propertiesParameters = properties
            .map(function (property) { return property.name + ':' + _this.convertTokenTypeAndValue(property.type, property.value).type; })
            .join(',\n');
        var indentedPropertiesParameters = (0, Helpers_1.indentMultilineString)(propertiesParameters, 1);
        var propertiesAssignment = properties.map(function (property) { return "self.".concat(property.name, " = ").concat(property.name); }).join('\n');
        var indentedPropertiesAssignment = (0, Helpers_1.indentMultilineString)(propertiesAssignment, 1);
        return (0, Helpers_1.indentMultilineString)("init(\n".concat(indentedPropertiesParameters, "\n){\n").concat(indentedPropertiesAssignment, "\n}"), 1);
    };
    SwiftLanguage.prototype.generateInstanceStructDeclaration = function (struct) {
        return this.generateStructDeclaration(struct, false);
    };
    SwiftLanguage.prototype.generatePropertyDeclaration = function (property) {
>>>>>>> main
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError(`Property has a default value but no value is provided\n${JSON.stringify(property)}`);
        }
<<<<<<< HEAD
        const { type, value } = this.convertTokenTypeAndValue(property.type, property.value);
        const propertyName = this.keywords.includes(property.name) ? `\`${property.name}\`` : property.name;
        const decelerationKeyword = property.isConstant ? 'let' : 'var';
        const decelerationBeginning = `${decelerationKeyword} ${propertyName}`;
        if (property.hasDefaultValue)
            return `${decelerationBeginning} = ${value}`;
        return `${decelerationBeginning}: ${type}`;
    }
    generateObjectDecelerationOf(struct) {
        const propertyParameters = struct.properties.map(property => `${property.name}: ${property.value}`).join(', ');
        return `${struct.name}(${propertyParameters})`;
    }
    convertTokenTypeAndValue(tokenValueType, value) {
=======
        var _a = this.convertTokenTypeAndValue(property.type, property.value), type = _a.type, value = _a.value;
        var propertyName = this.keywords.includes(property.name) ? "`".concat(property.name, "`") : property.name;
        var decelerationKeyword = property.isConstant ? 'let' : 'var';
        var decelerationBeginning = "".concat(property.isStatic ? 'static ' : '').concat(decelerationKeyword, " ").concat(propertyName);
        if (property.hasDefaultValue)
            return "".concat(decelerationBeginning, " = ").concat(value);
        return "".concat(decelerationBeginning, ": ").concat(type);
    };
    SwiftLanguage.prototype.convertTokenTypeAndValue = function (tokenValueType, value) {
>>>>>>> main
        switch (tokenValueType) {
            case 'string':
                return { type: 'String', value: `"${value}"` };
            case 'number':
                const number = parseFloat(value);
                return { type: 'CGFloat', value: this.getStringifiedNumberAsFloat(number) };
            case 'color':
                return { type: 'SwiftUI.Color', value: this.generateColorObjectDecelerationFrom(value) };
<<<<<<< HEAD
            case 'valueContainerObject':
                return { type: value.name, value: `${value.name}()` };
=======
>>>>>>> main
        }
        if (tokenValueType.endsWith('-object') || tokenValueType === 'valueContainerObject')
            return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };
        if (tokenValueType.endsWith('-array'))
            return { type: `[${value[0].struct.name}]`, value: this.generateArrayOfInstancesDeceleration(value) };
    }
    generateColorObjectDecelerationFrom(hex) {
        if (hex.startsWith('#'))
            hex = hex.substring(1);
<<<<<<< HEAD
        return `SwiftUI.Color(hex: "${hex}")`;
    }
    generateInstanceDeceleration(instance) {
        let propertyValues = instance.propertyValues
            .map(propertyValue => {
            const { value } = this.convertTokenTypeAndValue(propertyValue.type, propertyValue.value);
            return `${propertyValue.name}: ${value}`;
        })
            .join(', ');
        return `${instance.struct.name}(${propertyValues})`;
    }
    generateArrayOfInstancesDeceleration(instances) {
        let instancesDecelerations = instances
            .map(structInstance => this.generateInstanceDeceleration(structInstance))
            .join(', ');
        return `[${instancesDecelerations}]`;
    }
    getStringifiedNumberAsFloat(number) {
        return `${number}${Number.isInteger(number) ? '.0' : ''}`;
    }
}
=======
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
>>>>>>> main
exports.SwiftLanguage = SwiftLanguage;
