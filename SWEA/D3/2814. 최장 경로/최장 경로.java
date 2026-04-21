
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    
    
    static   List<Integer>[] node;
    static boolean[] visited;
    static int ans;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
		   int n=sc.nextInt();
           int m =sc.nextInt();
       	   ans=1;
           node=new ArrayList[n+1];
      
           for (int i = 1; i <=n; i++) { 
               node[i] = new ArrayList<>();  
           } 
            
            for(int i=0; i<m; i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                node[x].add(y);
                node[y].add(x);
            }
           
            
            for(int i=1; i<=n; i++ ){
                 visited=new boolean[n+1];
           		 dfs(i,1);
            }
     		
            
            
            System.out.println("#"+test_case+" "+ ans);

		}
	}
    public static void dfs(int a, int r){
    		if(visited[a]) return;
        	visited[a]=true;
           if(ans<r) ans=r;
        
        List<Integer>temp = node[a];
        
        for(int i=0; i<temp.size(); i++){
        	dfs(temp.get(i) ,r+1);
        }
     
        
        visited[a] = false;
    }
}