def solution(array):
    answer = 0
    cnt = {}
    
    for i in array:
        if i in cnt:
            cnt[i] += 1
        else:
            cnt[i] = 1
            
    max_value = max(cnt.values())
    max_key = [k for k, v in cnt.items() if v == max_value]
    
    if len(max_key) == 1:
        answer = max_key[0]
    else:
        answer = -1
    
    return answer