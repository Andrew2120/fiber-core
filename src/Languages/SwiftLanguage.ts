import { Declaration, Property, TypeData, InstanceData, ComputedProperty } from '../Struct';
import { InconsistentArgumentsError } from '../Errors/InconsistentArgumentsError';
import {
  convertToCamelCase,
  getPropertyName,
  indentMultilineString,
  indentStatements as indentStatements,
} from '../Utility/Helpers';
import { Language } from './Language';
import { AccessModifier } from '../Utility/Types';
import { Folder } from '../Utility/Folder';
import { ColorSetFolder } from '../Utility/ColorSetFolder';
import { XcodeAssetsFolder } from '../Utility/XcodeAssetsFolder';
import { jsonKeyMap } from '../Config';

export class SwiftLanguage implements Language {
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

  generatedFiles = [];
  generatedFolders = [];
  private xcAssetsFolder = new XcodeAssetsFolder('Colors');
  importStatements: string = 'import SwiftUI';
  private numberOfIndentations = 0;
  private generatedColorFolderNames = {};

  constructor() {
    this.generatedFolders.push(this.xcAssetsFolder);
  }

  generateStructDeclaration(struct: TypeData, isReferenceType: boolean): string {
    const numberOfIndentations = 1;
    const initializerDeclaration =
      `\n\n` + this.generateInitializerDeclaration(struct.properties, struct.accessModifier);

    const propertyDeclarations = struct.properties.map(property => this.generatePropertyDeclaration(property));
    const computedPropertyDeclarations = struct.computedProperties.map(property =>
      this.generateComputedPropertyDeclaration(property)
    );
    const typeIncludesComputedProperties = computedPropertyDeclarations.length > 0;
    const propertiesSeparator = typeIncludesComputedProperties ? ['\n'] : [];
    const allPropertyDeclarations = [
      ...propertyDeclarations,
      propertiesSeparator,
      ...computedPropertyDeclarations,
    ].join('\n');

    const indentedPropertiesDeclarations = indentMultilineString(allPropertyDeclarations, numberOfIndentations);

    const typeDecelerationKeyword = isReferenceType ? 'class' : 'struct';

    return `${struct.accessModifier != 'internal' ? struct.accessModifier + ' ' : ''}${typeDecelerationKeyword} ${
      struct.name
    } {\n${indentedPropertiesDeclarations}${initializerDeclaration}\n}`;
  }

  generateInitializerDeclaration(properties: Property[], accessModifier: AccessModifier): string {
    const modifier = accessModifier != 'internal' ? accessModifier + ' ' : '';
    const requiredProperties = properties.filter(property => !property.hasDefaultValue);
    const propertiesParameters = requiredProperties
      .map(
        property =>
          property.name +
          ': ' +
          this.convertTokenTypeAndValue(property.type, property.value, property.name, property.zNameInObject).type
      )
      .join(',\n');

    const indentedPropertiesParameters = indentMultilineString(propertiesParameters, 1);

    const propertiesAssignment = requiredProperties
      .map(property => {
        const propertyName = this.keywords.includes(property.name) ? `\`${property.name}\`` : property.name;
        return `self.${property.name} = ${propertyName}`;
      })
      .join('\n');
    const indentedPropertiesAssignment = indentMultilineString(propertiesAssignment, 1);

    return indentMultilineString(
      `${modifier}init(\n${indentedPropertiesParameters}\n) {\n${indentedPropertiesAssignment}\n}`,
      1
    );
  }

  generateInstanceStructDeclaration(struct: TypeData): string {
    return this.generateStructDeclaration(struct, false);
  }

  generatePropertyDeclaration(property: Property): string {
    if (property.hasDefaultValue && property.value === null) {
      throw new InconsistentArgumentsError(
        `Property has a default value but no value is provided\n${JSON.stringify(property)}`
      );
    }

    const modifier = property.accessModifier != 'internal' ? property.accessModifier + ' ' : '';

    const propertyName = this.keywords.includes(property.name) ? `\`${property.name}\`` : property.name;

    const { type, value } = this.convertTokenTypeAndValue(
      property.type,
      property.value,
      propertyName,
      property.zNameInObject
    );

    const decelerationKeyword = property.isConstant ? 'let' : 'var';
    const decelerationBeginning = `${modifier}${
      property.isStatic ? 'static ' : ''
    }${decelerationKeyword} ${propertyName}`;

    if (property.hasDefaultValue) return `${decelerationBeginning} = ${value}`;
    return `${decelerationBeginning}: ${type}`;
  }

