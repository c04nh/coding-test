arr = sorted(list(map(int, input().split())))

num = arr[2]

while True:
  cnt = 0

  for i in arr:
    if num % i == 0:
      cnt += 1
  
  if cnt >= 3:
    break
  else:
    num += 1
  
print(num)
