class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] move={{0,1},{1,0},{-1,0},{0,-1}};
        int len=board.length;
        String color=board[h][w];
        
        for(int i=0; i<4; i++){
            int mx= h+move[i][0];
            int my= w+move[i][1];
            if(mx<0||my<0||mx>=len||my>=len) continue;
            if(board[mx][my].equals(color))answer++;
        }
        
        
        
        return answer;
    }
}