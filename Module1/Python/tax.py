mySalary = int(input("What is your salary? "))

def getIncomeTax(salary):

    pa = 11850
    if salary < 0:
        return "Your salary must be a positive number"
    elif salary <= 34500:
        taxable = salary - pa
        tax = taxable * 0.2
        #income = pa + (taxable - tax)
        return tax
    elif salary <= 150000:
        taxable = salary - pa
        tax = taxable * 0.4
        #income = pa + (taxable - tax)
        return tax
    elif salary > 150000:
        taxable = salary - pa
        tax = taxable * 0.4
        #income = pa + (taxable - tax)
        return tax
    else:
        return "Something went wrong."

result = getIncomeTax(mySalary)

print("Your tax amount is £", result)


#I need to get better and apply some more rules