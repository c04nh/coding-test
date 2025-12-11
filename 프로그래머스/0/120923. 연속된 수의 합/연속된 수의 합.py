import math

def solution(num, total):
    answer = []
    
    if num % 2 == 0:
        avg = total//num
        for i in range(avg-(num//2)+1, avg+(num//2)+1):
            answer.append(i)
    else:
        avg = total//num
        for i in range(avg-math.floor(num/2), avg+math.ceil(num/2)):
            answer.append(i)
    
    return answer