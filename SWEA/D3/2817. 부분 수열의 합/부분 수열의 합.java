
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	
	static int ans;
	static int[] arr;
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
			int k=sc.nextInt();
			ans=0;
			arr=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
				
			}
			dfs(0, 0, n, k);
			
			System.out.println("#"+test_case+" "+ans);
		


		}
	}
	static void dfs(int depth,int cnt,int n,int k) {
		if(depth==n) {
			if(cnt==k)ans++;
			return;
		}
		
		
		dfs(depth+1,cnt+arr[depth],n,k);
		dfs(depth+1,cnt,n,k);
		
	}
	
}