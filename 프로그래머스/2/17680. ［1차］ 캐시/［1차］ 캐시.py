def solution(cacheSize, cities):
    answer = 0
    arr = []
    
    if cacheSize == 0:
        return len(cities) * 5
    
    for i in cities:
        i = i.lower()
        if i in arr:
            answer += 1
            arr.remove(i)
            arr.append(i)
        else:
            if len(arr) < cacheSize:
                arr.append(i)
            else:
                del arr[0]
                arr.append(i)
            answer += 5
    
    return answer