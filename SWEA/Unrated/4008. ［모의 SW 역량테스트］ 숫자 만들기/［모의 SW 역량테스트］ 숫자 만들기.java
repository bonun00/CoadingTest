

import java.util.*;
import java.io.*;


class Solution
{

	
	static int[] ans;
	static int n;
	static int[] arr;
	static int[] num;
	public static void main(String args[]) throws Exception
	{
		
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			n=Integer.parseInt(br.readLine());
			arr=new int[4];
			num=new int[n];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=0; i<4;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			st=new StringTokenizer(br.readLine());
			
			for(int i=0; i<n; i++) {
				num[i]=Integer.parseInt(st.nextToken());
			}
			
			
			ans=new int[2];
			ans[0]=Integer.MAX_VALUE;
			ans[1]=Integer.MIN_VALUE;
			dfs(1,num[0]);

			System.out.println("#"+test_case+" "+(ans[1]-ans[0]));
		
		}
	}
	
	
	static void dfs(int depth, int cnt) {
	
		if(depth==n) {
		
			ans[0]=Math.min(cnt, ans[0]);
			ans[1]=Math.max(cnt, ans[1]);

			return;
			
		}
	
		for(int i=0; i<4;i++) {
			if(arr[i]>0) {
				
				arr[i]-=1;
				
				dfs(depth+1, math(cnt,depth,i));
				
				arr[i]+=1;
				
			}
		}

		
		
	}
	
	static int math(int cnt,int depth,int sign) {

		if(sign==0) {
			return cnt+num[depth];
		}else if(sign==1) {
			return cnt-num[depth];
		}else if(sign==2) {
			return cnt*num[depth];
		}else {
			return cnt/num[depth];
		}
	}
}