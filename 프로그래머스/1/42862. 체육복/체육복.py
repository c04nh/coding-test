def solution(n, lost, reserve):
    answer = 0
    
    lost = set(lost)
    reserve = set(reserve)
    
    common = lost & reserve
    lost -= common
    reserve -= common
    
    reserve = sorted(reserve)
    
    for i in reserve:
        if i - 1 in lost:
            lost.remove(i - 1)
        elif i + 1 in lost:
            lost.remove(i + 1)

    answer = n - len(lost)
    
    return answer