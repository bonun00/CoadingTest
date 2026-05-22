
import java.util.*;
import java.io.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int[][] sdoku;
	public static void main(String args[]) throws Exception
	{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
		int T;
		T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sdoku=new int[10][10];
            boolean[][] x=new boolean[10][10];
            boolean[][] y=new boolean[10][10];
            int ans=1;
            
            for(int i=0; i<9; i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
            	for(int j=0; j<9; j++){
                	sdoku[i][j]=Integer.parseInt(st.nextToken());                
  					if(!x[i][sdoku[i][j]]){
                    	x[i][sdoku[i][j]]=true;
                    }else{
                   		ans=0;
                    }
                    if(!y[j][sdoku[i][j]]){
                    	y[j][sdoku[i][j]]=true;
                    }else{
                   		ans=0;
                    }
                }
            }
            for(int i=0; i<9; i+=3){
                if(ans==0)break;
            	for(int j=0; j<9; j+=3){
                	if(!game(i,j)){
                    	ans=0;
                        break;
                    }
                }
                if(ans==0)break;
            }
			System.out.println("#"+test_case+" "+ans);
            
            
            

		}
	}
    static boolean game(int a, int b){
			
        	boolean flag=true;
        	boolean[] z=new boolean[10];
        
    		for(int i=a; i<a+3; i++){
            	for(int j=b; j<b+3; j++){
                	if(!z[sdoku[i][j]]){
                    	z[sdoku[i][j]]=true;
                    }else{
                        flag=false;
                        break;
                    }
                }
                if(!flag)break;
            }
        return flag;
    }
}