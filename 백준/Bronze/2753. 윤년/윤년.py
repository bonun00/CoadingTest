
def aaa (a):
    if a % 4==00 and a % 100 != 0:
        print("1")
    elif a% 400==0:
        print("1")
    else:
        print("0")


a=int(input())
aaa(a)