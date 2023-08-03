def solution(emergency):
    answer = emergency.copy()
    t=0
    while t!=len(emergency):
        for i in range(len(emergency)):
             if max(emergency) == emergency[i] and max(emergency)!=0:
                t += 1
                answer[i] = t
                emergency[i]=0
    return answer