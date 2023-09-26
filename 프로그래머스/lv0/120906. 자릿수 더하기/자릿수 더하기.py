def solution(n):
    nlist=list(str(n))
    answer=0
    for i in range(len(nlist)):
        answer+=int(nlist[i])
    return answer