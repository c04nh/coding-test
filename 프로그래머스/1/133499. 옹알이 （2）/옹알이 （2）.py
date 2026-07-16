import re

def solution(babbling):
    answer = 0
    
    for i in babbling:
        i = i.replace("aya", "1")
        i = i.replace("ye", "2")
        i = i.replace("woo", "3")
        i = i.replace("ma", "4")
        
        i = re.sub('(([a-zA-Z0-9])\\2{1,})', 'X', i)
        
        i = i.replace("1", "")
        i = i.replace("2", "")
        i = i.replace("3", "")
        i = i.replace("4", "")
        
        if i == "":
            answer += 1        
    
    return answer