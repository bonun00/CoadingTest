
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	


	static boolean[] visited;
	static int[] sel;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
			int r=sc.nextInt();
			
			
			visited=new boolean[n+1];
			sel=new int[r];  
			System.out.println("#"+test_case);
		
			dfs(0, n, r);

		}
	}
	static void dfs(int depth,int n, int r) {
			if(depth==r){
				StringBuilder sb=new StringBuilder();
				
				
				for(int i=0; i<r; i++)sb.append(sel[i]).append(" ");
				System.out.println(sb);
				return;
			}
			
			
			for(int i=1; i<=n; i++) {
				if(visited[i])continue;
				visited[i]=true;
				sel[depth]=i;
				dfs(depth+1,n,r);
				visited[i]=false;
				
			}
		
	}
	
}