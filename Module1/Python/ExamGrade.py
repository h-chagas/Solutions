examMark = int(input("What's your exam grade? "))

if examMark < 0 or examMark > 100:
    print("ERROR: Marks must be between 1... 100.")
elif examMark > 70:
    print("You passed with DISTINCTION.")
elif examMark > 60:
    print("You passed with MERIT.")
elif examMark > 50:
    print("You passed.")
elif examMark > 0:
    print("You failed.")
print("Thank you for using the exam calculator!")

