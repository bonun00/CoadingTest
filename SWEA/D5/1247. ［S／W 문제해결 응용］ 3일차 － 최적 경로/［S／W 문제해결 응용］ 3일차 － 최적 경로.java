
import java.util.Scanner;


import java.io.FileInputStream;


class Solution
{
	


	static boolean[] visited;
	static int[] start,end;
	static int[][] arr,sel;
	static int n, ans;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			start=new int[2];
			end=new int[2];
			arr=new int[n][2];
			sel=new int[n][2];
			ans=Integer.MAX_VALUE;
			visited=new boolean[n];
			start[0]=sc.nextInt();
			start[1]=sc.nextInt();
			end[0]=sc.nextInt();
			end[1]=sc.nextInt();
	
			for(int i=0; i<n; i++) {
				arr[i][0]=sc.nextInt();
				arr[i][1]=sc.nextInt();
			}

			dfs(0);
			
			System.out.println("#"+test_case+" "+ans);
		}
	}
	static void dfs(int depth) {
		if(n==depth) {
			count();
			return;
		}

		for(int i=0; i<n; i++) {
			if(visited[i])continue;
			visited[i]=true;
			sel[depth][0]=arr[i][0];
			sel[depth][1]=arr[i][1];
			dfs(depth+1);
			visited[i]=false;
			
		}
		
	}
	
	static void count() {
		int temp=0;
		
		for(int i=0; i<n-1; i++){
			int c=Math.abs(sel[i][0]-sel[i+1][0])+Math.abs(sel[i][1]-sel[i+1][1]);
			temp+=c;
		}
		
		int s=Math.abs(sel[0][0]-start[0])+Math.abs(sel[0][1]-start[1]);
		int e=Math.abs(sel[n-1][0]-end[0])+Math.abs(sel[n-1][1]-end[1]);
		ans=Math.min(ans,temp+e+s);
		
	}
	
	
}