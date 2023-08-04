a = int(input())

cnt=a
for i in range(a):
    word=input()
    for u in range(len(word)-1):
        if word[u]==word[u+1]:
            pass
        elif word[u] in word[u+1:]:
            cnt-=1
            break
print(cnt)