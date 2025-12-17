def solution(n):
    answer = []
    num = 2
    
    while n != 1:
        if n % num != 0:
            num += 1
        else:
            n //= num
            if num not in answer: answer.append(num)
    
    return answer