def solution(arr, delete_list):
    answer = arr
    
    for a in delete_list:
        if(answer.count(a) > 0):
            answer.remove(a)
        
    return answer