import sys
line = int(input())
queue=[]

for i in range(line):
    alist=sys.stdin.readline().split()
    order=alist[0]
    
    if order=="push":
        queue.append(alist[1])
        
    elif order=="pop":
        if len(queue)>0:
            print(queue[0])
            del queue[0]
        else:
            print("-1")
        
    elif order=="size":
        print(len(queue))
    elif order=="empty":
        if len(queue)>0:
            print("0")
        else:
            print("1")
    elif order=="front":
        if len(queue)>0:
            print(queue[0])
        else:
            print("-1")
    elif order=="back":
        if len(queue)>0:
            print(queue[-1])
        else:
            print("-1")
            