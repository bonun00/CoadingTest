def solution(my_str, n):
    answer = []
    str_list = list(my_str)
    while len(str_list) != 0:
        answer.append(''.join(str_list[0:n]))
        del str_list[0:n]

    return answer