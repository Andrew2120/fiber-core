import { File } from './File';
import * as fs from 'fs';

export class Folder {
  name: string;
  subFolders: Folder[];
  files: File[];

  constructor(name: string, subFolders: Folder[] = [], files: File[] = []) {
    this.name = name;
    this.subFolders = subFolders;
    this.files = files;
  }

  generate(path: string = './') {
    fs.mkdirSync(path + this.name);
    const subPath = path + `${this.name}/`;
    this.files.forEach(file => file.generate(subPath));
    this.subFolders.forEach(subFolder => subFolder.generate(subPath));
  }
}
