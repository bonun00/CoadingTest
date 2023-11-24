import re
def solution(my_string):
    answer = 0
    new_str = re.split(r"[^0-9]", my_string)
    for i in new_str:
        if i.isdigit():
            answer += int(i)
    return answer