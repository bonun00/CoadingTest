def solution(s1, s2):
    answer = 0
    for i in s1:
        for u in s2:
            if i==u:
                answer+=1
    return answer