import math

fisrt = int(input())
second = 2*fisrt+4
third = (fisrt + second)/5

print(str(fisrt) + " " + str(second) + " " + str(math.floor(third)))

if 0<=third<=20:
    print("uno")
if 21<=third<=30:
    print("dos")
if 31<=fisrt<=50:
    print("tres")
if fisrt>=50:
    print("cuatro")