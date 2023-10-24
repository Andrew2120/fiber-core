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
    }
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
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError(`Property has a default value but no value is provided\n${JSON.stringify(property)}`);
        }
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
        switch (tokenValueType) {
            case 'string':
                return { type: 'String', value: `"${value}"` };
            case 'number':
                const number = parseFloat(value);
                return { type: 'CGFloat', value: this.getStringifiedNumberAsFloat(number) };
            case 'color':
                return { type: 'SwiftUI.Color', value: this.generateColorObjectDecelerationFrom(value) };
            case 'valueContainerObject':
                return { type: value.name, value: `${value.name}()` };
        }
        if (tokenValueType.endsWith('-object'))
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
exports.SwiftLanguage = SwiftLanguage;
