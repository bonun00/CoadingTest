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
// char g = &apos;b&apos;;
// String var = &quot;ABCDEFG&quot;;
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
    
    static char[][] miro;
    static int ans;
    static boolean[][] visited;
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
	
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            	T=sc.nextInt();
         	int x=0;
            int y=0;
 			ans=0;
            miro=new char[100][100];
            visited=new boolean[100][100];
			for(int i=0; i<100; i++){
				miro[i]=sc.next().toCharArray();
                
              for(int j=0; j<100; j++){
              	if(miro[i][j]=='2'){
                	x=i;
                    y=j;
                }
              }
            }
            
            bfs(x,y);
			System.out.println("#"+test_case+" "+ans);
		}
	}
    public static void bfs(int a, int b){
    
    	Queue<int[]> q=new ArrayDeque<>();
        q.add(new int[]{a,b});
        int[][] move={{1,0},{0,1},{-1,0},{0,-1}};
              
        while(!q.isEmpty()){
        	int[] temp=q.poll();
            if(visited[temp[0]][temp[1]]||miro[temp[0]][temp[1]]=='1' )continue;
			visited[temp[0]][temp[1]]=true;
        	if(miro[temp[0]][temp[1]]=='3'){
            	ans=1; 
                break;
            }    
            for(int i=0; i<4; i++){
            	int ma=temp[0]+move[i][0];
             	int mb=temp[1]+move[i][1];
				
                if(ma<0||mb<0||ma>=100||mb>=100) continue;
                
                q.add(new int[]{ma, mb});
            
            
            }
        
        }
        
        
        
        
    
    
    }
    
    
    
}