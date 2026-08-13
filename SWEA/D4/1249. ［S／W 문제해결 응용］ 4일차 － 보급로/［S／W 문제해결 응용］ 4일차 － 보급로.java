
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
			int n=Integer.parseInt(br.readLine());
            int[][] route=new int[n][n];
            for(int i=0; i<n; i++){
            	String temp=br.readLine();
                for(int j=0; j<n; j++){
                	route[i][j]=temp.charAt(j)-'0';
                }
            }
            int[][] move={{1,0},{0,1},{-1,0},{0,-1}};
            PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            	return Integer.compare(a[2],b[2]);
            });
            int[][] dist=new int[n][n];
            pq.add(new int[]{0,0,0});
            
            for(int i=0; i<n; i++){
                Arrays.fill(dist[i], Integer.MAX_VALUE);
            }
        
            
            
            while(!pq.isEmpty()){
            	int[] t=pq.poll();
       
                for(int i=0; i<4; i++){
                	int mx=t[0]+move[i][0];
                    int my=t[1]+move[i][1];
                	if(mx<0||my<0||mx>=n||my>=n)continue;
                    if(dist[mx][my]<t[2])continue;
                    if(t[2]+route[mx][my]>=dist[mx][my])continue;
                    dist[mx][my]=t[2]+route[mx][my];
                    pq.add(new int[]{mx,my,t[2]+route[mx][my]});
                }
            }
            
            System.out.println("#"+test_case+" "+dist[n-1][n-1]);
            
            
		}
	}
}