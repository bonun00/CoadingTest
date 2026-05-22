
import java.util.*;
import java.io.*;

class Solution
{
    
    static int[][] fly;
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            fly=new int[N][N];
            int ans=0;
            for(int i=0; i<N; i++){
                st=new StringTokenizer(br.readLine());
            	for(int j=0; j<N; j++){
                	fly[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            
            for(int i=0; i<N-M+1; i++){
            	for(int j=0; j<N-M+1; j++){
                     ans=Math.max(ans, hold(i,j,M));
                }
            }
            
            System.out.println("#"+test_case+" "+ans);
		}
        
        
        
	}
    
    static int hold(int a,int b, int m){
        int res=0;
        
        for(int i=a; i<a+m; i++){
            	for(int j=b; j<b+m; j++){
                     res+=fly[i][j];
                }
         }
    	return res;
    
    }
    
    
}