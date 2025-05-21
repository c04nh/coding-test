li = []

W = input()

for ch in W:
    if li.count(ch) == 0:
        li.append(ch)

c = 65

while len(li) < 26:
    if li.count(chr(c)) == 0:
        li.append(chr(c))
    c += 1
    
S = input()

for ch in S:
    print(li[ord(ch)-65], end='')