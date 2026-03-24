w, h = map(int, input().split())
r = int(input())

area = w * h
answer = area - (r * r * 3.141592 * 0.25)

print(answer)