  generateComputedPropertyDeclaration(property: ComputedProperty): string {
    if (property.hasDefaultValue && property.value === null) {
      throw new InconsistentArgumentsError(
        `Property has a default value but no value is provided\n${JSON.stringify(property)}`
      );
    }

    const modifier = property.accessModifier != 'internal' ? property.accessModifier + ' ' : '';

    const propertyName = this.keywords.includes(property.name) ? `\`${property.name}\`` : property.name;
    const { type, value } = this.convertTokenTypeAndValue(
      property.type,
      property.value,
      propertyName,
      property.zNameInObject
    );

    const decelerationBeginning = `${modifier}${property.isStatic ? 'static ' : ''}var ${propertyName}`;

    return `${decelerationBeginning}: ${type} {\n${indentMultilineString(value, 1)}\n}`;
  }

  convertTokenTypeAndValue(
    tokenValueType: string,
    value: any,
    propertyName: string = '',
    zNameInObject: string = ''
  ): { type: string; value: string } {
    switch (tokenValueType) {
      case 'string':
        return { type: 'String', value: `"${value}"` };
      case 'number':
        const number = parseFloat(value);
        return { type: 'CGFloat', value: `${number}` };
      case 'boolean':
        return { type: 'Bool', value: value };
      case 'color-computedProperty':
        return { type: 'DSColor', value: value };
      case 'color':
        var [_, lightThemeColor, darkThemeColor] = value.split('#');

        const camelCasedNameInObject = getPropertyName(zNameInObject, '', jsonKeyMap);
        if (!this.generatedColorFolderNames[camelCasedNameInObject]) {
          const colorFolder = this.createColorFolder(camelCasedNameInObject, lightThemeColor, darkThemeColor);
          this.xcAssetsFolder.subFolders.push(colorFolder);
          this.generatedColorFolderNames[camelCasedNameInObject] = 1;
        }
        return { type: 'SwiftUI.Color', value: this.generateColorObjectDecelerationFrom(camelCasedNameInObject) };
    }

    if (tokenValueType.endsWith('-object') || tokenValueType === 'valueContainerObject')
      return { type: value.struct.name, value: this.generateInstanceDeceleration(value) };

    if (tokenValueType.endsWith('-array'))
      return { type: `[${value[0].struct.name}]`, value: this.generateArrayOfInstancesDeceleration(value) };
  }

  createColorFolder(colorName: string, lightThemeColor: string, darkThemeColor: string): Folder {
    return new ColorSetFolder(colorName, lightThemeColor, darkThemeColor);
  }

  generateColorObjectDecelerationFrom(propertyName: string): string {
    return `SwiftUI.Color(.${propertyName})`;
  }

  generateInstanceDeceleration(instance: InstanceData): string {
    this.numberOfIndentations++;
    var indentation = '    '.repeat(this.numberOfIndentations);
    let propertyValues = instance.propertyValues
      .map(propertyValue => {
        const { value } = this.convertTokenTypeAndValue(
          propertyValue.type,
          propertyValue.value,
          propertyValue.name,
          propertyValue.zNameInObject
        );
        return `${propertyValue.name}: ${value}`;
      })
      .map(statement => indentation + statement)
      .join(',\n');

    this.numberOfIndentations--;
    indentation = '    '.repeat(this.numberOfIndentations);
    const deceleration = `${instance.struct.name}(\n${propertyValues}\n${indentation})`;
    return deceleration;
  }

  generateArrayOfInstancesDeceleration(instances: InstanceData[]): string {
    let instancesDecelerations = instances
      .map(structInstance => this.generateInstanceDeceleration(structInstance))
      .join(', ');

    return `[${instancesDecelerations}]`;
  }

  generateDecelerationStatement(declaration: Declaration): string {
    return this.generatePropertyDeclaration(declaration);
  }

  private getStringifiedNumberAsFloat(number: number): string {
    return `${number}${Number.isInteger(number) ? '.0' : ''}`;
  }
}
