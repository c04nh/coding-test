def solution(str1, str2):
    answer = 0
    
    if str1.count(str2) == 0: answer = 2
    else: answer = 1
    
    return answer