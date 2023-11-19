def solution(array):
    answer = 0
    for i in range(len(array)):
        seven_str=str(array[i])
        answer +=seven_str.count("7")

    return answer
