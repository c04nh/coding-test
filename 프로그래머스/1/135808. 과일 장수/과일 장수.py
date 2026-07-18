def solution(k, m, score):
    answer = 0
    score.sort()
    
    for i in range(len(score) % m, len(score), m):
        answer += score[i] * m
        
    return answer