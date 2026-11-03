def solution(friends, gifts):
    answer = 0
    arr = [[0 for i in range(len(friends))] for i in range(len(friends))]
    index = {friends[i]: i for i in range(len(friends))}
    score = [0 for i in range(len(friends))]
    nextMonth = [0 for i in range(len(friends))]
    
    for gift in gifts:
        g = gift.split(' ')
        arr[index[g[0]]][index[g[1]]] += 1
        score[index[g[0]]] += 1
        score[index[g[1]]] -= 1
    
    for i in range(0, len(friends)):
        for j in range(i+1, len(friends)):
            if arr[i][j] > arr[j][i]:
                nextMonth[i] += 1
            elif arr[i][j] < arr[j][i]:
                nextMonth[j] += 1
            else:
                if score[i] > score[j]:
                    nextMonth[i] += 1
                elif score[i] < score[j]:
                    nextMonth[j] += 1
            
    answer = max(nextMonth)
    
    return answer