a,b= map(int,input().split())
result=0
c=list(map(int,input().split()))
max=0
for i in range(0,len(c)):
    for u in range(1, len(c)):
        for y in range(2, len(c)):
                result=c[i]+c[u]+c[y]
                if int(max)<int(result) and b>=int(result) and c[i]!=c[u]!=c[y] and c[i]!=c[y]:
                    max=result
print(max)