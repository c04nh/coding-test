def solution(my_string):
    arr = my_string.split()
    answer = int(arr[0])
    
    print(arr)
    
    for i in range(2, len(arr)):
        if arr[i].isnumeric():
            if arr[i-1] == '+':
                answer += int(arr[i])
            else:
                answer -= int(arr[i])
            
    
    return answer