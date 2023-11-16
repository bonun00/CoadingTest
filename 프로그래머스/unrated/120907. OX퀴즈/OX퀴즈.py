def solution(quiz):
    answer = []
    for i in range(len(quiz)):
        temp = quiz[i].split()
        print(temp)
        if temp[1] == '+':
            if int(temp[0]) + int(temp[2]) == int(temp[4]):
                answer.append("O")
            else:
                answer.append("X")
        else:
            if int(temp[0]) - int(temp[2]) == int(temp[4]):
                answer.append("O")
            else:
                answer.append("X")

    return answer