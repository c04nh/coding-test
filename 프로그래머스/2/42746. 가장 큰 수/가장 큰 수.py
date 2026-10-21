def solution(numbers):
    answer = ''
    
    arr = [str(i) for i in numbers]
    arr = sorted(arr, key=lambda x : x*3, reverse=True)
             
    answer = ''.join(arr)
    
    if answer[0] == '0':
        return '0'
    
    return answer