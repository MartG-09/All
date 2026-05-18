number = int(input("Enter number: "))

while (number > 0):
    print (number , end=" ")
    newnum = number - 1
 
    count = newnum
    while (count > 0):
        print (count , end=" ")
        count = count - 1
    number = number - 1
    print()
