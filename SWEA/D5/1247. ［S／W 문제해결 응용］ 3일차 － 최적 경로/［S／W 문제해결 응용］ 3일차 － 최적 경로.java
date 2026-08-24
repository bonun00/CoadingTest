/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    
    static int[] home;
    static int[] com;
    static int[][] cus;
    static int ans;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
            home=new int[2];
            com=new int[2];
            home[0]=sc.nextInt();
          	home[1]=sc.nextInt();
            com[0]=sc.nextInt();
			com[1]=sc.nextInt();
            cus=new int[n][2];
            for(int i=0; i<n; i++){
   				cus[i][0]=sc.nextInt();
                cus[i][1]=sc.nextInt();
            }
            boolean[] visited=new boolean[n];
            ans=Integer.MAX_VALUE;
            dfs(com,0,0,n,visited);
           System.out.println("#"+test_case+" "+ans);
		}
	}
    
    static void dfs(int[] now, int d, int depth, int n, boolean[] v){
    		if(depth==n){	
                int hd=d+Math.abs(now[0]-home[0])+Math.abs(now[1]-home[1]);
                ans=Math.min(ans,hd);
                return;
           }; 
    
    	   for(int i=0; i<n; i++){
           		if(v[i])continue;
                int td=d+Math.abs(now[0]-cus[i][0])+Math.abs(now[1]-cus[i][1]);
               if(ans<=td)continue;
               v[i]=true;
                dfs(cus[i],td,depth+1, n,v);
           		v[i]=false;
           }
   }
    
}