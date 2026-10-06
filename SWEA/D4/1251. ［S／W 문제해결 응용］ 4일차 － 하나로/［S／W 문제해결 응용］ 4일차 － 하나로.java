import java.io.FileInputStream;
import java.util.*;


class Solution
{
	
	static class Edge implements Comparable<Edge>{
		int from;
		int to;
		long cost;
		
		public Edge(int from, int to, Long cost) {
			this.from=from;
			this.to=to;
			this.cost=cost;
		}
		
		@Override
		public int  compareTo(Edge o) {
			return Long.compare(this.cost, o.cost);
		}
	}
	static int[] p;

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
			
			Edge[] g=new Edge[n*(n-1)/2];
			int[] x=new int[n];
			int[] y=new int[n];
			p=new int[n];
			for(int i=0; i<n;i++)p[i]=i;
			for(int i=0; i<n; i++) {
				x[i]=sc.nextInt();
				
			}
			for(int i=0; i<n; i++) {
				y[i]=sc.nextInt();
				
			}
			double e=sc.nextDouble();
			int idx=0;
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					long a=x[i]-x[j];
					long b=y[i]-y[j];
					long c=a*a+b*b;
					
					g[idx++]=new Edge(i, j, c);
					
				}
				
			}
			Arrays.sort(g);
			Long sum=0L;
			for(Edge gg:g) {
				if(union(gg.to,gg.from)){
					sum+=gg.cost;
				}
			}
			System.out.println("#" + test_case + " "+Math.round(sum*e));
		}
	}

	static boolean union(int a, int b) {
		if ( find(a) ==find(b)) return false;
		p[find(b)] = find(a);
		return true;
	}
	static int find(int a) {
		if(p[a]==a) {
			return a;
		}else {
			return p[a]=find(p[a]);
		}
		
	}
}