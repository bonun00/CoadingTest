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
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    
    static int[][] cook;
    static int n;
    static int ans;
    static boolean[] visited;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            n=sc.nextInt();
            cook=new int[n][n];
            ans=Integer.MAX_VALUE;
            visited=new boolean[n];
           	for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
            		cook[i][j]=sc.nextInt();
                }
            }
            
            dfs(0,0);
       
         
            System.out.println("#"+test_case+" "+ans);

		}
	}
    static void taste(){
			int a=0;
            int b=0;
			for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
            		if(i==j)continue;
                    
                   if(visited[i]&&visited[j]){
                   		a+=cook[i][j];
                   }
                   else if(!visited[i]&&!visited[j]){
                   		b+=cook[i][j];
                   }
                    
                }
            }
        ans=Math.min(Math.abs(a-b),ans);
        
    
    }
    static void dfs(int idx, int cnt){
    	if(cnt==n/2){
        	taste();
            return;
        };
        
        
        for(int i=idx; i<n; i++){
        	if(visited[i])continue;
            visited[i]=true;
            dfs(i+1, cnt+1);
            visited[i]=false;
        
        }
        
    
    }
}