def solution(price):
    answer = 0
    if price <100000:
        answer= price
    elif price>=100000 and 300000>price:
        answer=price*0.95
    elif price>=300000 and 500000>price:
        answer=price*0.9
    else:
        answer=price*0.8
    return int(answer)