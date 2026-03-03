import java.util.*;

class Solution {
    
    static ArrayList<Integer> [] tree;
    static boolean[] visited;
    
    public int solution(int n, int[][] wires) {
        int answer = -1;
        
        int minDiff=Integer.MAX_VALUE; 
        
       
        for(int k=0; k<wires.length; k++){
             tree=new ArrayList[n+1];
            
            for(int u=1; u<=n; u++){
                tree[u]=new ArrayList<>();
            }
             visited= new boolean[n+1];
            for(int i=0; i<wires.length; i++){
          
                if(i!=k){
                    int v1 = wires[i][0];
                    int v2 = wires[i][1];
                    tree[v1].add(v2);
                    tree[v2].add(v1);
                }
        }
            
            int count =dfs(1);    
            
            int temp= Math.abs(count-(n-count));
                
           if(minDiff>temp){
               minDiff=temp;
           }
                
                
        
            
        }
        
        
        return minDiff;
    }
    
    static int dfs(int n){
        int answer=0; 
        LinkedList<Integer> l=new LinkedList<>();
        l.add(n);
        while(!l.isEmpty()){
            int cur=l.poll();
            List<Integer>temp= tree[cur];
            if(visited[cur])continue;
            answer++;
            visited[cur]=true;
            l.addAll(temp);
        }
        
        
        return answer;
    }
    
    
    
    
}