import { AccessModifier } from './Utility/Types';

export type Nullable<T> = T | null;

export interface Property {
  accessModifier: AccessModifier;
  isStatic: boolean;
  hasDefaultValue: boolean;
  isConstant: boolean;
  nameInObject: string;
  name: string;
  type: string;
  value: Nullable<string | number | TypeData | InstanceData | Array<any>>;
}

export type ComputedProperty = Property;

export interface TypeData {
  accessModifier: AccessModifier;
  name: string;
  properties: Property[];
  computedProperties: Property[];
}

export interface PropertyValue {
  name: string;
  type: string;
  value: Nullable<string | number | TypeData | InstanceData | Array<any>>;
}

export interface InstanceData {
  struct: TypeData;
  propertyValues: PropertyValue[];
}

export interface Declaration extends Property {}
