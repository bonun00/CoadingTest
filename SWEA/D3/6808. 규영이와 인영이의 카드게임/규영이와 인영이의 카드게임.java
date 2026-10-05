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
    static int[] sel;
    static boolean[] visited;
    static int[] a;
    static int[] b;
    static int[] ans;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
            a=new int[9];
            b=new int[9];
			boolean[] use=new boolean[19];
            for(int i=0; i<9; i++){
            	a[i]=sc.nextInt();
            	use[a[i]]=true;
            }
            
            int idx=0;
            for(int i=1; i<=18; i++){
            	if(use[i])continue;
                b[idx++]=i;
            }
            visited=new boolean[9];
            sel=new int[9];
            ans=new int[2];
            
            per(0);
            
            System.out.println("#"+test_case+" "+ans[0]+" "+ans[1]);
		}
	}
    static void per(int depth){
    	if(depth==9){
        	count();
            return;
        }
        
        for(int i=0; i<9; i++){
            if(visited[i])continue;
            visited[i]=true;
            sel[depth]=b[i];
            per(depth+1);
            visited[i]=false;
        }
        
        
    }
    static void count(){
        int[] temp=new int[2];
    	
        for(int i=0; i<9; i++){
        	if(a[i]>sel[i]){
            	temp[0]+=(a[i]+sel[i]);
            }else{
            	temp[1]+=(a[i]+sel[i]);
            }
        }
        if(temp[0]>temp[1]){
        	ans[0]++;
        }else{
        	ans[1]++;
        }
    }
 
}