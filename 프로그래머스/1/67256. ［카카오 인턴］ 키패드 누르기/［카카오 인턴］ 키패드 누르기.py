def solution(numbers, hand):
    answer = ''
    xy = {1: [4, 1], 2: [4, 2], 3: [4, 3], 4: [3, 1], 5: [3, 2], 
           6: [3, 3], 7: [2, 1], 8: [2, 2], 9: [2, 3], 0: [1, 2]}
    left_xy = [1, 1]   
    right_xy = [1, 3]  
    
    for i in numbers:
        if i == 1 or i == 4 or i == 7:
            answer += 'L'
            left_xy = xy[i]
        elif i == 3 or i == 6 or i == 9:
            answer += 'R'
            right_xy = xy[i]
        else:
            l = abs(xy[i][0] - left_xy[0]) + abs(xy[i][1] - left_xy[1])
            r = abs(xy[i][0] - right_xy[0]) + abs(xy[i][1] - right_xy[1])
            
            if l < r:
                answer += 'L'
                left_xy = xy[i]
            elif r < l:
                answer += 'R'
                right_xy = xy[i]
            else:
                if hand == 'left':
                    answer += 'L'
                    left_xy = xy[i]
                else:
                    answer += 'R'
                    right_xy = xy[i]
                
                        
    return answer