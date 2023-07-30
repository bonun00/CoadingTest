def solution(money):
    answer = []
    cup=money//5500
    answer.append(cup)
    change=money-5500*cup
    answer.append(change)
    
    
    return answer