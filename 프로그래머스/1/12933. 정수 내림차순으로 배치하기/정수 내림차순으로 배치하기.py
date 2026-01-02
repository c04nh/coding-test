def solution(n):
    answer = ""
    txt = str(n)
    
    arr = []
    
    for i in txt:
        arr.append(i)
    
    arr.sort(reverse=True)
    
    for i in arr:
        answer += i
        
    answer = int(answer)
        
    return answer