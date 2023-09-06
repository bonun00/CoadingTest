def solution(num, k):
    answer = 0
    num=list(str(num))
    for i in range(len(num)):
        if int(num[i])==k:
            return i+1
    return -1