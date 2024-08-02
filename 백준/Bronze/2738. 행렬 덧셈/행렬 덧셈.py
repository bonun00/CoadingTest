N, M = map(int, input().split())

alist=[]
result=[[0 for j in range(M)] for i in range(N)]
for _ in range(N*2):
    alist.append(list(map(int,input().split())))

for i in range(N):
    
    for u in range(M):
        result[i][u]=alist[i][u]+alist[N+i][u]
        
for row in result:
    print(" ".join(map(str, row)))
