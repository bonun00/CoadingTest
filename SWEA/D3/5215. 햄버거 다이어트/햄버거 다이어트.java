import java.util.*;
import java.io.FileInputStream;

class Solution
{
    
    static int[][] ham;
    static int ans;
    static int n;
    static int limit;
    static boolean[] visited;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
            limit=sc.nextInt();
            ham=new int[n][2];
            for(int i=0; i<n; i++){
                int s=sc.nextInt();
                int c=sc.nextInt();
                ham[i][0]=s;
                ham[i][1]=c;
            }
            ans=0;
    
            dfs(0,0,0);
            
			System.out.println("#"+test_case+" "+ans);
		}
	}
    public static void dfs(int index, int score,int cal){
     
    		
        
            if(cal<=limit){
                    if(score>ans){
                    ans=score;
                }
            } 
        
           if(index==n)return;
      
        for (int i = index; i < n; i++) {
        if (cal + ham[i][1] <= limit) {
            dfs(i + 1, score + ham[i][0], cal + ham[i][1]);
        }
    }
    } 
}