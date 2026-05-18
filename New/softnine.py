time = int(input("Enter time in seconds: "))

hours = int(time / 3600)
minutes = int((time % 3600)/60)
seconds = int((time % 3600)%60)

print(hours , "hrs" , minutes , "mins" , seconds , "sec")
