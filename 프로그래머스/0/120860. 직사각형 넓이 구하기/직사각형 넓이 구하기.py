def solution(dots):
    answer = 0
    dots.sort()
    
    width = dots[2][0] - dots[0][0]
    height = dots[1][1] - dots[0][1]
    
    answer = width * height
    
    return answer