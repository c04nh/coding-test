def solution(n, works):
    answer = 0
    works.sort(reverse=True)
    
    if sum(works) <= n:
        return 0
    
    for i in range(n):
        m = max(works)

        index = 0

        while n != 0:
            if works[index] != m:
                break 

            works[index] -= 1
            n -= 1
            index += 1

        if n == 0:
            break 
        
    for i in works:
        answer += i * i
        
    return answer