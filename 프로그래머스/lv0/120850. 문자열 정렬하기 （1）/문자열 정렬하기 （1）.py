def solution(my_string):
    answer = []
    mystring= list(my_string)
    for i in range(0, 10):
        for u in mystring:
            if str(i) == u:
                answer.append(int(u))

    answer.sort()
    return answer