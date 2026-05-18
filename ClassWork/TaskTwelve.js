const personal = { name : "Nzozi" , age : 25}
    const professional = { role : "Developer" , company : "Semicolon"}

    const dog = { ...personal , ...professional}

    console.log(dog)
