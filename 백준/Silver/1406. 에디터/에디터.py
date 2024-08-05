import sys

word1 = list(sys.stdin.readline().strip())
word2 = []

for _ in range(int(sys.stdin.readline())):
  li = sys.stdin.readline().split()

  if li[0] == 'L' and word1:
    word2.append(word1.pop())
  elif li[0] == 'D' and word2:
    word1.append(word2.pop())
  elif li[0] == 'B' and word1:
    word1.pop()
  elif li[0] == 'P':
    word1.append(li[1])

answer = word1+word2[::-1]
print(''.join(answer))