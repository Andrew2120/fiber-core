import { Struct } from '../Struct';
import { getStructSignature } from './Helpers';

export type AccessModifier = 'public' | 'private' | 'internal';

export type TokenValueType =
  | 'string'
  | 'number'
  | 'color'
  | 'px'
  | 'em'
  | 'array'
  | 'valueContainerObject'
  | 'object'
  | string;

export class StructsSet {
  private structsBySignature = {};

  constructor(structs: Struct[]) {
    structs.forEach(struct => this.append(struct));
  }

  values(): Struct[] {
    return Object.values(this.structsBySignature);
  }

  includes(struct: Struct) {
    const structSignature = getStructSignature(struct);
    return !!this.structsBySignature[structSignature];
  }

  append(struct: Struct) {
    const newStructSignature = getStructSignature(struct);
    this.structsBySignature[newStructSignature] = struct;
  }
}
