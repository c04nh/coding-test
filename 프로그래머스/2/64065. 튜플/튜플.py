def solution(s):
    answer = []
    arr = s[2:-2].split('},{')
    arr.sort(key=len)
    arr = [list(map(int, s.split(','))) for s in arr]
    
    
    for i in arr:
        for j in answer:
            if j in i:
                i.remove(j)
        answer.append(i[0])
        
        
    return answer