"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.KotlinLanguage = void 0;
const InconsistentArgumentsError_1 = require("../Errors/InconsistentArgumentsError");
const Helpers_1 = require("../Utility/Helpers");
class KotlinLanguage {
    name = 'Kotlin';
    extension = 'kt';
    keywords = [
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
    importStatements = [
        'import androidx.compose.ui.unit.*',
        'import androidx.compose.ui.graphics.Color',
        'import android.graphics.Color.parseColor',
        'import androidx.compose.runtime.Composable',
        'import androidx.compose.ui.platform.LocalDensity',
    ].join('\n');
    numberOfIndentations = 0;
    generateStructDeclaration(struct, isReferenceType) {
        const numberOfIndentations = 1;
        const propertyDeclarations = struct.properties.map(property => this.generatePropertyDeclaration(property) + ',');
        const indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        return `${struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : ''}data class ${struct.name} (\n${indentedPropertiesDeclarations}\n)`;
    }
    generateInstanceStructDeclaration(struct) {
        const numberOfIndentations = 1;
        const propertyDeclarations = struct.properties.map(property => this.generatePropertyDeclaration(property) + ', ');
        const indentedPropertiesDeclarations = (0, Helpers_1.indentStatements)(propertyDeclarations, numberOfIndentations);
        return `${struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : ''}data class ${struct.name} (\n${indentedPropertiesDeclarations}\n)`;
    }
    generatePropertyDeclaration(property) {
        if (property.hasDefaultValue && property.value === null) {
            throw new InconsistentArgumentsError_1.InconsistentArgumentsError(`Property has a default value but no value is provided\n${JSON.stringify(property)}`);
        }
        const { type, value } = this.convertTokenTypeAndValue(property.type, property.value);
        const propertyName = this.keywords.includes(property.name) ? `\`${property.name}\`` : property.name;
        const decelerationKeyword = property.isConstant ? 'val' : 'var';
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
                return { type: 'Double', value: this.getStringifiedNumberAsFloat(number) };
            case 'color':
                return { type: 'Color', value: this.generateColorObjectDecelerationFrom(value) };
            case 'valueContainerObject':
                return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };
        }
        if (tokenValueType.endsWith('-object'))
            return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };
        if (tokenValueType.endsWith('-array'))
            return { type: `List<${value[0].struct.name}>`, value: this.generateArrayOfInstancesDeceleration(value) };
    }
    generateColorObjectDecelerationFrom(hex) {
        return `Color(parseColor("${hex}"))`;
    }
    generateInstanceDeceleration(instance) {
        this.numberOfIndentations++;
        var indentation = '    '.repeat(this.numberOfIndentations);
        let propertyValues = instance.propertyValues
            .map(propertyValue => {
            const { value } = this.convertTokenTypeAndValue(propertyValue.type, propertyValue.value);
            return `${propertyValue.name} = ${value}`;
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
        return `listOf(${instancesDecelerations})`;
    }
    generateDecelerationStatement(declaration) {
        return this.generatePropertyDeclaration(declaration);
    }
    getStringifiedNumberAsFloat(number) {
        return `${number}${Number.isInteger(number) ? '.0' : ''}`;
    }
}
exports.KotlinLanguage = KotlinLanguage;
