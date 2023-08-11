def solution(my_string):
    answer = 0
    word=list(my_string)
    for i in  range(1,10):
        for u in word:
            if str(i)==u:
                answer+=int(u)
    return answer