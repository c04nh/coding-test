import math

def solution(n):
    answer = 0
    sq = math.sqrt(n)
    
    if sq % 1 == 0:
        answer = (sq+1) ** 2
    else:
        answer = -1
    
    return answer