def solution(price, money, count):
    answer = -1
    n = 0
    
    for i in range(count):
        n += price * (i+1)

    answer = n - money
    
    if answer < 0:
        answer = 0
        
    return answer