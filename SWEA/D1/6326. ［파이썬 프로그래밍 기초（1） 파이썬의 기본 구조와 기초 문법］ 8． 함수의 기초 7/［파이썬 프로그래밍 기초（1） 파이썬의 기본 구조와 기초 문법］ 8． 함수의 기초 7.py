num = int(input())

answer = 1

for i in range(2, num+1):
    answer *= i
    
print(answer)