def solution(bin1, bin2):
    answer = ''
    length = max(len(bin1), len(bin2))
    bin1 = int(bin1)
    bin2 = int(bin2)
    num = 0
    
    for i in range(length):
        answer = str((bin1%10 + bin2%10 + num) % 2) + answer
        if bin1%10 + bin2%10 + num >= 2: num = 1
        else: num = 0
        bin1 = int(bin1/10)
        bin2 = int(bin2/10)
        
    if num == 1: answer = '1' + answer
    
    return answer