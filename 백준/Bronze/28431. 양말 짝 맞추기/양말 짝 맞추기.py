arr = []

for i in range(5):
    a = input()

    if arr.count(a) > 0:
        arr.remove(a)
    else:
        arr.append(a)

print(arr[0])