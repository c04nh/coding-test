def solution(dartResult):
    answer = 0
    stack = []
    score = []
    num = 0
    
    for d in dartResult:
        if d == '*':
            if len(score) < 2:
                score[0] *= 2
            else:
                score[-1] *= 2
                score[-2] *= 2
        elif d == '#':
            score[-1] *= -1
        else:
            if d == 'S':
                num = stack.pop()
                score.append(num)
            elif d == 'D':
                num = stack.pop() ** 2
                score.append(num)
            elif d == 'T':
                num = stack.pop() ** 3
                score.append(num)
            else:
                if len(stack) > 0:
                    if stack.pop() == 1 and d == '0':
                        stack.append(10)
                else:
                    stack.append(int(d))  
        
    answer = sum(score)
    return answer