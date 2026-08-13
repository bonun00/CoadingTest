import java.util.*;

class Solution {
    
    class Graph implements Comparable<Graph>{
        int idx;
        int cost;
        
        public Graph(int idx, int cost){
            this.idx=idx;
            this.cost=cost;
        }

        @Override
        public int compareTo(Graph g){
            return Integer.compare(this.cost,g.cost);
        }
    }
    

    
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = Integer.MAX_VALUE;
      
        List<List<Graph>> g=new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            g.add(new ArrayList<Graph>());  
        }
        for(int[] f: fares){
            g.get(f[0]).add(new Graph(f[1], f[2]));
            g.get(f[1]).add(new Graph(f[0], f[2]));
        }

        int[] A=taxi(a,g,n);
        int[] B=taxi(b,g,n);
        int[] C=taxi(s,g,n);
        
        for(int i=1; i<=n; i++){
            answer=Math.min(answer,A[i]+B[i]+C[i]);
        }
        
        return answer;
    }
    int[] taxi(int i, List<List<Graph>> g ,int n){
        int[] dist=new int[n+1];
        PriorityQueue<Graph> pq=new PriorityQueue<>();
  
        int ans=Integer.MAX_VALUE;
        Arrays.fill(dist,20000000);
    
        dist[i]=0;
        pq.add(new Graph(i,0));
        
        while(!pq.isEmpty()){
            Graph t=pq.poll();
            
            if(dist[t.idx]<t.cost)continue;
            
            for(Graph gr: g.get(t.idx)){
                
                if(t.cost+gr.cost < dist[gr.idx]) {

                dist[gr.idx]=t.cost+gr.cost;
                pq.add(new Graph(gr.idx,gr.cost+t.cost));   
                }
            }
            
        }
        return dist;
        
        
        
        
    }
    
}