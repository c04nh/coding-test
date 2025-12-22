def solution(score):
    answer = []
    avg = []
    
    for i in score:
        avg.append((i[0] + i[1]) / 2)
        
    sortList = sorted(avg, reverse=True)
    
    for i in avg:
        for j in range(len(sortList)):
            if i == sortList[j]:
                answer.append(j+1)
                break
                
    return answer