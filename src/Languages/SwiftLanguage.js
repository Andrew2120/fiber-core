"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SwiftLanguage = void 0;
const InconsistentArgumentsError_1 = require("../Errors/InconsistentArgumentsError");
const Helpers_1 = require("../Utility/Helpers");
class SwiftLanguage {
    name = 'Swift';
    extension = 'swift';
    keywords = [
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
    importStatements = 'import SwiftUI';
    numberOfIndentations = 0;
    generateStructDeclaration(struct, isReferenceType) {
        const numberOfIndentations = 1;
        const initializerDeclaration = isReferenceType
            ? `\n\n` + this.generateInitializerDeclaration(struct.properties)
            : '';
        const propertyDeclarations = struct.properties.map(property => this.generatePropertyDeclaration(property));
        const indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        const typeDecelerationKeyword = isReferenceType ? 'class' : 'struct';
        return `${struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : ''}${typeDecelerationKeyword} ${struct.name} {\n${indentedPropertiesDeclarations}${initializerDeclaration}\n}`;
    }
    generateInitializerDeclaration(properties) {
        const propertiesParameters = properties
            .map(property => property.name + ':' + this.convertTokenTypeAndValue(property.type, property.value).type)
            .join(',\n');
        const indentedPropertiesParameters = (0, Helpers_1.indentMultilineString)(propertiesParameters, 1);
        const propertiesAssignment = properties.map(property => `self.${property.name} = ${property.name}`).join('\n');
        const indentedPropertiesAssignment = (0, Helpers_1.indentMultilineString)(propertiesAssignment, 1);
        return (0, Helpers_1.indentMultilineString)(`init(\n${indentedPropertiesParameters}\n){\n${indentedPropertiesAssignment}\n}`, 1);
    }
    generateInstanceStructDeclaration(struct) {
        return this.generateStructDeclaration(struct, false);
    }
    generatePropertyDeclaration(property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError(`Property has a default value but no value is provided\n${JSON.stringify(property)}`);
        }
        const { type, value } = this.convertTokenTypeAndValue(property.type, property.value);
        const propertyName = this.keywords.includes(property.name) ? `\`${property.name}\`` : property.name;
        const decelerationKeyword = property.isConstant ? 'let' : 'var';
        const decelerationBeginning = `${property.isStatic ? 'static ' : ''}${decelerationKeyword} ${propertyName}`;
        if (property.hasDefaultValue)
            return `${decelerationBeginning} = ${value}`;
        return `${decelerationBeginning}: ${type}`;
    }
    convertTokenTypeAndValue(tokenValueType, value) {
        switch (tokenValueType) {
            case 'string':
                return { type: 'String', value: `"${value}"` };
            case 'number':
                const number = parseFloat(value);
                return { type: 'CGFloat', value: this.getStringifiedNumberAsFloat(number) };
            case 'color':
                return { type: 'SwiftUI.Color', value: this.generateColorObjectDecelerationFrom(value) };
        }
        if (tokenValueType.endsWith('-object') || tokenValueType === 'valueContainerObject')
            return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };
        if (tokenValueType.endsWith('-array'))
            return { type: `[${value[0].struct.name}]`, value: this.generateArrayOfInstancesDeceleration(value) };
    }
    generateColorObjectDecelerationFrom(hex) {
        if (hex.startsWith('#'))
            hex = hex.substring(1);
        return `SwiftUI.Color(hex: "${hex}")`;
    }
    generateInstanceDeceleration(instance) {
        this.numberOfIndentations++;
        var indentation = '    '.repeat(this.numberOfIndentations);
        let propertyValues = instance.propertyValues
            .map(propertyValue => {
            const { value } = this.convertTokenTypeAndValue(propertyValue.type, propertyValue.value);
            return `${propertyValue.name}: ${value}`;
        })
            .map(statement => indentation + statement)
            .join(',\n');
        this.numberOfIndentations--;
        indentation = '    '.repeat(this.numberOfIndentations);
        const deceleration = `${instance.struct.name}(\n${propertyValues}\n${indentation})`;
        return deceleration;
    }
    generateArrayOfInstancesDeceleration(instances) {
        let instancesDecelerations = instances
            .map(structInstance => this.generateInstanceDeceleration(structInstance))
            .join(', ');
        return `[${instancesDecelerations}]`;
    }
    generateDecelerationStatement(declaration) {
        return this.generatePropertyDeclaration(declaration);
    }
    getStringifiedNumberAsFloat(number) {
        return `${number}${Number.isInteger(number) ? '.0' : ''}`;
    }
}
exports.SwiftLanguage = SwiftLanguage;
