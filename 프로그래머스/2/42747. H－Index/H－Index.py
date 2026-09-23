def solution(citations):
    answer = 0
    citations.sort(reverse=True)
    
    for i in range(len(citations), 0, -1):
        cnt = 0
        for j in citations:
            if j >= i:
                cnt += 1
            else:
                break
                
        if cnt >= i:
            answer = i
            break
    
    
    return answer