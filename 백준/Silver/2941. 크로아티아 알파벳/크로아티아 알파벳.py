a = input()
result=0


a=a.replace('c=',"*").replace('c-',"*")
a=a.replace('dz=',"*").replace('d-',"*")
a=a.replace('lj',"*").replace('nj',"*")
a=a.replace('s=',"*").replace('z=',"*")
a=list(a)

result=len(a)

print(result)
