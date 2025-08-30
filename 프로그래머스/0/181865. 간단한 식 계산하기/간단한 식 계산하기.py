def solution(binomial):
    answer = 0
    
    if binomial.count('+') > 0:
        arr = binomial.split(' + ')
        answer = int(arr[0]) + int(arr[1])
    elif binomial.count('-') > 0:
        arr = binomial.split(' - ')
        answer = int(arr[0]) - int(arr[1])
    else:
        arr = binomial.split(' * ')
        answer = int(arr[0]) * int(arr[1])
    
    return answer