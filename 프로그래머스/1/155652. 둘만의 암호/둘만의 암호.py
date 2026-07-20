def solution(s, skip, index):
    answer = ''
    a = [i for i in 'abcdefghijklmnopqrstuvwxyz' if i not in skip]
    
    for c in s:
        answer += a[(a.index(c) + index) % len(a)]
        
    return answer