def solution(myString, pat):
    index = myString.rfind(pat)
    answer = myString[:index+len(pat)]
    return answer