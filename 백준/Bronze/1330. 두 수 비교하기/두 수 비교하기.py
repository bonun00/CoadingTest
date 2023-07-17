import sys


def same(a, b):
    if a > b:
        return ">"
    elif a < b:
        return "<"
    else:
        return "=="


a, b = map(int, sys.stdin.readline().split())

print(same(a,b))