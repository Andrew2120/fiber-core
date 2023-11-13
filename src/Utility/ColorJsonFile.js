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
exports.ColorJSONFile = void 0;
var File_1 = require("./File");
var Helpers_1 = require("./Helpers");
var ColorJSONFile = /** @class */ (function (_super) {
    __extends(ColorJSONFile, _super);
    function ColorJSONFile(lightThemeColorHex, darkThemeColorHex) {
        var _this = _super.call(this, 'Contents', 'json') || this;
        _this.lightThemeColorHex = lightThemeColorHex;
        _this.darkThemeColorHex = darkThemeColorHex;
        _this.colors = _this.getColorElements();
        _this.info = _this.getInfo();
        _this.content = JSON.stringify({
            colors: _this.colors,
            info: _this.info,
        });
        return _this;
    }
    ColorJSONFile.prototype.getColorElements = function () {
        var anyAppearanceColor = this.getAnyAppearanceColor();
        var darkAppearanceColor = this.getDarkAppearanceColor();
        return [anyAppearanceColor, darkAppearanceColor];
    };
    ColorJSONFile.prototype.getAnyAppearanceColor = function () {
        return {
            color: this.getColorFormHex(this.lightThemeColorHex),
            idiom: "universal",
        };
    };
    ColorJSONFile.prototype.getDarkAppearanceColor = function () {
        return {
            color: this.getColorFormHex(this.darkThemeColorHex),
            appearances: [
                {
                    appearance: 'luminosity',
                    value: 'dark',
                },
            ],
            idiom: "universal",
        };
    };
    ColorJSONFile.prototype.getColorFormHex = function (hexString) {
        var colorSpace = 'srgb';
        var rgbaColor = (0, Helpers_1.convertHexColorStringToRGBAColor)(hexString);
        var colorComponents = {
            alpha: "".concat((rgbaColor.alpha / 255).toFixed(3)),
            blue: "".concat((rgbaColor.blue / 255).toFixed(3)),
            green: "".concat((rgbaColor.green / 255).toFixed(3)),
            red: "".concat((rgbaColor.red / 255).toFixed(3)),
        };
        return {
            'color-space': colorSpace,
            components: colorComponents,
        };
    };
    ColorJSONFile.prototype.getInfo = function () {
        return { author: 'xcode', version: 1 };
    };
    return ColorJSONFile;
}(File_1.File));
exports.ColorJSONFile = ColorJSONFile;
