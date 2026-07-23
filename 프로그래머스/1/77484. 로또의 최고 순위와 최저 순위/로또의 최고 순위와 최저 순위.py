def solution(lottos, win_nums):
    arr = [i for i in win_nums if i in lottos]
    
    answer = [7 - (len(arr) + lottos.count(0)), 7 - len(arr)]
    
    if answer[0] == 7:
        answer[0] = 6
    if answer[1] == 7:
        answer[1] = 6
        
    return answer