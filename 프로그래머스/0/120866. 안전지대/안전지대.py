def solution(board):
    answer = 0
    cnt = 0
    n = len(board)
    arr = [[ 0 for _ in range(n)] for __ in range(n)]
    
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                if i-1 >= 0 and j-1 >= 0:
                    arr[i-1][j-1] = 1
                if i-1 >= 0:
                    arr[i-1][j] = 1
                if i-1 >= 0 and j+1 < n:
                    arr[i-1][j+1] = 1
                if j-1 >= 0:
                    arr[i][j-1] = 1
                arr[i][j] = 1
                if j+1 < n:
                    arr[i][j+1] = 1
                if i+1 < n and j-1 >= 0:
                    arr[i+1][j-1] = 1
                if i+1 < n:
                    arr[i+1][j] = 1
                if i+1 < n and j+1 < n:
                    arr[i+1][j+1] = 1
    
    for i in arr:
        cnt += i.count(1)
        
    answer = len(board)**2 - cnt
                   
    return answer