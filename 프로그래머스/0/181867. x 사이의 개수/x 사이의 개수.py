def solution(myString):
    answer = []
    li = myString.split("x")
    
    for l in li:
        answer.append(len(l))
    return answer