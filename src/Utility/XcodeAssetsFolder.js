"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.XcodeAssetsFolder = void 0;
var File_1 = require("./File");
var Folder_1 = require("./Folder");
var XcodeAssetsFolder = /** @class */ (function (_super) {
    __extends(XcodeAssetsFolder, _super);
    function XcodeAssetsFolder(name, subFolders, files) {
        if (subFolders === void 0) { subFolders = []; }
        if (files === void 0) { files = []; }
        var contentsFileContent = JSON.stringify({
            info: {
                author: 'xcode',
                version: 1,
            },
        });
        var contentsFile = new File_1.File('Contents', 'json', contentsFileContent);
        return _super.call(this, "".concat(name, ".xcassets"), subFolders, __spreadArray(__spreadArray([], files, true), [contentsFile], false)) || this;
    }
    return XcodeAssetsFolder;
}(Folder_1.Folder));
exports.XcodeAssetsFolder = XcodeAssetsFolder;
