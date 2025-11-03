import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int m: moves){
            for(int u=0; u<board.length; u++){
                if(board[u][m-1]!=0){
                    if(!q.isEmpty()&&q.peekLast()==board[u][m-1]){
                        answer+=2;
                        q.pollLast();
                        board[u][m-1]=0;
                        break;
                    }else{
                        q.addLast(board[u][m-1]);      
                        board[u][m-1]=0;
                        break;
                    }
                 
                }
                
                
            }
        }
        
        
        return answer;
    }
}