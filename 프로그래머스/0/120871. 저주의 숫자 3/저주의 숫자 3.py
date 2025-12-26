def solution(n):
    answer = 1
    
    for i in range(2, n+1):
        answer += 1
        if '3' in str(answer) or answer % 3 == 0:
            while '3' in str(answer) or answer % 3 == 0:
                answer += 1
    return answer