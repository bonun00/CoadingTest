import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<Integer>[] gr=new ArrayList[n+1];
        for(int i=0; i<n+1; i++)gr[i]=new ArrayList<>();
        for(int i=0; i<edge.length; i++){
            int a=edge[i][0];
            int b=edge[i][1];
            gr[a].add(b);
            gr[b].add(a);
        }
        
        boolean[] visited=new boolean[n+1];
        Deque<Integer> q=new ArrayDeque<>();
        q.add(1);
        visited[1]=true;
        int max=0;
        int[] res=new int[n+1];
        
        
        while(!q.isEmpty()){
            int t=q.poll();
            int a=res[t];
            max=Math.max(a, max);
            for(int g:gr[t]){
                if(visited[g])continue;
                visited[g]=true;
                q.add(g);
                res[g]=a+1;     
            }  
        }
        
        int answer=0;
        for(int r: res){
            if(r==max)answer++;
            
        }
                
        
        
        return answer;
    }

    
}