const prompt = require("prompt-sync")()

function validateLogin(userName , passWord){

        userName = prompt("Enter Username :  ")
        passWord = Number(prompt("Enter password :  "))

        const validName = "Martins09"
        const validPassWord = 202409

    if(userName === validName && passWord === validPassWord){
        return "Login Successful!!!"
    }

    else{
            return "Invalid username or password!!"
    }

}

console.log(validateLogin())
