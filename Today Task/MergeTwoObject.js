let mergeObjects = () => {

    const personal = {
        name : "Kemi" , 
        age : 27
    
    }

    const professional = {
        role : "Designer" , 
        company : "TechCorp"
    
    }

        const merge = { ...personal , ...professional}
        console.log(merge)
}

mergeObjects()
