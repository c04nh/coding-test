def solution(numbers, k):
    answer = 0
    index = 0
    
    for i in range(k-1):
        if index + 2 >= len(numbers):
            index = index + 2 - len(numbers)
        else: index += 2
        
    answer = numbers[index]
    
    return answer