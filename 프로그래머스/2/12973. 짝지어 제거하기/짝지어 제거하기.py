def solution(s):
    answer = 0
    stack = [s[0]]
    index = 1
    
    while index < len(s):
        if len(stack) == 0:
            stack.append(s[index])
        elif stack[-1] == s[index]:
            stack.pop()
        else:
            stack.append(s[index])
        
        index += 1
    
        if len(stack) == 0:
            answer = 1
        else:
            answer = 0
        
    return answer