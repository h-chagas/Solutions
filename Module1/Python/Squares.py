x = 1

while x <= 100:
    print(x)
    print("The square of", x, "is", x**x)
    if x**x >= 2000:
        break
    x += 1

