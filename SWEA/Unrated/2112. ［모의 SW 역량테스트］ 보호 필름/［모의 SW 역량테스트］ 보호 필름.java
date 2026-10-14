
import java.util.*;
import java.io.*;

class Solution
{

	static int d,w,k,ans;
	static int [][] f;
	static int[] sel;
	
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			StringTokenizer st= new StringTokenizer(br.readLine());
			d=Integer.parseInt(st.nextToken());
			w=Integer.parseInt(st.nextToken());
			k=Integer.parseInt(st.nextToken());
			ans=Integer.MAX_VALUE;
			sel=new int[d];
			Arrays.fill(sel, -1);
			f=new int[d][w];
			for(int i=0; i<d; i++) {
				st= new StringTokenizer(br.readLine());
				for(int j=0; j<w; j++) {
					f[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			
			
			dfs(0,0);
		
			
			System.out.println("#"+test_case+" "+ans);
		}

	}
	static void dfs(int depth, int cnt) {
		if(ans<=cnt)return;
		if(depth==d) {
			if(test()){
				ans=Math.min(ans, cnt);
			}
			return;
		}
		
		dfs(depth+1,cnt);
		
		sel[depth]=1;
		dfs(depth+1,cnt+1);
		sel[depth]=-1;
		
		sel[depth]=0;
		dfs(depth+1,cnt+1);
		sel[depth]=-1;
	}
	

	static boolean test() {
	
		int[][] temp=new int[d][w];
		
		for(int i=0; i<d; i++) {
			temp[i]=Arrays.copyOf(f[i],f[i].length);
		}

		for(int i=0; i<d; i++) {
			if(sel[i]==-1)continue;
			Arrays.fill(temp[i], sel[i]);
		}
		
		
		for(int i=0; i<w; i++) {
		
			boolean flag=false;
			for(int j=k-1; j<d; j++){
				int cnt=0;
				for(int u=j; u>j-k; u--) {
					if(temp[u][i]==1)cnt++;
				}
				if(cnt==k||cnt==0)flag=true;
			} 
			if(!flag)return false;
		
		}
		return true;
	}
	
}


		
	


