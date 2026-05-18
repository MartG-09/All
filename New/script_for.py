for count in range(1, 10):
    print(count , end="   ")
    for counter in range(1, 10):
        print(f"{count * counter:>3}" , end="  ")
    print( )
