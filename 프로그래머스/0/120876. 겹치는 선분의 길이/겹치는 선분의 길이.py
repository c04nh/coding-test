def solution(lines):
    answer = 0
    check = [0 for _ in range(min(lines[0][0], lines[1][0], lines[2][0]), max(lines[0][1], lines[1][1], lines[2][1]))] 
    num = 0 - min(lines[0][0], lines[1][0], lines[2][0])
    lines[0][0] += num
    lines[0][1] += num
    lines[1][0] += num
    lines[1][1] += num
    lines[2][0] += num
    lines[2][1] += num
    
    
    for i in lines:
        for j in range(i[0], i[1]):
            check[j] += 1
    
    for i in check:
        if i >= 2:
            answer += 1
    
    return answer