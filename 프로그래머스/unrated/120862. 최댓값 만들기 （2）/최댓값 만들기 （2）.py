def solution(numbers):
    answer =-999999999999999999999999999999999
    for i in range(len(numbers)):
        for u in range(i+1,len(numbers)):
            if answer<numbers[i]*numbers[u]:
                answer=numbers[i]*numbers[u]
    return answer