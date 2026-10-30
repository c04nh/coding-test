def solution(video_len, pos, op_start, op_end, commands):
    answer = ''
    m = int(pos[:2])
    s = int(pos[3:])
    
    for comm in commands:
        m, s = chkOpening(m, s, op_start, op_end)
        if comm == 'prev':
            s -= 10
        elif comm == 'next':
            s += 10
            
        if s >= 60:
            m += 1
            s -= 60
        elif s < 0:
            m -= 1
            s += 60
            
        if m < 0:
            m = 0
            s = 0
        elif m > int(video_len[:2]):
            m = int(video_len[:2])
            s = int(video_len[3:])
        elif m == int(video_len[:2]) and s > int(video_len[3:]):
            m = int(video_len[:2])
            s = int(video_len[3:])
            
        m, s = chkOpening(m, s, op_start, op_end)
        
    m = str(m)
    s = str(s)
    
    if len(m) == 1:
        m = '0' + m
    if len(s) == 1:
        s = '0' + s
        
    answer = m + ':' + s
    return answer

def chkOpening(m, s, op_start, op_end):
    if op_start[:2] != op_end[:2]:
        if int(op_start[:2]) < m < int(op_end[:2]):
            m = int(op_end[:2])
            s = int(op_end[3:])
        elif m == int(op_start[:2]) and s >= int(op_start[3:]):
            m = int(op_end[:2])
            s = int(op_end[3:])
        elif m == int(op_end[:2]) and s < int(op_end[3:]):
            m = int(op_end[:2])
            s = int(op_end[3:])
                
    else:
        if m == int(op_start[:2]) and int(op_start[3:]) <= s < int(op_end[3:]):
            m = int(op_end[:2])
            s = int(op_end[3:])
            
                
    return m, s