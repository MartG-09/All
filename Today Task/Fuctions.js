const prompt = require("prompt-sync")()
function acceptAge(age) {
    age = prompt("Enter age :  ")

    if (age > -1 && age < 13){
            return "child";
    }

   else if (age > 12 && age < 20){
            return "Teen";
    }

    
    else if (age > 19){
            return "Adult";
    }
        return "invalid age";
}

        console.log(acceptAge())
