
import java.util.*;
import java.io.FileInputStream;


class Solution
{
    static int n;
    static int[] math;
    static int[] num; 
    static int minR;
    static int maxR;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            n=sc.nextInt();
           	math=new int[4];
         	num=new int[n];   
            for(int i=0; i<4; i++){
            	math[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
            	num[i]=sc.nextInt();
            }
            minR=Integer.MAX_VALUE;
			maxR=Integer.MIN_VALUE;
            dfs(1,num[0]);
            
            System.out.println("#"+test_case+" "+(maxR-minR));
        }
	}
    static void dfs(int cnt, int res){
		if(cnt==n){
        	minR=Math.min(res, minR);
            maxR=Math.max(res,maxR);
        	return;
        }
        
        for(int i=0; i<4; i++){
        	if(math[i]<=0)continue;
            
            int r=res;
            switch (i){
                case 0:
                    r+=num[cnt];
                    break;
                case 1:
                    r-=num[cnt];
                    break;
                case 2:
                    r*=num[cnt];
                    break;
                case 3: 
                    r/=num[cnt];
                    break;
            };
            
            math[i]-=1;
            dfs(cnt+1, r);
            math[i]+=1;
        
        }
        
        
    
    
    }
    
}