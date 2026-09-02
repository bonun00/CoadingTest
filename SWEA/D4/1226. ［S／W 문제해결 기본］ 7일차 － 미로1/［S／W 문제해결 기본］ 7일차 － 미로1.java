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

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int t=sc.nextInt();
            int x=0;
             int y=0;
            int[][] miro=new int[16][16];
            for(int i=0; i<16; i++){
                String[] str=sc.next().split("");
            	for(int j=0; j<16; j++){
                	miro[i][j]=Integer.parseInt(str[j]);
                    if(miro[i][j]==2){
                    	x=i;
                        y=j;
                    }
                }
            }
            boolean ans=bfs(x,y,miro);
            System.out.println("#"+t+" "+(ans?1:0));
            
				
		}
	}
    static boolean bfs(int a, int b, int[][] miro){
    	ArrayDeque<int[]> q=new ArrayDeque<>();
        boolean[][] visited=new boolean[16][16];
        int[][] move={{1,0},{0,1},{0,-1},{-1,0}};
        
        q.add(new int[]{a,b});
        visited[a][b]=true;
        while(!q.isEmpty()){
        	int[] t=q.poll();
            if(miro[t[0]][t[1]]==3)return true;
            
            for(int i=0; i<4; i++){
            	int ma=t[0]+move[i][0];
                int mb=t[1]+move[i][1];
                if(ma<0||mb<0||ma>=16||mb>=16)continue;
                if(miro[ma][mb]==1||visited[ma][mb])continue;
                visited[ma][mb]=true;
                q.add(new int[]{ma,mb});
            }	
        
        }
        return false;
        
        
        
    
    
    }
    
}