def solution(my_string):
    answer = ''
    strlist=list(str(my_string))
    for i in strlist:
        a=i.upper()
        if i==a:
            a=i.lower()
        answer+=a
    return answer