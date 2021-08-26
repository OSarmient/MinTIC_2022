import json

dictionary = input()

data = json.loads(dictionary)

sheets = input()

code = sheets.split()

cost = 0

canBuy = []

for j in code:
    for i in data:
        if (i == j):
            cost += data.get(i)
            canBuy.append(i)
print(cost)
for element in canBuy:
    print(element + " ", end="")
