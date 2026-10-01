

import java.util.*;
import java.io.*;


class Solution
{
	static int n;
	static boolean[] visited;
	static int[][] arr;
	static int ans;
	public static void main(String args[]) throws Exception
	{
		
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			n=Integer.parseInt(br.readLine());
			arr=new int[n][n]; 
			visited=new boolean[n];
			ans=Integer.MAX_VALUE;
			
			for(int i=0; i<n;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				for(int j=0; j<n; j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
				
			}
			dfs(0,0);
			
			
			System.out.println("#"+test_case+" "+ans);
		
		}
	}
	static void dfs(int idx, int depth) {
		if(depth==n/2) {
			ans=Math.min(taste(),ans);
			return;
		}

		for(int i=idx; i<n; i++) {
			if(visited[i])continue;
			visited[i]=true;
			dfs(i+1,depth+1);
			visited[i]=false;
		}
	}
	
	static int taste() {
		int a=0;
		int b=0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(i==j)continue;
				if(visited[i]&&visited[j]){
					a+=arr[i][j];
					a+=arr[j][i];
				}else if(!visited[i]&&!visited[j]) {
					b+=arr[i][j];
					b+=arr[j][i];
				}
			}
		}
		return Math.abs(a-b);

	}
	
}