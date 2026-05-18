numberone = (int(input("Enter first number: ")))
numbertwo = (int(input("Enter second number: ")))
numberthree = (int(input("Enter third number: ")))

sum = numberone + numbertwo + numberthree
product = numberone*numbertwo*numberthree
average = (float(numberone + numbertwo + numberthree)/3)
print("Sum is: " , sum)
print("Product is: " , product)
print("Average is: " , average)

largest = numberone
if numbertwo > largest:
    largest = numbertwo
if numberthree > largest:
    largest = numberthree
print("The largest is: " ,  largest)

smallest = numberone
if numbertwo < largest:
    smallest = numbertwo
if numberthree < largest:
    smallest = numberthree
print("The smallest is: " ,  smallest)
