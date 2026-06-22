def solution(s):
    answer = []
    new = ''
    
    for i in range(len(s)):
        n = new.find(s[i])
        if n != -1:
            n += 1
        answer.append(n)
        new = s[i] + new
            
    return answer