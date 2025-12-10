def solution(polynomial):
    answer = ''
    arr = polynomial.split(' + ')
    x = 0
    num = 0
    
    for i in arr:
        if i == 'x':
            x += 1
        elif 'x' != i[-1]:
            num += int(i)
        else:
            x += int(i[0:-1])
    
    if x == 1:
        answer += 'x'
    elif x == 0:
        answer = str(num)
        return answer
    else:
        answer += str(x) + 'x'
        
    if num != 0:
        answer += ' + ' + str(num)
    
    return answer