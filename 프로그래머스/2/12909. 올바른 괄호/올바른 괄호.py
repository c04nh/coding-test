def solution(s):
    answer = True
    arr = []
    
    for c in s:
        if c == "(":
            arr.append("(")
        else:
            if len(arr) == 0:
                return False
            elif arr[-1] == "(":
                arr.pop()
            else:
                return False
            
    if len(arr) != 0:
        return False

    return True