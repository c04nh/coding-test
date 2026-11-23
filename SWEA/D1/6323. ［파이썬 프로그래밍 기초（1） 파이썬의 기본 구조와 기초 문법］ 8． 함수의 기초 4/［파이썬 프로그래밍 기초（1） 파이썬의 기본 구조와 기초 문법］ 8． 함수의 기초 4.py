num = int(input())
arr = [1, 1]

for i in range(2, num):
    arr.append(arr[i-2] + arr[i-1])
    
print(arr)