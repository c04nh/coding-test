def solution(myString, pat):
    answer = 0
    newStr = ""
    
    for c in myString:
        if c == "A":
            newStr += "B"
        else:
            newStr += "A"
            
    if newStr.count(pat) > 0:
        answer = 1
        
    return answer