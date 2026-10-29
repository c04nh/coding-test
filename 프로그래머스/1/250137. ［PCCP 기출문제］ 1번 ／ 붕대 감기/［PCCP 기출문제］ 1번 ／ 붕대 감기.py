def solution(bandage, health, attacks):
    index = 0
    attack = 0
    max_health = health
    
    for i in range(1, attacks[-1][0]+1):
        if i == attacks[index][0]:
            health -= attacks[index][1]
            index += 1
            attack = 0
        else:
            attack += 1
            health += bandage[1]
            
            if attack == bandage[0]:
                health += bandage[2]
                attack = 0
        
        if health > max_health:
            health = max_health
        elif health <= 0:
            break
            
    answer = health
    
    if answer <= 0:
        answer = -1
        
    return answer