"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.File = void 0;
var fs = require("fs");
var File = /** @class */ (function () {
    function File(name, extension, content) {
        if (content === void 0) { content = ''; }
        this.name = name;
        this.extension = extension;
        this.content = content;
    }
    File.prototype.generate = function (path) {
        if (path === void 0) { path = './'; }
        fs.writeFileSync("".concat(path).concat(this.name, ".").concat(this.extension), this.content);
    };
    return File;
}());
exports.File = File;
