"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Folder = void 0;
var fs = require("fs");
var Folder = /** @class */ (function () {
    function Folder(name, subFolders, files) {
        if (subFolders === void 0) { subFolders = []; }
        if (files === void 0) { files = []; }
        this.name = name;
        this.subFolders = subFolders;
        this.files = files;
    }
    Folder.prototype.generate = function (path) {
        if (path === void 0) { path = './'; }
        fs.mkdirSync(path + this.name);
        var subPath = path + "".concat(this.name, "/");
        this.files.forEach(function (file) { return file.generate(subPath); });
        this.subFolders.forEach(function (subFolder) { return subFolder.generate(subPath); });
    };
    return Folder;
}());
exports.Folder = Folder;
