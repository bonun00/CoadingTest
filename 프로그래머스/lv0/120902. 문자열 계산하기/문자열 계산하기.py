def solution(my_string):
    answer =0
    num=[]
    pm=[]
    listr=list(my_string.split())
    for i in range(len(listr)):
        if i%2==0:
            num.append(int(listr[i]))
        else:
            pm.append(listr[i])
    answer+=num[0]
    for u in range(len(pm)):
        if pm[u]=="+":
            answer+=num[u+1]
        else:
            answer-=num[u+1]
    return answer