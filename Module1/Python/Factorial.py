print("Check the factorial of a number.")
number = int(input("Pick a number: "))
result = 1

for n in range(1, number+1):
    result *= n
    print(n)
print("the result is", result)

# Factorial with WHILE
#baseNumber = 1
#while baseNumber <= number:
    #result *= baseNumber
    #baseNumber += 1
#print(result)


