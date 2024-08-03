import sys
line = int(sys.stdin.readline())
stack=[]

for i in range(line):
    alist=list(sys.stdin.readline())
    for i in range(len(alist)-1):
        if alist[0]=="(":
            for u in range(1,len(alist)):
                if alist[u]==")":
                    alist.remove("(")
                    alist.remove(")")
                    break
        else:
            break
    if len(alist)==1 and alist[0]=="\n":
        print("YES")
    else:
        print("NO")