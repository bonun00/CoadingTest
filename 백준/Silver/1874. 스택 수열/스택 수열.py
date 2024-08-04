import sys
max = int(sys.stdin.readline())
stack=[]
result=[]
cnt=1

ans=0
for i in range(max):
    num=sys.stdin.readline().split()
    while cnt<=max or len(stack)>0:
        if cnt!=int(num[0])and cnt<=int(num[0])and cnt<=max:
            stack.append(cnt)
            result.append("+")
            cnt+=1
        elif cnt==int(num[0]):
            result.append("+")
            result.append("-")
            cnt+=1
            break
        elif len(stack)>0 and stack[len(stack)-1]== int(num[0]) :
            result.append("-")
            stack.pop()
            break
        else:
            ans=1
            break
if ans==0:
    for i in result:
        print(i)          
else:
    print("NO")