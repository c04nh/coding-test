def solution(n):
    answer = 0
    
    if n <= 2:
        answer = n
    else:
        a, b = 1, 2
        
        for i in range(3, n+1):
            a, b = b, (a + b) % 1234567

            
        answer = b
            
    return answer
