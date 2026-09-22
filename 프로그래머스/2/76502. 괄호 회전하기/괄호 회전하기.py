def check(s):
    dic = {')': '(', '}': '{', ']': '['}
    stack = []
    
    for i in s:
        if i in '({[':
            stack.append(i)
        else:
            if stack:
                top = stack.pop()
                
                if top != dic[i]:
                    return False
            else:
                return False
            
    if len(stack) != 0:
        return False
    
    return True
    
    
def solution(s):
    answer = 0
    
    for i in range(len(s)):
        if check(s):
            answer += 1
            
        s = s[1:] + s[0]
        
    return answer