arr = [2, 4, 6, 8, 10]
print(arr)

def check(num):
    if num not in arr:
        print("False")
    else:
        print("True")
        
print(5, "=> ", end="")
check(5)
print(10, "=> ", end="")
check(10)