import { ColorJSONFile } from './ColorJsonFile';
import { Folder } from './Folder';

export class ColorSetFolder extends Folder {
  constructor(colorName: string, lightThemeColorHex: string, darkThemeColorHex) {
    const folderName = `${colorName}.colorset`;
    const jsonFile = new ColorJSONFile(lightThemeColorHex, darkThemeColorHex);
    super(folderName);
    this.files = [jsonFile];
  }
}
