
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
            boolean[] dp= new boolean [max+1];

            dp[0]=true;
			for(int i=0; i<n; i++){
            	int cur=p[i];
                for(int j=max;  j>=cur;  j-- ){
					if(dp[j-cur]){
                    	dp[j]=true;
                    }	    			       			
    	        
            }
            }
            int ans=0; 
            for(int i=0; i<=max; i++){
                	if(dp[i])ans++;
            }
            
            
		
        System.out.println("#"+test_case+" "+ans);
        }
	}
}