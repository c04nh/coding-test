import math

def solution(n, w, num):
    answer = 1
    arr = [[-1 for i in range(w)] for j in range(math.ceil(n / w))]
    
    i = -1
    j = 0
    
    for k in range(1, n+1):
        arr[i][j] = k
        
        if k % w == 0:
            i -= 1
        else:
            if i % 2 == 1:
                j += 1
            else:
                j -= 1
    
    for a in range(len(arr)):
        for b in range(len(arr[a])):
            if arr[a][b] == num:
                i = a
                j = b
                break
                
    for k in range(i):
        if arr[k][j] != -1:
            answer += 1
        print(arr[k][j])
    return answer