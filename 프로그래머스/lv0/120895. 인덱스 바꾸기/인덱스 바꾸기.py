def solution(my_string, num1, num2):
    answer = ''
    listr=list(my_string)
    temp=''
    temp=listr[num1]
    listr[num1]=listr[num2]
    listr[num2]=temp
    answer="".join(listr)
    return answer