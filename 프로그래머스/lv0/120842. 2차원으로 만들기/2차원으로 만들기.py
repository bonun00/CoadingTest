def solution(num_list, n):
    cols= n
    rows=len(num_list)//n
    answer = [[0 for j in range(cols)] for i in range(rows)]
    cnt=0
    for j in range(len(num_list)//n):
        for u in range(n):
            answer[j][u] = num_list[cnt]
            cnt+=1
    return answer
