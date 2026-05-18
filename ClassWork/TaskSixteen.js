const user = {
        age : 25 , 
        country : "Nigeria"
    }

let access;
        if (user.age >= 18 && user.country === "Nigeria"){
            access = "Allow access"
        }

                else{
                    access = "Access denied"            
                }

    console.log(access)
