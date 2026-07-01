def solution(k, score):
    answer = []
    top3 = []
    
    for i in score:
        if len(top3) < k:
            top3.append(i)
        else:
            if top3[0] < i:
                top3[0] = i
        top3.sort()
        answer.append(top3[0])
    
    return answer