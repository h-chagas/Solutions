ages = [1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 17, 18, 19, 24, 56, 67, 78, 34, 56, 67, 87, 98, 34, 14, 34, 45, 23, 45, 54, 43, 52]

#print(len(ages))

#for age in ages:
    #print(age)

#newList = []
#for age in ages:
    #newList.append(age + 1)
#ages = newList
#print(ages)


newList = []
for age in ages:
    if 65 >= age >= 16:
        newList.append(age)
print(newList)






