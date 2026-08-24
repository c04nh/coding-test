def solution(n):
    answer = n + 1
    cnt = str(bin(n)[2:]).count('1')
    
    while str(bin(answer)[2:]).count('1') != cnt:
        answer += 1
        
    return answer