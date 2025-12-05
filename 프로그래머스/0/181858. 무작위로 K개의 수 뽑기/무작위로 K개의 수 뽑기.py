def solution(arr, k):
    answer = []
    index = 0
    
    while(len(answer) < k):
        if index >= len(arr):
            answer.append(-1)
        else:
            if arr[index] not in answer:
                answer.append(arr[index])
        index += 1
    
    return answer