def solution(before, after):
    p = 0

    for i in before :

        if i in after :

            if before.count(i) == after.count(i) :

                p += 1

            else :
                continue

    if len(before) == p :

        answer = 1
    else :

        answer = 0

    return answer 