def solution(myStr):
    arr1 = myStr.split('a')
    arr2 = []
    arr3 = []
    arr4 = []
    answer = []
    
    for i in arr1:
        if i != '': arr2.append(i)
    
    for i in arr2:
        if i != 'b':
            arr3.append(i.split('b'))
            
    for i in arr3:
        for j in i:
            if j != 'c': arr4.append(j.split('c'))
            
    for i in arr4:
        for j in i:
            if j != '': answer.append(j)
            
    if len(answer) == 0: answer.append("EMPTY")
        
    return answer