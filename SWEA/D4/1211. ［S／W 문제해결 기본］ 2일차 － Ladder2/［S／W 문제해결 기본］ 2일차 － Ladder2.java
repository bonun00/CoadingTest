
import java.util.*;
import java.io.*;

class Solution
{
    
    static int[][] ladder;
    
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int t=Integer.parseInt(br.readLine());
            ladder=new int[100][100];
			for(int i=0; i<100; i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
            	for(int j=0; j<100; j++){
                	ladder[i][j]=Integer.parseInt(st.nextToken());
           
                }
            }
            int max=Integer.MAX_VALUE;
           	int ans=0;
            for(int i=0; i<100; i++){
            	if(ladder[0][i]==1){
                    int temp=bfs(0,i);
                	if(max>temp){
                    	max=temp;
                        ans=i;
                    }
                }
            }
		
        	System.out.println("#"+test_case+" "+ ans);
        }
        
	}
    
    static int bfs(int a, int b){
        boolean[][] visited=new boolean[100][100];
        Queue<int[]>q=new ArrayDeque<>();
        visited[a][b]=true;
        q.add(new int[]{a,b});
        int res=1;
        int[][] m={{0,1},{0,-1}};
    	while(!q.isEmpty()){
            int[] temp=q.poll();
            if(temp[0]+1==100)return res;
            for(int i=0; i<2; i++){
            	int mx=temp[0]+m[i][0];
                int my=temp[1]+m[i][1];
				if(mx<0||my<0||mx>=100||my>=100)continue;
   				if(visited[mx][my]||ladder[mx][my]==0)continue;
            	visited[mx][my]=true;
 				res+=1;
                q.add(new int[]{mx,my});
            }
    		if(temp[0]+1<100&&ladder[temp[0]+1][temp[1]]==1&&q.isEmpty()){		             
            	visited[temp[0]+1][temp[1]]=true;
                res+=1;
                q.add(new int[]{temp[0]+1,temp[1]});
            }
        }
           return res;
    }
    
}