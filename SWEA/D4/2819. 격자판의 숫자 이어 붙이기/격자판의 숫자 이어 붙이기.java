
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    
    static int[][] grid;
    static Set<String> ans;
    static int[][] move={{1,0},{0,1},{-1,0},{0,-1}};
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
       
		for(int test_case = 1; test_case <= T; test_case++)
		{
		  	
            grid=new int[4][4];
            ans=new HashSet<>();
            for(int i=0; i<4; i++){
        		for(int j=0; j<4; j++){
                	grid[i][j]=sc.nextInt();
                }
            }
			for(int i=0; i<4; i++){
            	for(int j=0; j<4; j++){
                	dfs(i,j,"");
                }
            }
            System.out.println("#"+test_case+" "+ans.size());
     
		}
	}
    
   public static void dfs(int a, int b,String s){
   		s+=grid[a][b];
		       
    	if(s.length()==7){
         	ans.add(s);
            return;
        }      
       
       for(int i=0; i<4; i++){
       	int ma=a+move[i][0];
           int mb=b+move[i][1];
		  if(ma<0||mb<0||ma>=4||mb>=4) continue;
       		dfs(ma,mb,s);    
       }
   	
   
   }
    
}