def solution(str_list):
    answer = []
    index = 0
    
    if 'l' not in str_list and 'r' not in str_list:
        return answer
    
    for i in range(len(str_list)):
        if str_list[i] == 'l' or str_list[i] == 'r':
            index = i
            break
    
    if str_list[index] == 'l':
        answer = str_list[:index]
    else:
        answer = str_list[index+1:]
        
    
            
    
    return answer