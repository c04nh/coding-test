def solution(my_string):
    answer = 0
    numStr = ''
    
    for i in my_string:
        if i.isnumeric():
            numStr += i
        elif numStr != '':
            answer += int(numStr)
            numStr = ''
            
    if numStr != '':
        answer += int(numStr)
    
    return answer