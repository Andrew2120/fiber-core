"use strict";
var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.JavaScriptLanguage = void 0;
var Config_1 = require("../Config");
var JavaScriptLanguage = /** @class */ (function () {
    function JavaScriptLanguage() {
        this.name = 'javascript';
        this.extension = 'js';
        this.keywords = [];
        this.output = {};
        this.initializationStatement = 'export const themeData =';
    }
    JavaScriptLanguage.prototype.generateThemeData = function (input) {
        var _this = this;
        Object.keys(input).forEach(function (key) {
            _this.output[Config_1.mapOfTailwindNames[key] || key] = {};
        });
        this.flatObjectValues(input);
        this.output[Config_1.mapOfTailwindNames.elevation] = this.handleElevationCase(input['elevation']);
        var jsonData = {
            theme: {
                extend: __assign({}, this.output),
            },
            variants: {},
            plugins: [],
        };
        return this.initializationStatement + JSON.stringify(this.output, null, 2);
    };
    JavaScriptLanguage.prototype.handleElevationCase = function (obj, boxShadow) {
        if (boxShadow === void 0) { boxShadow = {}; }
        for (var key in obj) {
            if (obj[key].value === undefined) {
                this.handleElevationCase(obj[key], boxShadow);
            }
            else {
                var singleClassContent = [];
                if (Array.isArray(obj[key].value)) {
                    for (var i = 0; i < obj[key].value.length; i++) {
                        singleClassContent.push("".concat(obj[key].value[i].x, "px ").concat(obj[key].value[i].y, "px ").concat(obj[key].value[i].blur, "px ").concat(obj[key].value[i].spread, "px ").concat(obj[key].value[i].color));
                    }
                }
                else {
                    singleClassContent.push("".concat(obj[key].value.x, "px ").concat(obj[key].value.y, "px ").concat(obj[key].value.blur, "px ").concat(obj[key].value.spread, "px ").concat(obj[key].value.color));
                }
                boxShadow[key] = singleClassContent.join(',');
            }
        }
        return boxShadow;
    };
    JavaScriptLanguage.prototype.flatObjectValues = function (obj) {
        for (var key in obj) {
            if (Config_1.keysToBeExcludedFormRecursiveFunc.includes(key))
                continue;
            if (obj[key].value === undefined) {
                this.flatObjectValues(obj[key]);
            }
            else {
                var category = Config_1.mapOfTailwindNames[obj[key].type] || obj[key].type;
                if (this.output[category] === undefined) {
                    this.output[category] = {};
                }
                this.output[category][key] = obj[key].value;
            }
        }
    };
    return JavaScriptLanguage;
}());
exports.JavaScriptLanguage = JavaScriptLanguage;
