const prompt = require("prompt-sync")()
    let length = Number(prompt("Enter length of triangle:  "))

    let area = ((3**0.5) / 4) * length**2

let volume = area * length
        console.log(volume)
