import math

def solution(n):
    answer = 0
    prime = [i for i in range(1, n+1)]
    
    prime[0] = 0
    
    for i in range(2, int(math.sqrt(n+1)+1)):
        for j in range(i*i, n+1, i):
            prime[j-1] = 0
            
    for i in prime:
        if i != 0:
            answer += 1
            
    return answer