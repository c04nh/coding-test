def solution(s):
    answer = []
    cnt = 0
    ze = 0

    while s != "1":
        cnt += 1
        ze += s.count("0")
        s = s.replace('0', '')
        s = str(bin(len(s)))[2:]
        print(s)
    
    answer = [cnt, ze]     
    return answer