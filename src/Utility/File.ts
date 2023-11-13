import * as fs from 'fs';

export class File {
  name: string;
  extension: string;
  content: string;

  constructor(name: string, extension: string, content: string = '') {
    this.name = name;
    this.extension = extension;
    this.content = content;
  }

  generate(path: string = './') {
    fs.writeFileSync(`${path}${this.name}.${this.extension}`, this.content);
  }
}
