def solution(triangle):
    for i in range(len(triangle)-2, -1, -1):
        for j in range(len(triangle[i])):
            triangle[i].append(triangle[i][0] + max(triangle[i+1][j], triangle[i+1][j+1]))
            del triangle[i][0]
        
            
    return triangle[0][0]