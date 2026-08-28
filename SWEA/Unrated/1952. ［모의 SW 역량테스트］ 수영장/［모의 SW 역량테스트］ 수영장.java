
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int[] ticket;
    static int[] month;
    static int ans;
    
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
            ticket=new int[4];
            month=new int[12];
            for(int i=0; i<4; i++){
            	ticket[i]=sc.nextInt();
            }
            for(int i=0; i<12; i++){
            	month[i]=sc.nextInt();
            }
            ans=ticket[3]; 
            boolean[] visited=new boolean[12];
            dfs(0,0,visited);
            
            System.out.println("#"+test_case+" "+ans);         
		}
	}
    static void dfs( int cnt, int cost,boolean[] visited){
   
        if(cnt==12){
        	ans=Math.min(ans,cost);
            return;
        }
        
    	if(month[cnt]==0||visited[cnt]){
 			dfs(cnt+1,cost,visited);       
        
        }else{
            for(int i=0; i<3; i++){
               int c=0;
               int end=cnt+3;
               	switch (i){
                    case 0:
                        visited[cnt]=true;
                        c=ticket[i]*month[cnt];
                        break;
                    case 1:
                        visited[cnt]=true;
                        c=ticket[i];
                        break;
                    case 2:
                        c=ticket[i];
                        if(end>12){
                        	end=12;
                        }
                        for(int j=cnt; j<end; j++){
                        	visited[j]=true;
                        }
                        break;
                }
       
        		dfs(cnt+1,cost+c,visited);
                
                switch (i){
                    case 0:
                        visited[cnt]=false;
                        break;
                    case 1:
                       	 visited[cnt]=false;
						break;
                    case 2:
                        for(int j=cnt; j<end; j++){
                        	visited[j]=false;
                        }
                       break;
                }
            }
        }
        
        
    
    
    }
    
    
}