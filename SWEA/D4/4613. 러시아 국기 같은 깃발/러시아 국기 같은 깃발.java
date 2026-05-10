
import java.util.*;
import java.io.*;

class Solution
{
    static int n;
    static int m;
    static char[][] r;
    static int ans;
    
	public static void main(String args[]) throws Exception
	{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
		int T;
		T=Integer.parseInt(st.nextToken());
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
            st= new StringTokenizer(br.readLine());
            n=Integer.parseInt(st.nextToken());
            m=Integer.parseInt(st.nextToken());

            r= new char[n][m];
            ans=Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                String t=br.readLine();
                r[i]=t.toCharArray();            	    		            

            }
            
            for(int i=1; i<=n-2; i++){
            	for(int j=1; i+j<=n-1; j++){
           			russia(i,j);
                	
                }
            
            }
            System.out.println("#"+test_case+" "+ans);
		}
	}
    static void russia(int a,int b){
        	int cnt=0;
    		for(int i=0; i<n; i++){
                
                if(i<a){
                	cnt+=change('W', i);
                }else if(i<a+b){
                	cnt+=change('B', i);
                }else{
                	cnt+=change('R',i);
                }
                
            	if(cnt>ans)break;
            }
       ans=Math.min(cnt,ans);
    }
    static int change(char c, int a){
        int chan=0;
		for(int i=0; i<m; i++){
        	if(c!=r[a][i]) chan++;			        
        }

        return chan;
    
    }
    
    
}