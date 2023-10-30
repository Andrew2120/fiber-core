import { AccessModifier } from './Utility/Types';

export type Nullable<T> = T | null;

export interface Property {
  accessModifier: AccessModifier;
  isStatic: boolean;
  hasDefaultValue: boolean;
  isConstant: boolean;
  name: string;
  type: string;
  value: Nullable<string | number | Struct | StructInstance | Array<any>>;
}

export interface Struct {
  accessModifier: AccessModifier;
  name: string;
  properties: Property[];
}

export interface PropertyValue {
  name: string;
  type: string;
  value: Nullable<string | number | Struct | StructInstance | Array<any>>;
}

export interface StructInstance {
  struct: Struct;
  propertyValues: PropertyValue[];
}

export interface Declaration extends Property {}
