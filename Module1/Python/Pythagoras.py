print("Pythagoras Calculator")
print("1. Find the length of A given B and C")
print("2. Find the length of B given A and C")
print("3. Find the length of C given A and B")

triangleSide = input("What's the triangle side length you'd like to find out? A, B or C? ")

if triangleSide == "a" or triangleSide == "A":
    sideB = int(input("Please input the side B: "))
    sideC = int(input("Please input the side C: "))
    print("the answer is", sideB**2 + sideC**2)
elif triangleSide == "b" or triangleSide == "B":
    sideA = int(input("Please input the side A: "))
    sideC = int(input("Please input the side C: "))
    print("the answer is", sideA**2 + sideC**2)
elif triangleSide == "c" or triangleSide == "C":
    sideA = int(input("Please input the side A: "))
    sideB = int(input("Please input the side B: "))
    print("the answer is", sideA**2 + sideB**2)
else:
    print("Something went wrong. Try again")
print("Thank you for using the Pythagoras Calculator")

