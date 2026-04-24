def solution(s):
    answer = ''
    arr = s.split(' ')
    
    for a in arr:
        for i in range(len(a)):
            if i % 2 == 1:
                answer += a[i].lower()
            else:
                answer += a[i].upper()
        answer += ' '
    
    return answer[:-1]