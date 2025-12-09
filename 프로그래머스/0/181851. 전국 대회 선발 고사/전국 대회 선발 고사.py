def solution(rank, attendance):
    answer = 0
    arr = []
    
    for i in range(len(rank)):
        if attendance[i]:
            arr.append(rank[i])
            
    arr.sort()
    
    for i in range(len(rank)):
        if rank[i] == arr[0]: answer += 10000 * i
        elif rank[i] == arr[1]: answer += 100 * i
        elif rank[i] == arr[2]: answer += i
    
    return answer