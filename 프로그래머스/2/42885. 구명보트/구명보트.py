def solution(people, limit):
    answer = 0
    people = sorted(people, reverse=True)
    
    for i in people:
        if i + people[-1] <= limit:
            people.pop()
        answer += 1
    
    return answer