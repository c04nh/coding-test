def solution(n, t, m, p):
    answer = ''
    a = '0123456789ABCDEF'
    s = '0'
    
    for i in range(1, t * m):
        c = ''
        while i > 0:
            i, r = divmod(i, n)
            c = a[r] + c
        s += c
        
        if len(s) >= t * m:
            break

    answer = s[p-1::m][:t]
        
    return answer
