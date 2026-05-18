def calculate_range():
    list_input = {2 , 5 , 7 , 9 , 20}
    largest = list_input[0]

    for number in range(1 , 5):
        list_input[number]
        if (largest < list_input[number]):
            largest = list_input[number]
    print(largest)
