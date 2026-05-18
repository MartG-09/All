const prompt = require("prompt-sync")()

days = prompt("Enter any days of the week :  ")

switch (days.toLowerCase()){

        case "monday" : 
            console.log("It a weekday .")
            break;

        case "tuesday" : 
            console.log("It a weekday .")
            break;

        case "wednesday" : 
            console.log("It a weekday .")
            break;

        case "thursday" : 
            console.log("It a weekday .")
            break;

        case "friday" : 
            console.log("It a weekday .")
            break;

        case "saturday" : 
            console.log("It a weekend .")
            break;

        case "sunday" : 
            console.log("It a weekend .")
            break;

}
