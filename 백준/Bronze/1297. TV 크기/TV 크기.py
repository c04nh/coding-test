import math

D, H, W = map(int,input().split())

X = math.sqrt(D*D / (H*H+W*W))

print(int(H*X), int(W*X))