def solution(num_list, n):
    answer = []
    
    for i in range(int(len(num_list)/n)):
        arr = []
        for j in range(n):
            arr.append(num_list[i*n+j])
        answer.append(arr)
    
    return answer