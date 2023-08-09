numbers=int(input())
for i in range(1, numbers+1):
    hap = sum(list(map(int, str(i))))
    total= i+ hap
    if total==numbers:
        print(i)
        break
    elif i==numbers:
        print(0)