def solution(before, after):
    answer = 1
    
    dic1 = [0] * 26
    dic2 = [0] * 26
    
    for i in range(len(before)):
        dic1[ord(before[i]) - ord('a')] += 1
        dic2[ord(after[i]) - ord('a')] += 1
        
    for i in range(26):
        if(dic1[i] != dic2[i]):
            answer = 0
            break
    
    return answer