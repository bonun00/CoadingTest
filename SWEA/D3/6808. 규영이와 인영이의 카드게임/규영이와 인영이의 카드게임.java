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
    static int[] ans;
    static boolean[] visited;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[] iy=new int[9];
            int[] gy=new int[9];
            int idx1=0;
            int idx2=0;
            ans=new int[2];
            visited=new boolean[9];
  
            for(int i=0; i<9; i++){
            	gy[i]=sc.nextInt();
            }
            int idx=0;
            for(int i=1; i<=18; i++){
                
                boolean flag=true;
            	for(int j:gy){
                	if(i==j){
                        flag=false;
                    	break;
                    }
                }
                if(flag)iy[idx++]=i;
                
                
               
            }
                dfs(0,9,0,0,iy,gy);
                
                System.out.println("#"+test_case+" "+ans[1]+" "+ans[0]);
		}
	}
   	static void dfs(int cur, int depth,int iyw, int gyw, int[] iy, int[] gy){
    	
        if(cur==depth){
        	if(iyw>gyw){
            	ans[0]++;
            }else{
            	ans[1]++;
            }
        }
        
        for(int i=0; i<9; i++){
        	if(visited[i])continue;
            visited[i]=true;
            if(iy[i]>gy[cur]){
                 dfs(cur+1,depth,iyw+iy[i]+gy[cur],gyw,iy,gy);
            }else{
            	dfs(cur+1,depth,iyw,gyw+iy[i]+gy[cur],iy,gy);
            }
       		visited[i]=false;
        
        }
    
    
    }
    
}