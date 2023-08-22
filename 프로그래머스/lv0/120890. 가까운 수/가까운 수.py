def solution(array, n):
    if n in array:
        answer=n
    else:
        array.append(n)
        answer=0
        left=0
        right=0
        ss=sorted(array)
        for i in range(len(ss)):
            if ss[i]==n:
                if i==len(ss)-1:
                    left=ss[i-1]
                elif i==0:
                    right=ss[i+1]
                else:
                    left=ss[i-1]
                    right=ss[i+1]
        if n-left>right-n and left!=0 and right!=0:
            answer=right
        elif left==0:
            answer=right
        elif right==0:
            answer=left
        else:
            answer=left
    return answer
