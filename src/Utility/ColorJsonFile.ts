import { File } from './File';
import { convertHexColorStringToRGBAColor } from './Helpers';

export class ColorJSONFile extends File {
  colors: ColorElement[];
  info: Info;
  lightThemeColorHex: string;
  darkThemeColorHex: string;

  constructor(lightThemeColorHex: string, darkThemeColorHex: string) {
    super('Contents', 'json');

    this.lightThemeColorHex = lightThemeColorHex;
    this.darkThemeColorHex = darkThemeColorHex;

    this.colors = this.getColorElements();
    this.info = this.getInfo();

    this.content = JSON.stringify({
      colors: this.colors,
      info: this.info,
    });
  }

  getColorElements(): ColorElement[] {
    const anyAppearanceColor = this.getAnyAppearanceColor();
    const darkAppearanceColor = this.getDarkAppearanceColor();
    return [anyAppearanceColor, darkAppearanceColor];
  }

  getAnyAppearanceColor(): ColorElement {
    return {
      color: this.getColorFormHex(this.lightThemeColorHex),
      idiom: `universal`,
    };
  }

  getDarkAppearanceColor(): ColorElement {
    return {
      color: this.getColorFormHex(this.darkThemeColorHex),
      appearances: [
        {
          appearance: 'luminosity',
          value: 'dark',
        },
      ],
      idiom: `universal`,
    };
  }

  getColorFormHex(hexString: string): Color {
    const colorSpace = 'srgb';

    const rgbaColor = convertHexColorStringToRGBAColor(hexString);

    const colorComponents: ColorComponents = {
      alpha: `${(rgbaColor.alpha / 255).toFixed(3)}`,
      blue: `${(rgbaColor.blue / 255).toFixed(3)}`,
      green: `${(rgbaColor.green / 255).toFixed(3)}`,
      red: `${(rgbaColor.red / 255).toFixed(3)}`,
    };

    return {
      'color-space': colorSpace,
      components: colorComponents,
    };
  }

  getInfo(): Info {
    return { author: 'xcode', version: 1 };
  }
}

interface ColorElement {
  color: Color;
  idiom: string;
  appearances?: Appearance[];
}

interface Appearance {
  appearance: string;
  value: string;
}

interface Color {
  'color-space': string;
  components: ColorComponents;
}

interface ColorComponents {
  alpha: string;
  blue: string;
  green: string;
  red: string;
}

interface Info {
  author: string;
  version: number;
}
