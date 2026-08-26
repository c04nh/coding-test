def solution(n, words):
    answer = [0, 0]

    for i in range(1, len(words)):
        arr = words[:i]
        if words[i] in arr:
            answer[0] = (i+1) % n
            answer[1] = i // n + 1
            
            if answer[0] == 0:
                answer[0] = n
            
            break
        elif words[i][0] != words[i-1][-1]:
            answer[0] = (i+1) % n
            answer[1] = i // n + 1
            
            if answer[0] == 0:
                answer[0] = n
            
            break

    return answer