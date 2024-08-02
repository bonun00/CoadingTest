import sys
line = int(sys.stdin.readline())


for i in range(line):
    alist=sys.stdin.readline().split()
    word=""
    for u in range(len(alist)):
        now=alist[u]
        for o in reversed(now):
             word+=o
        word+=" "
    print(word)