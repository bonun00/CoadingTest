
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int n;
    static int[][] room;
    static boolean[][] visited;
    static int ans;
    static int s;
    static int[][] move={{1,0},{0,1},{-1,0},{0,-1}};
    
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            n=sc.nextInt();
            room=new int[n][n];
       
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                	room[i][j]=sc.nextInt();
                }
            }
            
            ans=0;
        	 for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
					visited= new boolean[n][n];
                	dfs(room[i][j],i,j,1);
                }
            }
            
		System.out.println("#"+test_case+" "+s+" "+ans);
		}
	}
    static void dfs(int start, int a, int b, int c){
    
        if(visited[a][b])return;
        visited[a][b]=true;
        	if(ans==c){
				if(s>start)s=start;
            }else if(ans<c){
            	ans=c;
                s=start;
            }       

        
        
        
        for(int i=0; i<4; i++){
        	int ma=a+move[i][0];
            int mb=b+move[i][1];

			if(ma<0||mb<0||ma>=n||mb>=n)continue;
            if(room[a][b]==room[ma][mb]-1){
               dfs(start, ma,mb, c+1);
            }

        }
        
        
    	
    
    }
    
    
}