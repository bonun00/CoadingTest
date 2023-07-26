a,b,c=map(int,input().split(" "))
array=[]

array.append(a)
array.append(b)
array.append(c)
array2=max(array)

m=0
while len(array) != 0:
    for i, a in enumerate(set(array)):
        array.remove(a)
    if i ==0:
        m+=1
        big=a
if m==3:
    result = 10000+big*1000
elif m==1:
    result = 1000+big*100
else:
    result = array2*100

print(result)