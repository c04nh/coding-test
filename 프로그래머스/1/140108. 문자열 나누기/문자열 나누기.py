def solution(s):
    answer = 0
    cnt_s = 0
    cnt_n = 0
    c = ''
    for i in s:
        if c == '':
            c = i
        if c == i:
            cnt_s += 1
        else:
            cnt_n += 1
        if cnt_s == cnt_n:
            answer += 1
            c = ''
            cnt_s = 0
            cnt_n = 0
    
    if c:
        answer += 1
        
    return answer