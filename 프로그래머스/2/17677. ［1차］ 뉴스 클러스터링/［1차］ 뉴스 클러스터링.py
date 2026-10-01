from collections import Counter

def solution(str1, str2):
    answer = 0
    arr1 = []
    arr2 = []
    
    for i in range(len(str1)-1):
        if str1[i:i+2].isalpha():
            arr1.append(str1[i:i+2].upper())
            
    for i in range(len(str2)-1):
        if str2[i:i+2].isalpha():
            arr2.append(str2[i:i+2].upper())
            
    c1 = Counter(arr1)
    c2 = Counter(arr2)
    
    inter = sum((c1 & c2).values())
    union = sum((c1 | c2).values())
    
    if union == 0:
        return 65536
    
    answer = int((inter / union) * 65536)
    
    return answer