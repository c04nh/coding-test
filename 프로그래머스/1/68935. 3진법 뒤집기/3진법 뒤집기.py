def solution(n):
    answer = 0
    thr = ""
    
    while n > 0:
        thr = str(n%3) + thr
        n //= 3
    
    num = 0
    for i in thr:
        answer += 3**num * int(i)
        num += 1
        
    return answer