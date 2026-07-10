def solution(answers):
    answer = []
    num1 = [1, 2, 3, 4, 5] * 8
    num2 = [2, 1, 2, 3, 2, 4, 2, 5] * 5
    num3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * 4
    
    index = 0
    
    cnt1 = 0
    cnt2 = 0
    cnt3 = 0
    
    for i in answers:
        if num1[index] == i:
            cnt1 += 1
        if num2[index] == i:
            cnt2 += 1
        if num3[index] == i:
            cnt3 += 1
            
        if index == 39:
            index = 0
        else:
            index += 1
            
    score = [cnt1, cnt2, cnt3]
    max_val = max(score)
    
    answer = [i+1 for i, x in enumerate(score) if x == max_val]
    
    return answer