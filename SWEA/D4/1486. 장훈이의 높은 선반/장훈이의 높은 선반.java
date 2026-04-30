
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int[] tall;
    static int b;
 	static int n;   
    static int ans;
    
    public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            n=sc.nextInt();
            b=sc.nextInt();
            tall=new int[n];
            
            for(int i=0; i<n; i++){
            	tall[i]=sc.nextInt();
            }
            
            ans=Integer.MAX_VALUE;
            dfs(0,0);
            
			System.out.println("#"+test_case+" "+ans);
		}
	}
    
    static void dfs(int idx, int h){
    	
        if(idx==n){
			if(h>=b&&ans>(h-b)){
                ans=h-b;
            	return;
            }
            return;
        }
        
        dfs(idx+1, h+tall[idx]);
        dfs(idx+1, h);
    
    
    
    }
    
    
}