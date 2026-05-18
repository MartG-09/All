#A sentinel program that stop on 0

number = int(input("Enter number;  "))

total = 0
count = 1
while (True):

    total = total + number
    number = int(input("Enter number:  "))
    if (number == 0):
        break
    count = count + 1
print("Total" , total)
