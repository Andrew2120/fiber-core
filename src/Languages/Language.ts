import { Declaration, Property, TypeData, InstanceData } from '../Struct';
import { File } from '../Utility/File';
import { Folder } from '../Utility/Folder';

export interface Language {
  name: string;
  extension: string;
  keywords: string[];
  importStatements: string;
  generatedFiles: File[];
  generatedFolders: Folder[];

  generateStructDeclaration(struct: TypeData, isReferenceType: boolean): string;
  generateInstanceStructDeclaration(struct: TypeData): string;
  generatePropertyDeclaration(property: Property): string;
  convertTokenTypeAndValue(tokenValueType: string, value: any): { type: string; value: string };
  generateInstanceDeceleration(instance: InstanceData): string;
  generateArrayOfInstancesDeceleration(instances: InstanceData[]): string;
  generateDecelerationStatement(declaration: Declaration): string;
}

export interface JSLanguage {
  name: string;
  extension: string;
  keywords: string[];
  initializationStatement: string;

  generateThemeData(input: object): string;
}
