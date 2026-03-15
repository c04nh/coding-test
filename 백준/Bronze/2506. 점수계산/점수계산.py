N = int(input())

input_arr = list(map(int, input().split()))

score = 0
answer = 0

for i in input_arr:
  if i == 0:
    score = 0
  else:
    score += 1
  answer += score

print(answer)  