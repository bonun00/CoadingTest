def solution(n):
    answer = 1
    cnt=1
    while answer<=n:
        cnt+=1
        answer*=cnt
    return cnt-1