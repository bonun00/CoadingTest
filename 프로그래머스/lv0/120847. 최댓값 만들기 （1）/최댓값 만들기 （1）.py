def solution(numbers):
    big=max(numbers)
    numbers.remove(max(numbers))
    big2=max(numbers)
    answer=big*big2
    return answer