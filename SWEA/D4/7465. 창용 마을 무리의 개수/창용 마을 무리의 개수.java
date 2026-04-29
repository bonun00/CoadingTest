
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    
    
    static List<Integer>[] cy;
    static boolean[] visited;
    
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n=sc.nextInt();
            int m=sc.nextInt();
            cy=new ArrayList[n+1];
       		visited=new boolean[n+1];
  
            for(int i=0; i<=n; i++){
            	cy[i]=new ArrayList<>();
            }
            
            for(int i=0; i<m; i++){
				int x=sc.nextInt();
                int y=sc.nextInt();
                cy[x].add(y);
                cy[y].add(x); 
            }
            int ans=0;
            
            
            for(int i=1; i<=n; i++){
                if(visited[i]) continue;
            	bfs(i);
                ans++;
 				
            }
			
            System.out.println("#"+test_case+" "+ans);

		}
	}
    
    static void bfs(int a){
    	
        Deque<Integer> q=new ArrayDeque<>();
        q.add(a);
        while(!q.isEmpty()){
        	int temp= q.poll();
			visited[temp]=true;            
            for(int c: cy[temp]){    
                if(visited[c]) continue;
            	q.add(c);
            }

        }
        
        
        
        
        
    	
    
    }
    
    
}