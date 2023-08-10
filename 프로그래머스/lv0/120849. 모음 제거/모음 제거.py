def solution(my_string):
    answer = ''
    str=list(my_string)
    for i in my_string:
        if i =="a" or i=="e" or i=="i" or i=="o" or i =="u":
            str.remove(i)
        answer="".join(str)
    return answer