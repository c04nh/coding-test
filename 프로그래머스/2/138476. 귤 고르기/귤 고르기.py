from collections import defaultdict

def solution(k, tangerine):
    answer = 0
    
    dic = defaultdict(int)
    for i in tangerine:
        dic[i] += 1
    
    arr = sorted(dic.values(), reverse=True)
    
    for i in arr:
        if k <= 0:
            break
        k -= i
        answer += 1
    
    return answer