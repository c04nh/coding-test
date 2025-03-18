s = input()
cnt = 0

for c in s:
    if c in "AabDdegOoPpQqR@":
        cnt += 1
    elif c == "B":
        cnt += 2
        
print(cnt)
