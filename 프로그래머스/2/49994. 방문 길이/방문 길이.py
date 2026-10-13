def solution(dirs):
    move = {'U': (0, 1), 'D': (0, -1), 'R': (1, 0), 'L': (-1, 0)}
    
    x, y = 0, 0
    visited = set()
    
    for i in dirs:
        dx, dy = move[i]
        nx, ny = x + dx, y + dy
        
        if -5 <= nx <= 5 and -5 <= ny <= 5:
            path = sorted([(x, y), (nx, ny)])
            visited.add(tuple(path))
            x, y = nx, ny
            
    answer = len(visited)
        
    return answer