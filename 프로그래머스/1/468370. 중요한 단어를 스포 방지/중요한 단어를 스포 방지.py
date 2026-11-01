def solution(message, spoiler_ranges):
    answer = 0
    idx = 0
    arr = message.split(' ')
    
    sp = set()
    nsp = set()
    
    
    for m in arr:
        start = idx
        end = idx + len(m) - 1
        idx = end + 2
        
        is_spoiler = any(
            start <= right and end >= left
            for left, right in spoiler_ranges
        )
        
        if is_spoiler:
            sp.add(m)
        else:
            nsp.add(m)
            
    answer = len(sp - nsp)
        
    return answer