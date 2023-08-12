def solution(s):
    answer = 0
    re=0
    word= s.split()
    print(word)
    for i in word:
        if i=="Z":
            answer-=re
        else:
            answer+=int(i)
            re=int(i)
    return answer