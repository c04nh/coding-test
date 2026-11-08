T = int(input())
 
for test_case in range(1,T+1):
    arr = map(int, input().split())
    num = 0
    for i in arr:
        if i % 2 == 1:
            num += i
    print("#" + str(test_case), str(num))