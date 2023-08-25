def solution(array):
    answer = []
    big=max(array)
    for i in range(len(array)):
        if big==array[i]:
            answer.append(big)
            answer.append(i)
    return answer