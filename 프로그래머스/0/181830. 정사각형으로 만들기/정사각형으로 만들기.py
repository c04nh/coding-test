def solution(arr):
    answer = []
    
    if len(arr) > len(arr[0]):
        for li in arr:
            for i in range(len(arr) - len(li)):
                li.append(0)
            answer.append(li)
    elif len(arr) < len(arr[0]):
        for li in arr:
            answer.append(li)
        for i in range(len(li) - len(arr)):
            answer.append([0] * len(li))
    else:
        answer = arr
    
    return answer