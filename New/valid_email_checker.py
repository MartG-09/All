def validate_email(email):
    email = str(email)
    length = len(email)
    
    if (length < 8):
        return "invalid"
    else:
        return "valid"
print(validate_email("sorryb"))
     
