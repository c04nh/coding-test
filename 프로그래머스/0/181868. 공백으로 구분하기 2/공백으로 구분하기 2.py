def solution(my_string):
    answer = my_string.split(" ")
    
    while answer.count("") > 0:
        answer.remove("")
    
    return answer