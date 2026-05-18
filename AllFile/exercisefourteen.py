age = int(input("Enter your age: "))
max_heart_rate = (220 - age)
print("your max heart age: " , max_heart_rate) 
 
low_target_rate = (0.5 * max_heart_rate)
upper_target_rate = (0.85 * max_heart_rate)

print("Your heart range is " , low_target_rate , "and" , upper_target_rate)
