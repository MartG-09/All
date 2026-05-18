const prompt = require("prompt-sync")()
    let numberOne = Number(prompt("Enter number:  "))
        let numberTwo = Number(prompt("Enter number:  "))

    let num = numberOne
        numberOne = numberTwo
        numberTwo = num

    console.log(`Numbers swapped is: First number is ${numberOne} , Second number is ${numberTwo}`)
