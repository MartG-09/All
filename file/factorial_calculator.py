#Calculate the factorial

number = int(input("Enter number:  "))

#less = number - 1

count = 1
while (count <= number):
    counter = count
    while (counter <= number):
        less = number - count
        counter = counter + 1
    factorial = number * less
    count = count + 1
print(factorial)
