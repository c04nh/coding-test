def solution(s):
    answer = ''
    arr = [0] * 26
    
    for i in s:
        arr[ord(i) - ord('a')] += 1
        
    for i in range(len(arr)):
        if(arr[i] == 1):
            answer += chr(i + ord('a'))
            
    return answer