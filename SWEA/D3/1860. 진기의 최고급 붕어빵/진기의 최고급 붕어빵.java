import java.util.*;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		 int n=sc.nextInt();
         int m=sc.nextInt();
         int k=sc.nextInt();
         int[] custom=new int[n];
          for(int i=0; i<n; i++){
          	custom[i]=sc.nextInt();             
          }  
         boolean ans =true; 
           int bread=0;
            Arrays.sort(custom);
          for(int i=0; i<n; i++){
 			int c=custom[i];	
       
              if(c/m*k <i+1){
              ans=false;
              }
              
            }
                   
           System.out.println("#"+test_case+" "+(ans ? "Possible" : "Impossible"));
            
            
         
		}
	}
}
                   