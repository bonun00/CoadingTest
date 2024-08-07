import sys
n, k =map(int,sys.stdin.readline().split())
alist=list(range(1,n+1))
point=0
result=[]

while len(alist)!=0:
    point+= (k - 1)
    point=point%len(alist)
    result.append(alist[point])
    del alist[point]

print("<",end="")
for i in range(0,len(result)-1):
    print(result[i] ,end=", ")
print(result[n-1],end="")
print(">", end="")