def solution(n,a,b):
    answer = 1

    while True:
        if abs(a-b) == 1:
            if min(a, b) % 2 == 1:
                break
        
        if a % 2  == 1:
            a //= 2
            a += 1
        else:
            a //= 2
        
        if b % 2 == 1:
            b //= 2
            b += 1
        else:
            b //= 2
            
        print(a, b)
            
        answer += 1

    return answer