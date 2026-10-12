
import java.util.*;

import java.io.*;


class Solution
{
	
	static int[][] move={{1,0},{0,1},{-1,0},{0,-1}};
	
	static int ans;
	
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
			int[][] h=new int[n][n]; 
			for(int i=0; i<n;i++) {
				st=new StringTokenizer(br.readLine());
				for(int j=0; j<n; j++) {
					h[i][j]=Integer.parseInt(st.nextToken());				
				}
			}
			
			ans=0;
		
			for(int i=0; i<n;i++) {
				for(int j=0; j<n; j++) {
					bfs(i, j, n, m, h);

				}
			}
			
			
			System.out.println("#"+test_case+" "+ans);
		}
		
		
	}
	
	static void bfs(int a,int b ,int n, int m, int[][]h) {
		
		Queue<int[]> q=new ArrayDeque<>(); 
		boolean[][] visited=new boolean[n][n];
		int[] hCnt=new int[n*2+1];
		q.add(new int[] {a, b,1});

		if(h[a][b]==1)hCnt[1]+=1;
		
		visited[a][b]=true;
		while(!q.isEmpty()) {
			int[] t=q.poll();
			
			int x=t[0];
			int y=t[1];
			for(int j=0; j<4; j++) {
				int nx=x+move[j][0];
				int ny=y+move[j][1];
				if(nx<0||ny<0||nx>=n||ny>=n)continue;
				if(visited[nx][ny])continue;
				if(h[nx][ny]==1)hCnt[t[2]+1]++;
				visited[nx][ny]=true;
				q.add(new int[] {nx,ny,t[2]+1});
			}
		}
		int cnt=0;
		
		for(int k=1; k<hCnt.length; k++) {
			cnt+=hCnt[k];
			int cost=k*k+(k-1)*(k-1);
			if(0<=m*cnt -cost) {
				
				ans= Math.max(ans, cnt);
			}
		}
	
		
		

		
		
		
		
	}
	
	
}