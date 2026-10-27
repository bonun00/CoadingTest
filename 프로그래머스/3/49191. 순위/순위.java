import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        List<Integer>[] graph=new ArrayList[n+1];
        for(int i=0; i<n+1; i++)graph[i]=new ArrayList<>();
        
        for(int i=0; i<results.length; i++){
            int a=results[i][0],b=results[i][1]; 
            graph[a].add(b);
        }
        
        int[][] win=new int[n+1][n+1];
        
        for(int i=1; i<=n; i++){
            Deque<Integer>q =new ArrayDeque<>();
            boolean[] visited=new boolean[n+1];
            q.add(i);
            visited[i]=true;
            while(!q.isEmpty()){
                int t=q.poll();
                for(int a:graph[t]){
                    if(visited[a])continue;    
                    visited[a]=true;
                    win[i][a]++;
                    q.add(a);
                }   
            }
        }
        
        
        for(int i=1; i<=n;i++){
            int temp=0;
            for(int j=1; j<=n; j++ ){
                temp+=win[i][j];
                temp+=win[j][i];
            }
            if(temp==n-1)answer++;
        }
        
        
        return answer;
    }
}