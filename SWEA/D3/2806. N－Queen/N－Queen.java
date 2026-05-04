
import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
    static int n;
    static int[] chess;
    static int ans;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt(); 
            chess=new int[n];
            ans=0;
            dfs(0);
            System.out.println("#"+test_case+" "+ans);
            
		}
	}
    static void dfs(int row){
		if(row==n){
        	ans++;
            return;
        }
     	for(int i=0; i<n; i++){
           if(possible(row, i)){
           		chess[row]=i;
           		dfs(row+1);
           }
       }
        
    	
    
    }
    static boolean possible(int r, int c){
        for(int i=0; i<r; i++){
        	if(chess[i]==c||Math.abs(r-i)==Math.abs(chess[i]-c)) return false;
        }
    	return true;
    
    }
    
    
}