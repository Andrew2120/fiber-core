import { Property, Struct, StructInstance } from '../Struct';
import { InconsistentArgumentsError } from '../Errors/InconsistentArgumentsError';
import { indentStatements as indentStatements } from '../Utility/Helpers';
import { mapOfTailwindNames, keysToBeExcludedFormRecursiveFunc } from '../Config';
import { JSLanguage } from './Language';

export class JavaScriptLanguage implements JSLanguage {
  name = 'javascript';
  extension = 'js';
  keywords = [];
  output= {}

  initializationStatement: string = 'export const themeData =';

  generateThemeData(input:object): string {
    Object.keys(input).forEach(key => {
      this.output[mapOfTailwindNames[key] || key] = {}
    })
    this.flatObjectValues(input);
    this.output[mapOfTailwindNames.elevation] = this.handleElevationCase(input['elevation']);
    let jsonData = {
      theme: {
        extend: { ...this.output},
      },
      variants: {},
      plugins: [],
    };
    return this.initializationStatement + JSON.stringify(this.output, null, 2);
  }

  private handleElevationCase (obj:object, boxShadow = {}) {
    for (const key in obj) {
      if (obj[key].value === undefined) {
        this.handleElevationCase(obj[key], boxShadow)
      } else {
        let singleClassContent = [];
        if(Array.isArray(obj[key].value)){
          for( let i=0 ;i< obj[key].value.length; i++){
            singleClassContent.push(`${obj[key].value[i].x}px ${obj[key].value[i].y}px ${obj[key].value[i].blur}px ${obj[key].value[i].spread}px ${obj[key].value[i].color}`)
          }
        }
        else {
          singleClassContent.push(`${obj[key].value.x}px ${obj[key].value.y}px ${obj[key].value.blur}px ${obj[key].value.spread}px ${obj[key].value.color}`)
        }
        boxShadow[key] = singleClassContent.join(',');
      }
    }
    return boxShadow;
  }

  private flatObjectValues(obj:object) {
    for (const key in obj) {
      if (keysToBeExcludedFormRecursiveFunc.includes(key)) continue ;
      if (obj[key].value === undefined ) {
        this.flatObjectValues(obj[key])
      } else {
        const category = mapOfTailwindNames[obj[key].type] || obj[key].type;
        if(this.output[category] === undefined) {
          this.output[category] = {}
        }
        this.output[category][key] = obj[key].value;
      }
    }
  }

}
