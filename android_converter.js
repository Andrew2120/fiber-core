const fs = require('fs');
let json = require('./test.json');

let importLibs = "import androidx.compose.ui.unit.*\n"+
                 "import androidx.compose.ui.graphics.Color\n"+
                 "import androidx.core.graphics.toColorInt\n"+
                 "import android.graphics.Color.parseColor\n"+
                 "import androidx.compose.runtime.Composable\n"+
                 "import androidx.compose.ui.platform.LocalDensity";

let customFun = "@Composable\nfun Dp.dpToPx() = with(LocalDensity.current) {\nthis@dpToPx.toPx()\n}"

let ignoreKeys=""

let generatedTypes =""
let generatedClasses =""

const generateAndroidTokensUsingJsonObject = (obj, objName = "", parentName = "") => {
    let content = "";
    let contentHeader = "";
    if (parentName.length > 0) {
        contentHeader = `\n\nobject ${parentName}_${objName[0].toUpperCase() + objName.slice(1)} {\n\n`;
    } else {
        contentHeader = `\n\nobject ${objName[0].toUpperCase() + objName.slice(1)} {\n\n`;
    }
    let contentFooter = `}\n\n`;

    Object.keys(obj).forEach((key) => {
        if (key !== "elevation") {
            if (isBaseObj(obj[key])) {
                content += convertBaseObjToVariable(objName, key, obj[key]) + "\n";
            } else if (typeof obj[key] === 'object') { // Check if the value is an object
                if (objName !== key) { // Check to prevent self-recursion
                    let newObj = generateAndroidTokensUsingJsonObject(obj[key], key, objName);
                    contentFooter += newObj;
                    content += "val " + key + " = " + objName + '_' + (key[0].toUpperCase() + key.slice(1)) + '\n';
                }
            }
        }
    });

    return contentHeader + content + contentFooter;
};



const convertBaseObjToVariable = (parentObjName = "",key ="",obj) =>{

    let objVal = Object.keys(obj);

    let variableName = getValidVariableName(key,parentObjName)
   
    let variableValue = ""
    if(obj["type"] == "color"){
        variableValue = convertValueToColor(obj["value"])
    }
    else if(obj["type"] == "borderWidth"||
             obj["type"] == "borderRadius"||
            obj["type"] == "sizing"|| 
            obj["type"] == "spacing"|| 
            obj["type"] == "opacity"|| 
            obj["type"] == "dimension"|| 

            obj["type"] == "fontSizes"|| 
            obj["type"] == "letterSpacing"||
            obj["type"] == "lineHeights" ){
                variableValue = convertValueToDimen(obj["value"])       
            }
            else if(obj["type"] == "fontWeights"){
                variableValue = obj["value"]
            }
            else if(obj["type"] == "fontFamilies"){
                variableValue = '"'+obj["value"]+'"'
            }
            else{
                if(generatedTypes.includes(obj["type"])){
                    variableValue = getCustomClassValue(obj["type"],obj["value"]) 
                }else{
                  
                    generateCustomObject(obj["type"],obj["value"])
                    variableValue = getCustomClassValue(obj["type"],obj["value"]) 

                }
            }

    return "val "+ variableName+" = " +variableValue;

}

function extractType(valueJ){
    
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
        validVariable = validVariable.replaceAll("-","_")
    }

    if(validVariable.length == 0)
    validVariable ="_0"

    return validVariable;
}

function convertValueToColor(valueJ){
    return 'Color(parseColor("'+valueJ+'"))'
     
}

function convertValueToDimen(valueJ){

    if (typeof valueJ === 'string'){
    let valideValue = valueJ
    if(valideValue.includes("dp"))
   valideValue =  valideValue.replace("dp",".dp")
   if(valideValue.includes("em"))
   valideValue =  valideValue.replace("em",".em")
   if(valideValue.includes("px"))
   valideValue =  valideValue.replace("px",".dp")

   return valideValue
}else{
    return valueJ
}
}

function getCustomClassValue(objName="",valueJ){

let content = `${objName[0].toUpperCase()+objName.slice(1)}Data(`

Object.keys(valueJ).forEach((key) =>{

    let type = getTypeOf(valueJ[key])
    if(type == "Color"){
        content += convertValueToColor(valueJ[key])+","
    }
    else if(type == "Dp"){
        content += convertValueToDimen(valueJ[key])+","
    }
    else if(type == "Float"){
        content += valueJ[key]+"F,"
    }
    else{
        content += '"' +valueJ[key]+'",'
    }


})

content+=")"
return content
}
//working here now
function generateCustomObject(objName="",valueJ){


    let content = `\n\n data class ${objName[0].toUpperCase()+objName.slice(1)}Data(`


    let objVal = Object.keys(valueJ)

    objVal.forEach((key) =>{
        let type = getTypeOf(valueJ[key])

        content += 'val '+key+":"+type+","

    })

    content+=")\n\n"

    generatedClasses += content
        generatedTypes += objName+" , "


}

const getTypeOf = value => {
    if (typeof value === 'string'){
        if(value.includes("#")){

            return "Color"
        }else if(value.includes("px")||value.includes("em")||value.includes("dp")){
            return "Any"
        }
        
        else{
            return "String"
        }
    }
    if (typeof value === 'number') {
        return "Any"
    }

}

function convertValueToTypography(valueJ){

    let validValue = "object{\n"
    let objVal = Object.keys(valueJ)
    objVal.forEach((key) => {
        
        if(key == "fontFamily"){
            validValue += "val "+ key +" = "+'"'+valueJ[key]+'"'+"\n"
        }
        else{
            let newVal = convertValueToDimen(valueJ[key])
        validValue += "val "+ key +" = "+newVal+"\n"
        }
    })

    return validValue+"\n}\n"
}


const isBaseObj =(obj) =>{

    let contentObj = Object.keys(obj)
    
    if(contentObj.length == 2 && contentObj[0]== "value" &&contentObj[1] == "type" ){
        return true
    }

    return false
}


let content = generateAndroidTokensUsingJsonObject(json, "BTokens");

fs.writeFile('./BTokens.kt', importLibs+content+generatedClasses, err => {
  if (err) {
    console.error(err);
  }
  // file written successfully
});
