def solution(wallpaper):
    answer = []
    lux = -1
    luy = -1
    rdx = -1
    rdy = -1
    
    for i in range(len(wallpaper)):
        if wallpaper[i].count("#") > 0:
            if lux == -1:
                lux = i
            rdx = i
            
    for i in range(len(wallpaper[0])):
        arr = [j[i] for j in wallpaper]
        if arr.count("#") > 0:
            if luy == -1:
                luy = i
            rdy = i
        
    answer = [lux, luy, rdx+1, rdy+1]
    return answer