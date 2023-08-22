def solution(cipher, code):
    answer = ''
    cipher=list(str(cipher))
    for i in range(code-1,len(cipher),code):
        answer+=cipher[i]
    
    return answer