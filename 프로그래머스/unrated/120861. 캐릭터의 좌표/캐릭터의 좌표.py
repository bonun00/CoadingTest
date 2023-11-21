def solution(keyinput, board):
    answer = [0,0]
    board=[board[0]//2,board[1]//2]
    for i in range(len(keyinput)):
        if keyinput[i]=="up":
            answer[1]+= 1
            if answer[1]>board[1]:
                answer[1]-=1
        elif keyinput[i]=="down":
            answer[1]-=1
            if answer[1]<-(board[1]):
                answer[1]+=1
        elif keyinput[i]=="left":
            answer[0]-=1
            if answer[0]<-(board[0]):
                answer[0]+=1
        elif keyinput[i]=="right":
            answer[0]+=1
            if answer[0]>board[0]:
                answer[0]-=1
        
    return answer