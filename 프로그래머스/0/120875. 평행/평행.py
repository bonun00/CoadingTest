def slope(p1, p2):
    return (p2[1] - p1[1]) / (p2[0] - p1[0]) if p2[0] != p1[0] else None

def solution(dots):
    p1, p2, p3, p4 = dots
    slopes = [
        (p1, p2, p3, p4),
        (p1, p3, p2, p4),
        (p1, p4, p2, p3)
    ]
    for s in slopes:
        if slope(s[0], s[1]) == slope(s[2], s[3]):
            return 1
    return 0

dots = [[1, 2], [2, 4], [3, 6], [4, 8]]

print(solution(dots))  