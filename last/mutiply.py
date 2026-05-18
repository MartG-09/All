#Collect input from user
#Save it (number)
#use for loop to iterate it
#print number * count


number = int(input("Enter number: "))

for count in range(1, 11):
    print(number ,  " x " , count , "= " , (number*count))
