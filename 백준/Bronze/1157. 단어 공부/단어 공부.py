from collections import Counter

array = list(input().upper())
a= Counter(array).most_common(2)
if len(a)==1:
    print(a[0][0])
elif a[0][1]!=a[1][1]:
   print(a[0][0])
else:
   print("?")
