N = int(input())

dic = {}

for i in range(N):
  a, b = map(str, input().split())
  dic[a] = b

for k, v in dic.items():
  if v == '2026':
    print(k)
    break