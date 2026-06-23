import math

def solution(a, b):
    answer = 0
    c = math.gcd(a, b)
    b /= c
    
    while True:
        if b % 2 == 0:
            b /= 2
        else:
            break
    while True:
        if b % 5 == 0:
            b /= 5
        else:
            break
    
    if b == 1:
        answer = 1
    else:
        answer = 2
        
    return answer