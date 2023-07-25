def cook(a,b,c):
    time=a*60+b+c
    if time//60>=24:
        print(f"{time//60-24} {time%60}")
    else:
        print(f"{time//60} {time % 60}")

a,b=map(int,input().split(" "))
c=int(input())

cook(a,b,c)