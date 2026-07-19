def solution(N, stages):
    answer = []
    cnt = {x+1: 0 for x in range(N)}
    
    for i in range(1, N+1):
        if len(stages) > 0:
            cnt[i] = stages.count(i) / len(stages)
        else:
            cnt[i] = 0
        stages = [x for x in stages if x != i]
            
    answer = sorted(cnt, key=lambda x:cnt[x], reverse=True)
    
    return answer