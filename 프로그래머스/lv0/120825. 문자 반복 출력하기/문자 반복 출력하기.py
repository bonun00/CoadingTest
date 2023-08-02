def solution(my_string, n):
    answer = ''
    for i in my_string:
        answer+=int(n)*i
    return answer