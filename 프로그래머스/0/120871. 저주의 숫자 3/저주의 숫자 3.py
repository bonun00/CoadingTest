def solution(n):
    count = 0
    number = 0
    while count < n:
        number += 1
        if number % 3 != 0 and '3' not in str(number):
            count += 1
    return number

n = 10
print(solution(n))  

