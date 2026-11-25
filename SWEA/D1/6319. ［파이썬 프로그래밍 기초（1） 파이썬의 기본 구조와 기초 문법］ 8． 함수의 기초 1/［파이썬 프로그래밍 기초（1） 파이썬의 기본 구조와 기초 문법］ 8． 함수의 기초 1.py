import math

s = input()

def checkPalindrome(s):
    for i in range(math.ceil(len(s) // 2)):
        if s[i] != s[len(s) - i -1]:
            return False
    return True

print(s)
if checkPalindrome(s):
    print("입력하신 단어는 회문(Palindrome)입니다.")