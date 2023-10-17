import { Property, Struct, StructInstance } from '../Struct';
import { InconsistentArgumentsError } from '../Errors/InconsistentArgumentsError';
import { indentStatements as indentStatements } from '../Utility/Helpers';
import { Language } from './Language';

export class KotlinLanguage implements Language {
  name = 'Kotlin';
  extension = 'kt';
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

  importStatements: string = [
    'import androidx.compose.ui.unit.*',
    'import androidx.compose.ui.graphics.Color',
    'import android.graphics.Color.parseColor',
    'import androidx.compose.runtime.Composable',
    'import androidx.compose.ui.platform.LocalDensity',
  ].join('\n');

  generateStructDeclaration(struct: Struct): string {
    const numberOfIndentations = 1;
    const propertyDeclarations = struct.properties.map(property => this.generatePropertyDeclaration(property));
    const indentedPropertiesDeclarations = indentStatements(propertyDeclarations, numberOfIndentations);

    return `${struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : ''}object ${
      struct.name
    } {\n${indentedPropertiesDeclarations}\n}`;
  }

  generateInstanceStructDeclaration(struct: Struct): string {
    const numberOfIndentations = 1;
    const propertyDeclarations = struct.properties.map(
      property => this.generatePropertyDeclaration(property) + ', '
    );
    const indentedPropertiesDeclarations = indentStatements(propertyDeclarations, numberOfIndentations);

    return `${struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : ''}data class ${
      struct.name
    } (\n${indentedPropertiesDeclarations}\n)`;
  }

  generatePropertyDeclaration(property: Property): string {
    if (property.hasDefaultValue && property.value === null) {
      throw new InconsistentArgumentsError(
        `Property has a default value but no value is provided\n${JSON.stringify(property)}`
      );
    }

    const { type, value } = this.convertTokenTypeAndValue(property.type, property.value);

    const propertyName = this.keywords.includes(property.name) ? `\`${property.name}\`` : property.name;

    const decelerationKeyword = property.isConstant ? 'val' : 'var';
    const decelerationBeginning = `${decelerationKeyword} ${propertyName}`;

    if (property.hasDefaultValue) return `${decelerationBeginning} = ${value}`;
    return `${decelerationBeginning}: ${type}`;
  }

  generateObjectDecelerationOf(struct: Struct): string {
    const propertyParameters = struct.properties.map(property => `${property.name}: ${property.value}`).join(', ');
    return `${struct.name}(${propertyParameters})`;
  }

  convertTokenTypeAndValue(tokenValueType: string, value: any): { type: string; value: string } {
    switch (tokenValueType) {
      case 'string':
        return { type: 'String', value: `"${value}"` };
      case 'number':
        const number = parseFloat(value);
        return { type: 'Double', value: this.getStringifiedNumberAsFloat(number) };
      case 'color':
        return { type: 'Color', value: this.generateColorObjectDecelerationFrom(value) };
      case 'valueContainerObject':
        return { type: value.name, value: `${value.name}` };
    }

    if (tokenValueType.endsWith('-object'))
      return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };

    if (tokenValueType.endsWith('-array'))
      return { type: `[${value[0].struct.name}]`, value: this.generateArrayOfInstancesDeceleration(value) };
  }

  generateColorObjectDecelerationFrom(hex: string): string {
    return `Color(parseColor("${hex}"))`;
  }

  generateInstanceDeceleration(instance: StructInstance): string {
    let propertyValues = instance.propertyValues
      .map(propertyValue => {
        const { value } = this.convertTokenTypeAndValue(propertyValue.type, propertyValue.value);
        return `${propertyValue.name} = ${value}`;
      })
      .join(', ');

    return `${instance.struct.name}(${propertyValues})`;
  }

  generateArrayOfInstancesDeceleration(instances: StructInstance[]): string {
    let instancesDecelerations = instances
      .map(structInstance => this.generateInstanceDeceleration(structInstance))
      .join(', ');

    return `listOf(${instancesDecelerations})`;
  }

  private getStringifiedNumberAsFloat(number: number): string {
    return `${number}${Number.isInteger(number) ? '.0' : ''}`;
  }
}
