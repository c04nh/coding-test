def solution(x):
    answer = True
    y = x
    num = 0
    
    while x > 0:
        num += x % 10
        x //= 10
        
    print(num)
    if y % num != 0: 
        answer = False
    
    return answer