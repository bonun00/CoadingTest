
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    
    static int[] cage;
    static int[] l;
    static int[] r;
    static int[] s;
    static int m;
    static int M;
    static int X;
	static int N;
    static int[] ans;
    public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			N=sc.nextInt();
           	X=sc.nextInt();
            M=sc.nextInt();
            l= new int[M];
            r=new int[M];
            s=new int [M];	
            cage=new int[N];
            ans=new int[N];
            m=Integer.MIN_VALUE;
            for(int i=0; i<M ;i++){
            	l[i]=sc.nextInt();
                r[i]=sc.nextInt();
                s[i]=sc.nextInt();
            }
            dfs(0,0);
            
            
            System.out.print("#"+test_case);
            if(m==Integer.MIN_VALUE){
            	System.out.print(" "+-1);
            }else{
                for(int a:ans){
                    System.out.print(" "+a);
                }
            
            }

           	System.out.println();
		}
	}
    static void dfs(int idx, int max ){
    	if(idx==N){
        	if(check()){
         		if(max>m){
                	m=max;
                	for(int i=0; i<N; i++){
                    	ans[i]=cage[i];
                    }
                }
            }
            return;
        }
        
        for(int i=0; i<=X; i++ ){
            cage[idx]=i;
        	dfs(idx+1, max+i);
        }
    }
    static boolean check(){
    		
   		boolean flag=true;
        for(int j=0; j<M; j++){
            int ans=0;
            for(int i=l[j]-1; i<r[j]; i++){
                ans+=cage[i];
            }
            if(ans!=s[j]){
             	flag=false;
            	break;
            }
        }
      	return flag;
        
    }

}