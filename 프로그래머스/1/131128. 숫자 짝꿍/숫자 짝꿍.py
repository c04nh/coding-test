from collections import Counter

def solution(X, Y):
    answer = Counter(X) & Counter(Y)    
    answer = "".join(sorted(list(answer.elements()), reverse=True))
    
    if answer == "":
        answer = "-1"
    elif answer.count("0") == len(answer):
        answer = "0"
        
    return answer