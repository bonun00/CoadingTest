def solution(s):
    answer = ''
    double=[]
    lists=list(str(s))
    for i in lists:
        if i not in double:
            double.append(i)
        else:
            double.remove(i)
    answer="".join(double)
    return answer