def solution(n, arr1, arr2):
    answer = []
    
    for i in range(n):
        form = '0' + str(n) + 'b'
        s1 = format(arr1[i], form)
        s2 = format(arr2[i], form)
        
        ss = ''
        for j in range(n):
            if s1[j] == '1' or s2[j] == '1':
                ss += '#'
            else:
                ss += ' '
        
        answer.append(ss)
        
    return answer