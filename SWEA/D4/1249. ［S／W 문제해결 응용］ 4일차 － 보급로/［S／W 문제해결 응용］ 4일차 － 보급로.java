
import java.util.*;
import java.io.*;


class Solution
{
	
	static int[][] move={{1,0},{0,1},{-1,0},{0,-1}};
	
	
	
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=Integer.parseInt(br.readLine());
			
			int[][] arr=new int[n][n];
			int[][] dist=new int[n][n];
			for(int i=0; i<n; i++) {
				String temp=br.readLine();
				for(int j=0; j<n; j++) {
					arr[i][j]=Integer.parseInt(temp.charAt(j)+"");
					dist[i][j]=Integer.MAX_VALUE;

				}

			}
		
	
			boolean[][] visited=new boolean[n][n];
			PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
			pq.add(new int[] {0,0,0});
			visited[0][0]=true;
			while(!pq.isEmpty()) {
				int[] t=pq.poll();

				for(int i=0; i<4;i++) {
					int nx=t[0]+move[i][0];
					int ny=t[1]+move[i][1];
					if(nx<0||ny<0||nx>=n||ny>=n)continue;
					if(visited[nx][ny])continue;
					int c=t[2]+arr[nx][ny];
					if(c<dist[nx][ny]) {
						dist[nx][ny]=c;
						visited[nx][ny]=true;
						pq.add(new int[] {nx,ny,c});
					}
					
				}

			}
			System.out.println("#"+test_case+" "+dist[n-1][n-1]);
		}
	}
	
	
}