x = int(input())
length = [64]

while True:
    length.sort()
    if x == sum(length):
        break
        
    if x < sum(length):
        length[0] /= 2
        
        if sum(length) < x:
            length.append(length[0])  
    
print(len(length))
        
        