import math

def solution(brown, yellow):
    answer = []
    divisorsList = []

    for i in range(1, int(yellow**(1/2)) + 1):
        if (yellow % i == 0):
            divisorsList.append(i) 
            if ( (i**2) != yellow) : 
                divisorsList.append(yellow // i)

    divisorsList = sorted(divisorsList, reverse=True)
    n = math.ceil(len(divisorsList) / 2)
    
    for i in range(0, n):
        w1 = divisorsList[i] + 2
        w2 = (brown - divisorsList[len(divisorsList)-i-1]*2) // 2
        
        if w1 == w2:
            answer.append(w1)
            answer.append((brown + yellow) // w1)
            break

    return answer