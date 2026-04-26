
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    
    static int ans;
    static int k;
    static int n;
    static int[] nums;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
            k=sc.nextInt();
            nums=new int[n];
            for(int i=0; i<n; i++){
            	nums[i]=sc.nextInt();
            }
            ans=0;
            
            
            dfs(0,0);
            
            System.out.println("#"+test_case+" "+ans);
		}
	}
    public static void dfs(int num, int idx){
     
    	if(num==k){
        	ans++;
            return;
        }        
            if(idx>=n) return;
        dfs(num+nums[idx], idx+1);
        dfs(num,idx+1);    
    }
}