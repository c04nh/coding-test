def solution(progresses, speeds):
    answer = []
    days = []

    for i in range(len(progresses)):
        days.append((100 - progresses[i] + speeds[i]-1) // speeds[i])

    day = days[0]
    cnt = 1
    for i in range(1, len(days)):
        if days[i] <= day:
            cnt += 1
        else:
            answer.append(cnt)
            cnt = 1
            day = days[i]

    answer.append(cnt)

    return answer