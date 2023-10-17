import { Property, PropertyValue, Struct, StructInstance } from '../Struct';
import { TokenValueType } from '../Utility/Types';

export interface Language {
  name: string;
  extension: string;
  keywords: string[];
  importStatements: string;

  generateStructDeclaration(struct: Struct): string;
  generateInstanceStructDeclaration(struct: Struct): string;
  generatePropertyDeclaration(property: Property): string;
  convertTokenTypeAndValue(tokenValueType: string, value: any): { type: string; value: string };
  generateInstanceDeceleration(instance: StructInstance): string;
  generateArrayOfInstancesDeceleration(instances: StructInstance[]): string;
}
