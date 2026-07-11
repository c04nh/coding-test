import math

def solution(numer1, denom1, numer2, denom2):
    answer = [numer1 * denom2 + numer2 * denom1, denom1 * denom2]
    
    num = math.gcd(answer[0], answer[1])
    answer[0] /= num
    answer[1] /= num
    
    return answer