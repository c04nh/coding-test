def solution(s):
    answer = ''
    arr = s.split(" ")
    
    for i in arr:
        for j in range(len(i)):
            if j == 0:
                answer += i[j].upper()
            else:
                answer += i[j].lower()
        answer += " "
        
    answer = answer[0:-1]
            
    return answer