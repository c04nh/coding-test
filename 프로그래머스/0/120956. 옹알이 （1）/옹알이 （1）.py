def solution(babbling):
    answer = 0
    
    for i in babbling:
        i = i.replace("aya", ".")
        i = i.replace("ye", ".")
        i = i.replace("woo", ".")
        i = i.replace("ma", ".")
        i = i.replace(".", "")
        
        if i == "":
            answer += 1
    
    return answer