
import java.util.*;
import java.io.*;

class Solution
{
    static boolean[] visited;
    static int[] iy;
    static int[] gy;
    static int[] ans;
    
	public static void main(String args[]) throws Exception
	{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
            
		int T;
		T=Integer.parseInt(st.nextToken());


		for(int test_case = 1; test_case <= T; test_case++)
		{
            st= new StringTokenizer(br.readLine());
			iy=new int[9];
            gy=new int[9];
            visited=new boolean[19];
            int[] output=new int[19];
            ans=new int[2];
            for(int i=0; i<9; i++){
            	iy[i]=Integer.parseInt(st.nextToken());
            }
            int idx=0;
            for(int j=1; j<=18; j++){
                boolean flag=true;
                 for(int i: iy){
            		if(i==j){
                    	flag=false;
                        break;
                    }	
            	}
                if(flag)gy[idx++]=j;
            }
			dfs(0,output);
            
            System.out.println("#"+test_case+" "+ans[1]+" "+ans[0]);
		}
	}
     static void dfs(int depth, int[] out){
         		if(depth==9){
                    int iyN=0;
                    int gyN=0;
                	for(int i=0; i<9; i++ ){
                    	if(iy[i]<out[i]){
                        	gyN+=(iy[i]+out[i]);
                        }else if(iy[i]>out[i]){
 							iyN+=(iy[i]+out[i]);
                        }
               
                   
                }
                    
                    if(gyN>iyN){
                    	ans[0]++;
                    }else if(gyN<iyN){
                    	ans[1]++;
                    }
                    return;
         
                }
            	for(int i=0; i<gy.length; i++){
                    if(visited[i])continue;
                	visited[i]=true;
                    out[depth]=gy[i];
                    dfs(depth+1,out);
					visited[i]=false;                        
                        
                }
             
            
            }
}