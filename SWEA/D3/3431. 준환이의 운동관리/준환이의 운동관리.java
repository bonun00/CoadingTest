
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
			int L=sc.nextInt();
            int U=sc.nextInt();
            int V= sc.nextInt();
            int ans=0;
            if(U<V){
                ans=-1;
            }
            if(V<L){
            ans=L-V;
            }
            
			System.out.println("#"+test_case+" "+ans);
		}
	}
}