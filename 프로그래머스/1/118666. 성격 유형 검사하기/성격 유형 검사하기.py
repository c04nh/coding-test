def solution(survey, choices):
    answer = ''
    type = {'R': 0, 'T': 0, 'C': 0, 'F': 0, 'J': 0, 'M': 0, 'A': 0, 'N': 0}
    
    for i in range(len(survey)):
        if survey[i] == 'RT':
            a = 'R'
            b = 'T'
        elif survey[i] == 'TR':
            a = 'T'
            b = 'R'
        elif survey[i] == 'CF':
            a = 'C'
            b = 'F'
        elif survey[i] == 'FC':
            a = 'F'
            b = 'C'
        elif survey[i] == 'JM':
            a = 'J'
            b = 'M'
        elif survey[i] == 'MJ':
            a = 'M'
            b = 'J'
        elif survey[i] == 'AN':
            a = 'A'
            b = 'N'
        else:
            a = 'N'
            b = 'A'
            
        if choices[i] > 4:
            type[b] += choices[i] - 4
        elif choices[i] < 4:
            type[a] += 4 - choices[i]
            
    if type['R'] >= type['T']:
        answer += 'R'
    else:
        answer += 'T'
        
    if type['C'] >= type['F']:
        answer += 'C'
    else:
        answer += 'F'
        
    if type['J'] >= type['M']:
        answer += 'J'
    else:
        answer += 'M'
        
    if type['A'] >= type['N']:
        answer += 'A'
    else:
        answer += 'N'
        
    return answer