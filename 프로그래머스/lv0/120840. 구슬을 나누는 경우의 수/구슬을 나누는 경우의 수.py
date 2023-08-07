def solution(balls, share):
    answer = 1
    cnt=share
    for i in range(share):
        answer*=balls
        balls-=1
    for u in range(share):
        answer//=cnt
        cnt-=1
    return answer