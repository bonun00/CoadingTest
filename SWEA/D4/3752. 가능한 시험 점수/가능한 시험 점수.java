
import java.util.*;
import java.io.FileInputStream;


class Solution
{
	static int n;
    static int p[];
    static Set<Integer> ans;
    static boolean[][] visited;
    public static void main(String args[]) throws Exception
	{
	

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
				
            n=sc.nextInt();
            p=new int[n];
            ans=new HashSet<>();
            visited=new boolean[101][10001];
            for(int i=0; i<n; i++){
            	p[i]=sc.nextInt();
            }
            
            dfs(0,0);
		
        System.out.println("#"+test_case+" "+ans.size());
        }
	}
    
    public static void dfs(int res, int idx){
    
        		if(visited[idx][res])return;
        		visited[idx][res]=true;
        	
    			if(idx==n){
                	ans.add(res);
                    return;
                };
 			   
        
	    		dfs(res+p[idx], idx+1);
        		dfs(res, idx+1);
    
    
    }
    
    
}