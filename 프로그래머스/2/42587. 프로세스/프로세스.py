def solution(priorities, location):
    answer = 0
    arr = [(i, v) for i, v in enumerate(priorities)]
    
    while arr:
        index, value = arr[0]
        arr.remove((index, value))
        
        if value == max(priorities):
            answer += 1
            priorities[index] = 0
            
            if index == location:
                return answer
        elif value < max(priorities):
            arr.append((index, value))
    
    
    print(arr)
        
    

    
    
    return answer