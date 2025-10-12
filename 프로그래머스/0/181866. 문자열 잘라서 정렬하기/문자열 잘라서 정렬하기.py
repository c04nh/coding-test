def solution(myString):
    answer = myString.split("x")
    answer.sort()
    
    while answer.count("") > 0:
        answer.remove("")
    
    return answer