#def length_string(words):
#    count = 0
#    for letter in words:
#        count = count + 1
#    return count
#
#
#def reverse_string(words):
#    reverse_word = " "
#    for numbers in words:
#        reverse_word =  numbers + reverse_word
#    return reverse_word
#
#def return_time(minute):
#    seconds = minute * 60
#    hour = minute / 60
#    return seconds , hour
#
#def check_vowel(word):
#    vowel = ['a' , 'e' , 'i' , 'o' 'u']
#    count = 0;
#    for letter in vowel:
#        for each in word:
#            if vowel[count] == each:
#                count = count + 1
#    return count

def isPrime(number):
    (if number == 1):
        return False
    num = int(number / 2) + 1
    for count in range(2 , num):
        if (number % count == 0):
            return False
    return True
        


#word = "pineapple"
#words = "man"
#minute = 30
number = 4
#print(length_string(words))
#print(reverse_string(words))
#print(return_time(minute))
#print(check_vowel(word))
print(isPrime(number))



