"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StructsSet = void 0;
const Helpers_1 = require("./Helpers");
class StructsSet {
    constructor(structs) {
        this.structsBySignature = {};
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
