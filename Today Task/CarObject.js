let isBoolean = (brand , model) => {

        const car = {
                brand : "toyota" ,
                model : "camry"
        }

    if  (brand.toLowerCase() === car.brand && model.toLowerCase() === car.model){
            return "This car is available"
    }
        else
            return "It is not available"

}

console.log(isBoolean("ToyOTA" , "CAMry"))
