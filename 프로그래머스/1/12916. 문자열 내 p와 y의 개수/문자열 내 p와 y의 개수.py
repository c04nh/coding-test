def solution(s):
    s = s.lower()
    
    p = s.count("p")
    y = s.count("y")
    
    answer = p == y

    return answer