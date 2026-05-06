import java.util.*;

class Solution {
    
    static List<Integer>[] node;
    static boolean[] visited;
    
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        node=new ArrayList[n+1];
        
   
         
        for(int i=0; i<wires.length; i++){
            
            for(int u=0; u<=n; u++){
                node[u]=new ArrayList<>();
            }
            visited=new boolean[n+1];
            for(int j=0; j<wires.length; j++){
                if(i!=j){
                    int a= wires[j][0];
                    int b= wires[j][1];
                    node[b].add(a);
                    node[a].add(b);
                }
                
            }
            int c=bfs(1);
            int a= Math.abs(c-(n-c));
            if(answer>a ){
                    
                answer=a;
            }
                
            
            
        }
        

        
        return answer;
    }
    
    static int bfs(int a){
        Deque<Integer> q=new ArrayDeque<>();
        int ans=1;
        visited[a]=true;
        q.add(a);
        
        while(!q.isEmpty()){
            int temp=q.poll();
  
            for(int n: node[temp]){
                if(visited[n])continue;
                visited[n]=true;
                 ans++;
                 q.add(n);
            }
           
        }        
        
        return ans;
        
    }
    
    
}