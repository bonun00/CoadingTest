def solution(s):
    answer = ''
    test=[]
    no=[]
    lists=list(str(s))
    for i in lists:
        if i not in test:
            test.append(i)
            if i in no:
                test.remove(i)
        elif i in test:
            no.append(i)
            test.remove(i)
        
            
    answer="".join(sorted(test))
    return answer