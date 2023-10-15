const fs = require('fs');
let json = require('./output-tokens.json');

let objectTypeCashe = {};
let importLibs = "import androidx.compose.ui.unit.*\n"+
                 "import androidx.compose.ui.graphics.Color\n"+
                 "import androidx.core.graphics.toColorInt";

const generateAndroidTokensUsingJsonObject = (obj, objName) => {
   

    let content = "";

    content +=importLibs;

    
    let  colorsToken = obj["color"];

    Object.keys(colorsToken).forEach((key)=>{

        content += convertObjToAndroidObjectClass(key,colorsToken[key]);

    });


    return content;
}

const convertObjToAndroidObjectClass = (objName="",obj) =>{
    let content = ""
    let contentHeader = `\n\nobject ${objName[0].toUpperCase()+objName.slice(1)} {\n\n`;
    let contentFooter = `}\n\n`;

    content += contentHeader;

    Object.keys(obj).forEach((key) => {
       content += convertBaseObjToVariable(objName,key,obj[key]) +"\n";

    });



    content += contentFooter;

    return content; 
}

const convertBaseObjToVariable = (parentObjName = "",key ="",obj) =>{

    let objVal = Object.keys(obj);

    let variableName = getValidVariableName(key,parentObjName)
   
    let variableValue = ""
    if(obj["type"] == "color"){
        variableValue = convertValueToColor(obj["value"])
    }

    return "val "+ variableName+" = " +variableValue;

}

function getValidVariableName(variableName="",parentClassName=""){

    let validVariable = variableName;

    if(validVariable.includes(parentClassName)){
        validVariable =  validVariable.replace(parentClassName,"")
    }

    if(validVariable.includes("-+")){
        validVariable = validVariable.replace("-+","_Plus_")
    }

    if(validVariable.includes("--")){
        validVariable = validVariable.replace("--","_min_")
    }

    if(validVariable.includes("-")){
        validVariable = validVariable.replace("-","_")
    }

    if(validVariable.length == 0)
    validVariable ="_0"

    return validVariable;
}
function convertValueToColor(valueJ){

    return 'Color("'+valueJ+'".toColorInt())'
}

const isObjContainObj = (obj) =>{
    Object.keys(obj).forEach((key) => {
        if (typeof obj[key] === 'object'){
            return true
        }
    });

return false;
}

const isBaseObj =(obj) =>{

    let contentObj = Object.keys(obj)
    
    if(contentObj.length == 2 && contentObj[0]== "value" &&contentObj[1] == "type" ){
        return true
    }

    return false
}



const getTypeOf = value => {
    if (typeof value === 'string') return "String"
    if (typeof value === 'number') {
        if (Number.isInteger(value)) return "Int"
        return "CGFloat"
    }

}

const getObjectSignutre = (obj) => {
    let sortedKeys = Object.keys(obj).sort((a, b) => a - b);
    let values = sortedKeys.map((key) => obj[key]);
    let valueTypes = values.map(value => {
        if (typeof value === 'object')
            return getObjectSignutre(value);
        return getTypeOf(value);
    });

    return sortedKeys.join("") + valueTypes.join("");
}

let content = generateAndroidTokensUsingJsonObject(json, "Generated");

fs.writeFile('./BTokens.kt', content, err => {
  if (err) {
    console.error(err);
  }
  // file written successfully
});
