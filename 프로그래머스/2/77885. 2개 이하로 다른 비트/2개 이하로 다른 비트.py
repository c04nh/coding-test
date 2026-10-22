def solution(numbers):
    answer = [x + 1 + ((x^(x + 1))>>2) for x in numbers]

    return answer