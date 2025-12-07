def solution(sides):
    answer = 0
    long = max(sides)
    short = min(sides)
    
    for i in range(long + 1):
        if i + short > long:
            answer += 1
    
    answer += short - 1
    
    return answer