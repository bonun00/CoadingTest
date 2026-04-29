
import java.util.Scanner;
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
            int[] stops= new int [5001];
              
            for(int i=0; i<n; i++){
            	int a=sc.nextInt();
                int b=sc.nextInt();
                	for(int u=a; u<=b; u++)stops[u]++;
            }
            
            int p=sc.nextInt();

            System.out.print("#"+test_case);
			for(int i=0; i<p; i++){
            	System.out.print(" "+stops[sc.nextInt()]);
            }
            System.out.println();
		}
	}
}