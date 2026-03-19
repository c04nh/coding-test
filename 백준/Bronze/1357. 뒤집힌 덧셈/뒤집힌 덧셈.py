X, Y = map(str, input().split())

newX = ''
newY = ''

for i in X:
  newX = i + newX

for i in Y:
  newY = i + newY

answer = str(int(newX) + int(newY))

newAnswer = ''

for i in answer:
  newAnswer = i + newAnswer

print(int(newAnswer))