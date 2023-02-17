num1 = int(input("Please type a number: "))
num2 = int(input("Please type a number: "))

print("+ Add")
print("- Subtract")
print("x Multiply")
print("/ Divide")
print("s Square")


operation = input("Type the operator sign which corresponds to the operation: ")

if operation == "+":
    print("You have chosen sum the numbers")
    print("The result is", num1 + num2)
elif operation == '-':
    print("You have chosen subtract the numbers")
    print("The result is", num1 - num2)
elif operation == 'x':
    print("You have chosen multiply the numbers")
    print("The result is", num1 * num2)
elif operation == "/":
    print("You have chosen divide the numbers")
    print("The result is", num1 / num2)
elif operation == "s":
    print("You have chosen square the numbers")
    print("The result is", pow(num1, num2))
else:
    print("You didn't chose the correct operator. Try again!")
print("Thank you for using the calculator!")





