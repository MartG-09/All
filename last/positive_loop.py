#A progam that keep asking the to enter a positive number

number = int((input("Enter a postive number:  ")))

while(number < 0):
    number = int((input("Enter a postive number:  ")))
    if (number > 0):
        print ("You entered" , number)
