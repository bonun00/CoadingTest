
import java.util.*;
import java.io.FileInputStream;


class Solution
{
    public static void main(String args[]) throws Exception
	{
	

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
				
            int n=sc.nextInt();
     		int max=0;     
          
            int[] p= new int[n];
            for(int i=0; i<n; i++){
 				p[i]=sc.nextInt();
                max+=p[i];            
            }
            boolean[][] dp= new boolean [n+1][max+1];

            dp[0][0]=true;
			for(int i=1; i<=n; i++){
            	int cur=p[i-1];
                for(int j=0; j<=max; j++ ){
                if(dp[i-1][j]){
                	dp[i][j]=true;
					if(j+cur<=max){
                    dp[i][j+cur]=true;
                    
                    }                
                }
            
            }
            }
            int ans=0; 
            for(int i=0; i<=max; i++){
                	if(dp[n][i])ans++;
            }
            
            
		
        System.out.println("#"+test_case+" "+ans);
        }
	}
}