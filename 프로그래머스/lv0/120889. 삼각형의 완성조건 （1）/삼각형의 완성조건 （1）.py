def solution(sides):
    answer = 0
    long=max(sides)
    sides.remove(max(sides))
    if long<sides[0]+sides[1]:
        return 1
    else:
        return 2