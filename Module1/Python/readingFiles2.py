companies = []
sales = []

with open("carSale.csv") as file:
    count = 1
    
    for line in file:
        if (count % 2 == 1):
            companies.append(line)
            count += 1
            "print(line)"
        else:
            sales.append(line)
            count += 1
            "print(line)"

print("Companies:")
print(companies)
print("Sales:")
print(sales)