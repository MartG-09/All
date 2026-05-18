import random

print('''== S U B T R A C T I O N  A P P ==
  🤥️ learn how subtract here 🤔️
            ''')

difference = 0
j = 0

for count in range(1 , 11):

    number_one = random.randrange(20)
    number_two = random.randrange(20)

    for num in range(1 , 3):    


        if (number_one > number_two):
            difference = number_one - number_two
            print(count , ": What's the diferrence between   " , number_one , "-" , number_two , "?")

        elif (number_two , "-" , number_one):
            difference = number_two - number_one
            print(count , ": What's the diferrence between   " , number_two , "-" , number_one , "?")

        answer = int(input("Answer :  "))

        if (difference == answer):
            j = j+ 1
            break
        else:
            print("Wrong , try again")
print("You got" , j , "out of 10 questions. ")
