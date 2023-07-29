def solution(n):
    a=0
    result=n
    while result%6!=0:
        a+=1
        result=n*a
        
    return result//6