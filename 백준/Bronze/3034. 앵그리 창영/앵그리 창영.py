N, W, H = map(int, input().split())

for i in range(N):
  M = int(input())

  if M <= W or M <= H or M*M <= W*W + H*H:
    print("DA")
  else:
    print("NE")