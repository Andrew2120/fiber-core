import { File } from './File';
import { Folder } from './Folder';

export class XcodeAssetsFolder extends Folder {
  constructor(name: string, subFolders: Folder[] = [], files: File[] = []) {
    const contentsFileContent = JSON.stringify({
      info: {
        author: 'xcode',
        version: 1,
      },
    });
    const contentsFile = new File('Contents', 'json', contentsFileContent);

    super(`${name}.xcassets`, subFolders, [...files, contentsFile]);
  }
}
