num = int(input())

def checkPrime(num):
    if num <= 1:
        return False
    elif num == 2:
        return True
    else:
        for i in range(2, num):
            if num % i == 0:
                return False
    return True

if checkPrime(num):
    print("소수입니다.")