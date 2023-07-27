a= int(input())
b=a-1
c=1
for i in range(a):
    print(end=" "*b)
    b-=1
    print("*"*c)
    c+=2
c-=2
b+=1
for u in range(a-1):
    b+=1
    print(end=" "*b)
    c-=2
    print("*"*c)
