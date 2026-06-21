def solution(A, B):
    answer = 0
    
    for i in range(len(A)-1):
        if A == B:
            break
        else:
            answer += 1
            A = A[-1] + A[0:-1]
        
    if answer == len(A)-1 and A != B:
        answer = -1
    
    return answer