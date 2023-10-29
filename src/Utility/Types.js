"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StructNamesSet = exports.StructsSet = void 0;
const Helpers_1 = require("./Helpers");
class StructsSet {
    structsBySignature = {};
    constructor(structs) {
        structs.forEach(struct => this.append(struct));
    }
    values() {
        return Object.values(this.structsBySignature);
    }
    includes(struct) {
        const structSignature = (0, Helpers_1.getStructSignature)(struct);
        return !!this.structsBySignature[structSignature];
    }
    append(struct) {
        const newStructSignature = (0, Helpers_1.getStructSignature)(struct);
        this.structsBySignature[newStructSignature] = struct;
    }
}
exports.StructsSet = StructsSet;
class StructNamesSet {
    numberOfOccurrencesByStructName = {};
    constructor(structNames) {
        structNames.forEach(structName => this.append(structName));
    }
    values() {
        return Object.values(this.numberOfOccurrencesByStructName);
    }
    includes(structName) {
        return !!this.numberOfOccurrencesByStructName[structName];
    }
    append(structName) {
        // this.numberOfOccurrencesByStructName[structName] = struct;
        //   const originalStructName = capitalizeFirstLetter(name) + 'ValuesContainer';
        // let structName = originalStructName;
        const numberOfOccurrences = this.numberOfOccurrencesByStructName[structName];
        if (typeof numberOfOccurrences === 'number') {
            this.numberOfOccurrencesByStructName[structName] = numberOfOccurrences + 1;
            return structName + numberOfOccurrences;
        }
        else {
            this.numberOfOccurrencesByStructName[structName] = 1;
            return structName;
        }
    }
}
exports.StructNamesSet = StructNamesSet;
