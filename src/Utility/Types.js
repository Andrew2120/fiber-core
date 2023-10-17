"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StructsSet = void 0;
var Helpers_1 = require("./Helpers");
var StructsSet = /** @class */ (function () {
    function StructsSet(structs) {
        var _this = this;
        this.structsBySignature = {};
        structs.forEach(function (struct) { return _this.append(struct); });
    }
    StructsSet.prototype.values = function () {
        return Object.values(this.structsBySignature);
    };
    StructsSet.prototype.includes = function (struct) {
        var structSignature = (0, Helpers_1.getStructSignature)(struct);
        return !!this.structsBySignature[structSignature];
    };
    StructsSet.prototype.append = function (struct) {
        var newStructSignature = (0, Helpers_1.getStructSignature)(struct);
        this.structsBySignature[newStructSignature] = struct;
    };
    return StructsSet;
}());
exports.StructsSet = StructsSet;
