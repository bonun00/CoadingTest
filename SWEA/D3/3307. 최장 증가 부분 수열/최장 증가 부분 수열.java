import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int ans;
    static int[] s;
    static int n;
    
   public static void main(String args[]) throws Exception
   {

      Scanner sc = new Scanner(System.in);
      int T;
      T=sc.nextInt();


      for(int test_case = 1; test_case <= T; test_case++)
      {
           n=sc.nextInt();
            s= new int[n];
            ans=0;
           	int[] dp=new int[n];
            for(int i=0; i<n; i++){
               s[i]=sc.nextInt();
            	dp[i]=1;
            }
          for(int i=0; i<n; i++){
              for(int j=0; j<i; j++){
                  if(s[j]<s[i]){
                  	dp[i]=Math.max(dp[i],dp[j]+1);
                  }
              		
              }
              ans = Math.max(ans, dp[i]);
          }

    
            
      System.out.println("#"+test_case+" "+ans);
      }
   }
}