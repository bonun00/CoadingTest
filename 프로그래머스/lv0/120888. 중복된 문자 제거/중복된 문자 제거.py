def solution(my_string):
    answer = ''
    strlist = list(my_string)
    for i in range(len(strlist)):
        for u in range(i+1, len(strlist)):
            if strlist[i] == strlist[u] and strlist[i] != "*":
                print(i)
                strlist[u] = "*"
    answer = "".join(strlist)
    answer = answer.replace("*", "")

    return answer