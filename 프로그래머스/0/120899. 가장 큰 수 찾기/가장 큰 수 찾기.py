def solution(array):
    answer = [array[0], 0]
    
    for i in range(1, len(array)):
        if answer[0] < array[i]:
            answer[0] = array[i]
            answer[1] = i
        
    return answer