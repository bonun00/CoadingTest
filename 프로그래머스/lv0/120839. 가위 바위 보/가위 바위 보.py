def solution(rsp):
    answer = []
    rsp = list(rsp)
    for i in rsp:
        print(i)
        if i =="2":
            answer.append("0")
        elif i == '0':
            answer.append("5")
        else:
            answer.append("2")

    a = "".join(answer)
    return a