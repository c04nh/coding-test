import math

def solution(n, k):
    answer = 0
    change = ''
    
    if k != 10:
        while n > 0:
            change = str(n % k) + change
            n //= k
    else:
        change = str(n)
            
    arr = change.split('0')
    print(arr)
    
    for i in arr:
        if i != '' and i != '1':
            if primeCheck(int(i)):
                answer += 1
        
    return answer

def primeCheck(n):
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False

    return True