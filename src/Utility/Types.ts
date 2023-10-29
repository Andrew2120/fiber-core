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

export class StructNamesSet {
  private numberOfOccurrencesByStructName = {};

  constructor(structNames: string[]) {
    structNames.forEach(structName => this.append(structName));
  }

  values(): string[] {
    return Object.values(this.numberOfOccurrencesByStructName);
  }

  includes(structName: string) {
    return !!this.numberOfOccurrencesByStructName[structName];
  }

  append(structName: string) {
    // this.numberOfOccurrencesByStructName[structName] = struct;
    //   const originalStructName = capitalizeFirstLetter(name) + 'ValuesContainer';
    // let structName = originalStructName;

    const numberOfOccurrences = this.numberOfOccurrencesByStructName[structName];

    if (typeof numberOfOccurrences === 'number') {
      this.numberOfOccurrencesByStructName[structName] = numberOfOccurrences + 1;
      return structName + numberOfOccurrences;
    } else {
      this.numberOfOccurrencesByStructName[structName] = 1;
      return structName;
    }
  }
}
