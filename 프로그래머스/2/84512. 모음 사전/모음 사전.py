def solution(word):
    answer = 0
    dic = {'A':0, 'E':1, 'I':2, 'O':3, 'U':4}
    
    for i in range(len(word)):
        if i == 0:
            answer += dic[word[i]] * 781 + 1
        elif i == 1:
            answer += dic[word[i]] * 156 + 1
        elif i == 2:
            answer += dic[word[i]] * 31 + 1
        elif i == 3:
            answer += dic[word[i]] * 6 + 1
        elif i == 4:
            answer += dic[word[i]] + 1
            
    return answer