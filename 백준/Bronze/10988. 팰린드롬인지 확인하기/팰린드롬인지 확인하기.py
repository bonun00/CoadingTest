a= list(input())
c=0
n=len(a)-1
while c < n:
    if a[c]==a[n]:
        c+=1
        n-=1

    else:
        print("0")
        break
if c>=n:
    print("1")
