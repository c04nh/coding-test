def solution(numbers):
    answer = ''
    
    while len(numbers) > 0:
        if numbers[:3] == "one":
            answer += '1'
            numbers = numbers[3:]
        elif numbers[:3] == "two":
            answer += '2'
            numbers = numbers[3:]
        elif numbers[:5] == "three":
            answer += '3'
            numbers = numbers[5:]
        elif numbers[:4] == "four":
            answer += '4'
            numbers = numbers[4:]
        elif numbers[:4] == "five":
            answer += '5'
            numbers = numbers[4:]
        elif numbers[:3] == "six":
            answer += '6'
            numbers = numbers[3:]
        elif numbers[:5] == "seven":
            answer += '7'
            numbers = numbers[5:]
        elif numbers[:5] == "eight":
            answer += '8'
            numbers = numbers[5:]
        elif numbers[:4] == "nine":
            answer += '9'
            numbers = numbers[4:]
        else:
            answer += '0'
            numbers = numbers[4:]
            
    answer = int(answer)
    
    return answer