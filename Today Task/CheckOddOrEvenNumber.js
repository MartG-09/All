const prompt = require("prompt-sync")()
    let number = Number(prompt("Enter number :  "))

    if (number % 2 === 0){
            console.log(number , "is Even")
    }

    else{
            console.log(number , "is Odd")
    }
