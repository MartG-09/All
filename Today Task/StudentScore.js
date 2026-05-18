let scores = (score) => {

        if (score >= 70){
            console.log("A")
        }
            else if (score <= 69 && score > 59){
                    console.log("B")
            }
                else if (score <= 59 && score > 49){
                      console.log("C")
                }
                    else if (score <= 49 && score > 39){
                        console.log("D")
                }
             else if (score < 40){
                    console.log("F")
            }

}

scores(50)
