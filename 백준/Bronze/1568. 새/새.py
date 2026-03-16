N = int(input())

cnt = 0
num = 1

while N > 0:
  if N < num:
    num = 1
  
  N -= num
  num += 1
  cnt += 1

print(cnt)