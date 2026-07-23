import java.util.*;

class Solution {
    boolean visited[][];
    int[][] move={{1,0},{0,1},{0,-1},{-1,0}};
    int[][] l;
    int[] ans;
    
    public int solution(int[][] land) {
        int answer = 0;
        l=land;
        visited=new boolean[l.length][l[0].length];
        ans=new int [l[0].length];
        for(int i=0; i<l.length; i++){
            for(int j=0; j<l[0].length; j++){
                if(visited[i][j]||l[i][j]==0)continue;
                bfs(i,j);
            }
        }
        for(int i=0; i<l[0].length; i++){
            answer=Math.max(answer, ans[i]);
        }
        
        
        return answer;
    }

    
    void bfs(int a, int b){
        Deque<int[]> q=new ArrayDeque<>();
        Set<Integer> s=new HashSet<>();
        visited[a][b]=true;
        q.add(new int[]{a,b});
        s.add(b);
        int cnt=1;
        while(!q.isEmpty()){
            int[] t=q.poll();
            for(int i=0; i<4; i++){
                int ma=t[0]+move[i][0];
                int mb=t[1]+move[i][1];
                
                if(ma<0||mb<0||ma>=l.length||mb>=l[0].length)continue;
                if(visited[ma][mb]||l[ma][mb]==0)continue;
                cnt++;
                visited[ma][mb]=true;
                q.add(new int[]{ma, mb});
                s.add(mb);
            }
        }
        for(int set: s){
            ans[set]+=cnt;
            
        }  
        
    }
        
        
        
}