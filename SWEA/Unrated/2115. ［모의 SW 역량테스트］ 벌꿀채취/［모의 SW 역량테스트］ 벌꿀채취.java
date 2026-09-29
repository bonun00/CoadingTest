

import java.util.*;
import java.io.*;


class Solution
{
	
	static int n;
	static int m;
	static int c;
	static int[][] bee;
	static int ans; 
	static boolean[][] visited;
	static boolean[] visited2;
	static int best;
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			
			n=Integer.parseInt(st.nextToken());
			 m=Integer.parseInt(st.nextToken());
			c=Integer.parseInt(st.nextToken());
			visited=new boolean[n][n];
			ans=0;
			bee=new int[n][n];
			for(int i=0; i<n; i++){
				st=new StringTokenizer(br.readLine());
				for(int j=0; j<n; j++) {
					bee[i][j]=Integer.parseInt(st.nextToken());
				}
				
			}
	
			dfs(0,new int[m*2]);
		
			System.out.println("#"+test_case+" "+ans);
		
		}
	}
	static void dfs(int depth, int[] temp) {
		if(depth==2) {
			visited2=new boolean[m*2];
			int b=0;
			best=0;
			dfs2(0,0,0,0,m,temp);
			b+=best;
			best=0;
			dfs2(0,0,0,m,m*2,temp);
			b+=best;
			ans=Math.max(ans, b);
			
			return;
		}
		
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n-m+1; j++) {
				boolean flag=true;
				for(int k=j; k<m+j; k++) {
					if(visited[i][k]) {
						flag=false;
					}
				}
				
				
				if(!flag)continue;
				for(int k=j; k<m+j; k++) {
					visited[i][k]=true;
					temp[depth*m+(k-j)]=bee[i][k];
				}
				dfs(depth+1,temp);
				for(int k=j; k<m+j; k++) {
					visited[i][k]=false;
				}
			
			
			}
			
			
		}
	
	}
	
	static void dfs2(int depth, int cnt,int cnt2, int a, int b,int[] temp) {
		if(cnt<=c) {
			best=Math.max(best,cnt2);
		}
		if(depth==m) {
			return;
		};
		
		for(int i=a; i<b; i++) {
			if(visited2[i])continue;
			visited2[i]=true;
			dfs2(depth+1,cnt+temp[i],cnt2+temp[i]*temp[i] ,a,b,temp);
			visited2[i]=false;
			
		}
		
		
	}
	


}