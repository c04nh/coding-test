def solution(n):
    answer = [[0]*n for _ in range(n)]
    i = 0
    j = 0
    num = 1
    ch = 'r'
    
    while num <= n*n:    
        answer[i][j] = num
        num += 1
        
        if ch == 'r' and (j+1 == len(answer[i]) or answer[i][j+1] != 0):
            ch = 'b'
        elif ch == 'l' and (j == 0 or answer[i][j-1] != 0):
            ch = 't'
        elif ch == 't' and (i == 0 or answer[i-1][j] != 0): 
            ch = 'r'
        elif ch == 'b' and (i+1 == len(answer) or answer[i+1][j] != 0):
            ch = 'l'
        print(i, j)
        if ch == 'r':
            j += 1
        elif ch == 'l':
            j -= 1
        elif ch == 't':
            i -= 1
        elif ch == 'b':
            i += 1
    
    return answer