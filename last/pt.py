for count in range(1 , 6 , +1):
    for counter in range(count):
        print("* " , end=" ")
    print()

for count in range(6 , 0 , -1):
    for counter in range(count):
        print("* " , end=" ")
    print()


for count in range(1 , 6):
    for number in range(6 - count):
        print(end=" ")
    for counter in range(count):
        print("*" , end=" ")
    print()

#for count in range(6 , 1 , -1):
#    for counter in range(count):
#        print("* " , end=" ")
#    print()
