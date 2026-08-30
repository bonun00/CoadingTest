import java.util.*;
import java.io.FileInputStream;

class Solution
{
    
    static class Graph implements Comparable<Graph>{
    	
    	int node;
        double cost;
        
        Graph(int node, double cost){
        	this.node=node;
            this.cost=cost;
        }
        
        
        @Override
        public int compareTo(Graph o){
        	return Double.compare(this.cost,o.cost);
        }
    }
    
    static List<List<Graph>> g;
    static boolean[] visited;
    static double ans;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
            double[] x=new double[n];
            double[] y=new double[n];
            g=new ArrayList<>();
      
            for(int i=0; i<n; i++){
            	x[i]=sc.nextInt();
 				g.add(new ArrayList());
            }
            
             for(int i=0; i<n; i++){
            	y[i]=sc.nextInt();
            }
 			double L=sc.nextDouble();     
            
            for(int i =0; i<n-1; i++){
            	for(int j=i+1; j<n; j++ ){
                    double d=(Math.pow(Math.abs(x[i]-x[j]),2)+Math.pow(Math.abs(y[i]-y[j]),2))*L;
                	g.get(i).add(new Graph(j,d));
                	g.get(j).add(new Graph(i,d));
                }
            }
			visited=new boolean[n];
            ans=0;
            dijkstra(0, n);
            System.out.println("#"+test_case+" "+Math.round(ans));
            
		}
	}
    static void dijkstra(int start,int n ){
   		PriorityQueue<Graph> pq=new PriorityQueue<>(); 		
    	

        pq.add(new Graph(start, 0));
       	int cnt=0;
        while(!pq.isEmpty()){
        	Graph t=pq.poll();
              if(visited[t.node])continue;
              visited[t.node]=true;
      
              ans+=t.cost ;
            cnt++ ;
       		if(cnt==n)break;
            
            for(Graph gt:g.get(t.node)){
				if(visited[gt.node])continue;
            	pq.add(new Graph(gt.node, gt.cost) );
            }
        }
    } 
    
}