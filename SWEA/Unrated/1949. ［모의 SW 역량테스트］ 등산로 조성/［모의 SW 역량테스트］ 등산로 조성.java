
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    
    
    static int[][] move={{0,1},{1,0},{0,-1},{-1,0}};
    static int ans;
    static int[][] m;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            
            int n=sc.nextInt();
            int k=sc.nextInt();
            m=new int[n][n];
            int start=-1;
            ans=Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
            	for(int j=0; j<n; j++){
                	m[i][j]=sc.nextInt();
                    if(m[i][j]>start){
                    start=m[i][j];
                    }
                }
            }
              for(int i=0; i<n; i++){
            	for(int j=0; j<n; j++){
                    boolean[][] visited=new boolean [n][n];
                    if(start==m[i][j]){
                        visited[i][j]=true;
                       	dfs(new int[]{i, j}, 1,n,visited,k, false);
                    }
                
                }
            }
            
            System.out.println("#"+test_case+" "+ans);
		}
	}
    static void dfs(int[] start, int cnt, int n, boolean[][] visited, int k, boolean flag ){
        ans=Math.max(ans, cnt);

        for(int i=0; i<4; i++){
        	int mx=start[0]+move[i][0];
            int my=start[1]+move[i][1];
            if(mx<0||my<0||mx>=n||my>=n||visited[mx][my]){
                continue;
            };
        	if(m[mx][my]<m[start[0]][start[1]]){
                 visited[mx][my]=true;
            	dfs(new int[]{mx,my}, cnt+1, n, visited,k,flag);
                visited[mx][my]=false;
            }
            
            else if(m[mx][my]-k<m[start[0]][start[1]]&&!flag){
                visited[mx][my]=true;
                int temp=m[mx][my];
                m[mx][my]=m[start[0]][start[1]]-1;
            	dfs(new int[]{mx,my}, cnt+1, n, visited,k,true);
                m[mx][my]=temp;
                visited[mx][my]=false;
            }

            
             
        }
  		
    
    }
    
}