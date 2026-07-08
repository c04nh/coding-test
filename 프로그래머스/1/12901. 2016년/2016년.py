def solution(a, b):
    answer = ''
    month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    for i in range(a-1):
        b += month[i]
        
    if b % 7 == 0:
        answer = 'THU'
    if b % 7 == 1:
        answer = 'FRI'
    elif b % 7 == 2:
        answer = 'SAT'
    elif b % 7 == 3:
        answer = 'SUN'
    elif b % 7 == 4:
        answer = 'MON'
    elif b % 7 == 5:
        answer = 'TUE'
    elif b % 7 == 6:
        answer = 'WED'
        
    print(b)
    
    return answer