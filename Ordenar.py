chain = input()
count = 1

letters = []
numbers = []
if(len(chain) % 2 != 0):
    chain += "  "

for j in range(0, len(chain), 2):
    try:
    
        if(chain[j] == chain[j+2]):
            count = count + 1
        else:
            letters.append(chain[j])
            numbers.append(str(count))
            count = 1

    except Exception as e:
        pass

for element in letters:
    print(element + " ", end="")

print()
for element in numbers:
    print(element + " ", end="")