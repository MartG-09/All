const prompt = require("prompt-sync")()
    number = prompt("Enter number:  ")
    if(number > 0){
        console.log("Number is positive")
    }
    else if(number < 0){
        console.log("Number is negative")
    }
    else{
        console.log("Number is zero")
    }
