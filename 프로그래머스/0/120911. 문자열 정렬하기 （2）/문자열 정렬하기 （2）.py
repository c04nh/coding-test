def solution(my_string):
    answer = ''
    
    my_string = my_string.lower()
    
    myList = list(my_string)
    myList.sort()
    
    for i in myList:
        answer += i
    
    return answer