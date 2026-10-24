from itertools import permutations
import math

def solution(numbers):
    answer = 0
    
    data = list(numbers)
    result = []
    for i in range(1, len(data) + 1):
        result.extend(permutations(data, i))

    arr = set(int(''.join(i)) for i in result)
    
    for i in arr:
        if i > 1 and primeCheck(i):
            answer += 1
            
    return answer

def primeCheck(n):
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False

    return True