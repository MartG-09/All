const prompt = require("prompt-sync")()

light = prompt("Enter traffic color :  ")

if (light.toLowerCase() === ("red")){
        console.log("STOP!!")    
    }

    else if (light.toLowerCase() === ("yellow")){
            console.log("Get Ready!")
        }

        else if (light.toLowerCase() === ("green")){
                 console.log("GO!!!")
            }
    else
        console.log("Wrong input!!!")
