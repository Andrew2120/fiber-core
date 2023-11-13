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
Object.defineProperty(exports, "__esModule", { value: true });
exports.ColorSetFolder = void 0;
var ColorJsonFile_1 = require("./ColorJsonFile");
var Folder_1 = require("./Folder");
var ColorSetFolder = /** @class */ (function (_super) {
    __extends(ColorSetFolder, _super);
    function ColorSetFolder(colorName, lightThemeColorHex, darkThemeColorHex) {
        var _this = this;
        var folderName = "".concat(colorName, ".colorset");
        var jsonFile = new ColorJsonFile_1.ColorJSONFile(lightThemeColorHex, darkThemeColorHex);
        _this = _super.call(this, folderName) || this;
        _this.files = [jsonFile];
        return _this;
    }
    return ColorSetFolder;
}(Folder_1.Folder));
exports.ColorSetFolder = ColorSetFolder;
