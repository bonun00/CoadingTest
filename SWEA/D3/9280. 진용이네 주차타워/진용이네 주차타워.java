
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                
		int T;
		T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            
            int[] parkfee=new int [n];
            for(int i=0; i<n; i++){
            	parkfee[i]=Integer.parseInt(br.readLine());
            }
			int[] kg =new int[m];
            
            for(int i=0; i<m; i++){
            	kg[i]=Integer.parseInt(br.readLine());
            }
           
            
           Deque<Integer> wait=new ArrayDeque<>();
            int[] park=new int[n+1];
            int ans=0;
            for(int a=0; a<2*m; a++){
            	int temp=Integer.parseInt(br.readLine());       
         
                if(temp>0){

                    boolean flag=true;
  					for(int i=1; i<=n; i++){
                    	if(park[i]==0){                                                    
                        	park[i]=temp;
                            flag=false;
                            break;
                        }
                    
                    }
                    if(flag) wait.add(temp);
                    
                }else if(temp<0){
                    temp=Math.abs(temp);
                	for(int i=1; i<=n; i++){
                    	if(park[i]==temp){
                        	park[i]=0;
                            ans+=(kg[temp-1]*parkfee[i-1]);
                            break;
                        }
                    }
                    if(wait.size()>0){
                    int w=wait.pop();
                    for(int i=1; i<=n; i++){
                    	if(park[i]==0){
                        	park[i]=w;
                            break;
                        }
                    }
                    }
                    
                }
            }
            
            System.out.println("#"+test_case+" "+ans);

		}
	}
}