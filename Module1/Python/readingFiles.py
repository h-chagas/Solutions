"""file = open("students.txt", "r")
line = file.readline()
file.close()
print(line)"""



"""file = open("students.txt", "r")
for line in file:
    print(line.strip())
file.close()"""



"""with open("students.txt") as file:
    lines = file.readlines()

    for line in lines:
        print(line)"""


with open("students.txt") as file:
