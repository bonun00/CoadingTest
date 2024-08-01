import sys	#sys 모듈 import
input=sys.stdin.readline

total=int(input())
n=int(input())
answer=0
alist= []
for _ in range(n):
    alist.append(list(map(int,input().split())))
 
for i in range(len(alist)):
    answer+=alist[i][0]*alist[i][1]
    
if answer==total:
    print("Yes")
else:
    print("No")


