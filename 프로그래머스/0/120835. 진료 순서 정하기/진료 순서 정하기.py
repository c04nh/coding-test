def solution(emergency):
    answer = [0] * len(emergency)
    
    arr =  sorted(emergency, reverse=True)
    
    for i in range(len(emergency)):
        answer[i] = arr.index(emergency[i]) + 1
    
    return answer