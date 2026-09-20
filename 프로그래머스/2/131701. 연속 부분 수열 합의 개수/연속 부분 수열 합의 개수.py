def solution(elements):
    answer = 0
    
    s = set()
    
    for i in range(1, len(elements)+1):
        for j in range(len(elements)):
            num = sum(elements[:i])
            
            if num not in s:
                s.add(num)
            
            elements.append(elements[0])
            elements = elements[1:]
            
    answer = len(s)
            
    return answer