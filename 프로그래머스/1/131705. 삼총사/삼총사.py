def check(a, b, c):
    if a+b+c == 0: return True
    else: return False

def solution(number):
    answer = 0
    
    for i in range(len(number)-2):
        for j in range(i+1, len(number)-1):
            for k in range(j+1, len(number)):
                if check(number[i], number[j], number[k]): answer += 1
    return answer
