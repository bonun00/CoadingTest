def solution(slice, n):
    answer=slice
    c=0
    if slice==n or slice>n:
        return 1
    else:
        while answer<n:
            c+=1
            answer=slice*c
        return c
 