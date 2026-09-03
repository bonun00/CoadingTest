
import java.util.*;

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
            int m=sc.nextInt();
            int[] mart=new int[n];
            for(int i=0; i<n; i++){
            	mart[i]=sc.nextInt();
            }
            int ans=Integer.MIN_VALUE;
            for(int i=0; i<n-1; i++){
            	for(int j=i+1; j<n; j++){
                	if(mart[i]+mart[j]<=m){
 						ans=Math.max(mart[i]+mart[j], ans);

                    }
                }
            } 
            System.out.println("#"+test_case+" "+(ans==Integer.MIN_VALUE?-1:ans));
		}
	}
}