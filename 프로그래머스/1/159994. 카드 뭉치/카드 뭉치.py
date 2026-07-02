def solution(cards1, cards2, goal):
    answer = 'Yes'
    index1 = 0
    index2 = 0
    i = 0
    
    while True:
        if index1 < len(cards1) and cards1[index1] == goal[i]:
            index1 += 1
            i += 1
        elif index2 < len(cards2) and cards2[index2] == goal[i]:
            index2 += 1
            i += 1
        else:
            answer = 'No'
            break
            
        
        
        if i == len(goal):
            break
            
    
    return answer