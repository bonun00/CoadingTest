def solution(numbers, k):
    answer = 0
    cnt=0
    for i in range(k):
        answer=numbers[cnt]
        if i==k-1:
            return answer
        elif numbers[cnt]==numbers[len(numbers)-1]:
            cnt=1
        elif numbers[cnt]==numbers[len(numbers)-2]:
            cnt=0
        else:
            cnt+=2