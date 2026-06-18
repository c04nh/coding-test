def solution(s, n):
    answer = ''
    
    for c in s:
        if c == ' ':
            answer += ' '
        else:
            if ord(c) <= 90 and ord(c)+n >= 97:
                a = ord(c) + n - 26
            else:
                a = ord(c) + n
                if a > 122 or (a < 97 and a > 90):
                    a -= 26
            answer += chr(a)
        
    return answer