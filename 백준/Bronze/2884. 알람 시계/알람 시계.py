def time(a,b):
    a= a*60+b
    result=a-45
    if result//60<0:
        print(f'{24+result//60} {result%60}')
    else:
        print(f'{result//60} {result%60}')

a,b=map(int,input().split(" "))
time(a,b)
