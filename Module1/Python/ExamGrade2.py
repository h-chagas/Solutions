examMark = int(input("What's your exam grade? "))
level = int(input("What's your level (1 or 2?) "))

if examMark < 0 or examMark > 100:
    print("ERROR: Marks must be between 1... 100.")
elif level == 1:
    if examMark > 70:
        print("You passed with DISTINCTION.")
    elif examMark > 60:
        print("You passed with MERIT.")
    elif examMark >= 50:
        print("You passed.")
    elif examMark > 0:
        print("You failed.")
elif level == 2:
    if examMark > 65:
        print("You passed with DISTINCTION.")
    elif examMark > 50:
        print("You passed with MERIT.")
    elif examMark >= 40:
        print("You passed.")
    elif examMark > 0:
        print("You failed.")
else:
    print("Something went wrong!")
print("Thank you for using the exam calculator!")