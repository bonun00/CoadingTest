
import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static String[] pass;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			
            pass= sc.next().split("");
            
            Deque<Integer> q=new ArrayDeque<>();
            q.add(Integer.parseInt(pass[0]));
            
            for(int i=1; i<T; i++){
              
                if(!q.isEmpty()&&q.peekLast()==Integer.parseInt(pass[i])){
                	q.pollLast();
                }else{
                 	q.add(Integer.parseInt(pass[i]));
                 }
               
            }

    
            System.out.print("#"+test_case+" ");
            
            while(!q.isEmpty()){
            	System.out.print(q.poll());
            }
            System.out.println();
            
		}
	}

    
    
}