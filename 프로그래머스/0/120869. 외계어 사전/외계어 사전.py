def solution(spell, dic):
    answer = 2
    
    for i in dic:
        cnt = 0
        for j in spell:
            if j in i:
                cnt += 1
        if cnt == len(spell):
            return 1
        
    return answer