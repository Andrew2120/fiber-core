"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ObjectPath = exports.StructNamesSet = exports.StructsSet = void 0;
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
var StructNamesSet = /** @class */ (function () {
    function StructNamesSet(structNames) {
        var _this = this;
        this.numberOfOccurrencesByStructName = {};
        structNames.forEach(function (structName) { return _this.append(structName); });
    }
    StructNamesSet.prototype.values = function () {
        return Object.values(this.numberOfOccurrencesByStructName);
    };
    StructNamesSet.prototype.includes = function (structName) {
        return !!this.numberOfOccurrencesByStructName[structName];
    };
    StructNamesSet.prototype.append = function (structName) {
        var numberOfOccurrences = this.numberOfOccurrencesByStructName[structName];
        if (typeof numberOfOccurrences === 'number') {
            this.numberOfOccurrencesByStructName[structName] = numberOfOccurrences + 1;
            return structName + numberOfOccurrences;
        }
        else {
            this.numberOfOccurrencesByStructName[structName] = 1;
            return structName;
        }
    };
    return StructNamesSet;
}());
exports.StructNamesSet = StructNamesSet;
var ObjectPath = /** @class */ (function () {
    function ObjectPath() {
        this.keys = [];
    }
    ObjectPath.prototype.path = function () {
        return this.keys.join('.');
    };
    ObjectPath.prototype.push = function (key) {
        this.keys.push(key);
    };
    ObjectPath.prototype.pop = function () {
        this.keys.pop();
    };
    return ObjectPath;
}());
exports.ObjectPath = ObjectPath;
