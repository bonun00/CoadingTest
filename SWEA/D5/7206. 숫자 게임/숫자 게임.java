
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int[] memo;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
     	memo=new int[100000];
 		Arrays.fill(memo,-1);           
		for(int test_case = 1; test_case <= T; test_case++)
		{
       
            
			String n= sc.next();
       
            System.out.println("#"+test_case+" "+num(n));
		}
	}
    
    static int num(String str){
   
        int ans=-1; 
        int len=str.length();
        if(len==1)return 0;
        
        if(memo[Integer.parseInt(str)]!=-1)return memo[Integer.parseInt(str)];
        for(int i=1; i<(1<<len-1); i++){
    		int start=0;
            int temp=1;
            for(int j=0; j<len-1; j++){
            	if((i&(1<<j))!=0){
                	temp*=Integer.parseInt(str.substring(start,j+1));
                    start=j+1;
                }
            }
            temp*=Integer.parseInt(str.substring(start));
            ans=Math.max(ans,1+num(temp+""));
            
        }
        
        return memo[Integer.parseInt(str)]=ans;
    
    }
}