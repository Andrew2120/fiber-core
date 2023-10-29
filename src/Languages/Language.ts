import { Declaration, Property, Struct, StructInstance } from '../Struct';

export interface Language {
  name: string;
  extension: string;
  keywords: string[];
  importStatements: string;

  generateStructDeclaration(struct: Struct, isReferenceType: boolean): string;
  generateInstanceStructDeclaration(struct: Struct): string;
  generatePropertyDeclaration(property: Property): string;
  convertTokenTypeAndValue(tokenValueType: string, value: any): { type: string; value: string };
  generateInstanceDeceleration(instance: StructInstance): string;
  generateArrayOfInstancesDeceleration(instances: StructInstance[]): string;
  generateDecelerationStatement(declaration: Declaration): string;
}
