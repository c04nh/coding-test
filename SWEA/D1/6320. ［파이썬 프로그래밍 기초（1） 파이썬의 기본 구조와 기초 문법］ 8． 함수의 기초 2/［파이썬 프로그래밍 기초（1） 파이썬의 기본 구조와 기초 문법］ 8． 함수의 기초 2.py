name1 = input()
name2 = input()

dic = {name1: "", name2: ""}

dic[name1] = input()
dic[name2] = input()

def RSP(a, b):
    if a == b:
        print("비겼습니다.")
    if (a == "가위" and b == "보") or (a == "보" and b == "가위"):
    	print("가위가 이겼습니다!")
    elif (a == "바위" and b == "가위") or (a == "가위" and b == "바위"):
    	print("바위가 이겼습니다!")
    else:
    	print("보가 이겼습니다!")
          
RSP(dic[name1], dic[name2])