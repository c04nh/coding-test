def solution(arr):
    answer = 0
    
    while True:
        arr1 = []
        for i in arr:
            if i % 2 == 0 and i >= 50:
                arr1.append(i//2)
            elif i % 2 == 1 and i < 50:
                arr1.append(i*2+1)
            else:
                arr1.append(i)
                
        if arr==arr1:
            break
        else:
            arr = arr1
            answer += 1
        
    return answer