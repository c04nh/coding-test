def solution(want, number, discount):
    answer = 0
    dic = {want[i]:number[i] for i in range(len(want))}
    
    for i in range(len(discount)-9):
        arr = discount[i:i+10]
        chk = True
        
        for k, v in dic.items():
            if arr.count(k) != v:
                chk = False
                break
        
        if chk:
            answer += 1
    
    return answer