"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.JavaScriptLanguage = void 0;
const Config_1 = require("../Config");
class JavaScriptLanguage {
    constructor() {
        this.name = 'javascript';
        this.extension = 'js';
        this.keywords = [];
        this.output = {};
        this.initializationStatement = 'export const themeData = ';
    }
    generateThemeData(input) {
        Object.keys(input).forEach(key => {
            this.output[Config_1.mapOfTailwindNames[key] || key] = {};
        });
        this.flatObjectValues(input);
        this.output[Config_1.mapOfTailwindNames.elevation] = this.handleElevationCase(input['elevation']);
        let jsonData = {
            theme: {
                extend: Object.assign({}, this.output),
            },
            variants: {},
            plugins: [],
        };
        return this.initializationStatement + JSON.stringify(this.output, null, 2);
    }
    handleElevationCase(obj, boxShadow = {}) {
        for (const key in obj) {
            if (obj[key].value === undefined) {
                this.handleElevationCase(obj[key], boxShadow);
            }
            else {
                let singleClassContent = [];
                if (Array.isArray(obj[key].value)) {
                    for (let i = 0; i < obj[key].value.length; i++) {
                        singleClassContent.push(`${obj[key].value[i].x}px ${obj[key].value[i].y}px ${obj[key].value[i].blur}px ${obj[key].value[i].spread}px ${obj[key].value[i].color}`);
                    }
                }
                else {
                    singleClassContent.push(`${obj[key].value.x}px ${obj[key].value.y}px ${obj[key].value.blur}px ${obj[key].value.spread}px ${obj[key].value.color}`);
                }
                boxShadow[key] = singleClassContent.join(',');
            }
        }
        return boxShadow;
    }
    flatObjectValues(obj) {
        for (const key in obj) {
            if (Config_1.keysToBeExcludedFormRecursiveFunc.includes(key))
                continue;
            if (obj[key].value === undefined) {
                this.flatObjectValues(obj[key]);
            }
            else {
                const category = Config_1.mapOfTailwindNames[obj[key].type] || obj[key].type;
                if (this.output[category] === undefined) {
                    this.output[category] = {};
                }
                this.output[category][key] = obj[key].value;
            }
        }
    }
}
exports.JavaScriptLanguage = JavaScriptLanguage;
