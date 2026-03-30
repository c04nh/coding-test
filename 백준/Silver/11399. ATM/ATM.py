N = int(input())
arr =list(map(int, input().split()))
answer = 0

arr.sort()

for i in range(len(arr)):
  answer += sum(arr[:i+1])

print(answer)

