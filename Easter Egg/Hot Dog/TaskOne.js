const prompt = require("prompt-sync")()
    let miles = Number(prompt("Enter miles:  "))
        
    let kilometre = miles * 1.6
        console.log(`${miles} miles is ${kilometre} kilometre`)
