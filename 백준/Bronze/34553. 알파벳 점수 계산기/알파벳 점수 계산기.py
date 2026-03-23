S = input()
total = 1
score = 1
ch = S[0]

for c in range(1, len(S)):
  if ch < S[c]:
    score += 1
  else:
    score = 1
  
  total += score
  ch = S[c]

print(total)