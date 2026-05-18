from collections import Counter
def most_occuring(numbers):
    return Counter(numbers).most_common(1)[0][1]
numbers = [1,2,2,2,3]
print(most_occuring(numbers))
