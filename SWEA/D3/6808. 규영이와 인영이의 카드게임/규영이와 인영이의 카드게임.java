
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	
	static int[] a;
	static int[] b;
	static int[] ans; 
	static boolean[] visited;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			a=new int[10];
			b=new int[9];
			ans=new int[2];
			visited=new boolean[9];
			for(int i=0; i<9; i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a,0,9);
			int idx=0;
			int idx2=0;
			for(int i=1; i<=18; i++) {
				if(a[idx]==i) {
					idx++;
				}else {
					b[idx2++]=i;
				}
			}
			//for(int i=0; i<9; i++)System.out.println(a[i]+" "+b[i]);
		
			dfs(0,9,0,0);
			System.out.println("#"+test_case+" "+ans[0]+" "+ans[1]);
			
		}
	}
	
	static void dfs(int start, int depth, int aWin, int bWin ) {
		
		if(start==depth) {
			if(aWin>bWin) {
				ans[0]++;
			}else {
				ans[1]++;
			}	
		}
		
		for(int i=0; i<9; i++) {
			if(visited[i])continue;
			visited[i]=true;
			if(a[i]>b[start]) {
				dfs(start+1,depth,aWin+a[i]+b[start],bWin);
				
			}else {
				dfs(start+1,depth,aWin,bWin+a[i]+b[start]);
			}
			visited[i]=false;
			
			
			
		}
	}
}