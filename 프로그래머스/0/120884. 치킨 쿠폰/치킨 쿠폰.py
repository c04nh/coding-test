def solution(chicken):
    answer = 0
    coupon = chicken    
    
    while coupon >= 10:
        order = coupon // 10
        coupon = coupon % 10
        answer += order
        coupon += order
        
    
    return answer