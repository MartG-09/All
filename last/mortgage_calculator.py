principal = int(input("Enter principal: "))
rate = int(input("Enter rate: "))
duration = int(input("Enter duration of loan: "))

p = principal
r = rate / 1200 
n = duration * 12

mortgage = (p * r *((1+r) ** n)) / (((1+r)**n ) - 1)

m = mortgage
print(m)
