def solution(id_list, report, k):
    answer = []
    dic1 = {id:0 for id in id_list}
    mail = {id:[] for id in id_list}
    
    for i in report:
        arr = i.split(" ")
        if arr[1] not in mail[arr[0]]:
            dic1[arr[1]] += 1
            mail[arr[0]].append(arr[1])
        
    suspend = [id for id in dic1 if dic1[id] >= k]
    
    for i in range(len(id_list)):
        set1 = set(mail[id_list[i]])
        set2 = set(suspend)
        answer.append(len(list(set1 & set2)))
    
    return answer