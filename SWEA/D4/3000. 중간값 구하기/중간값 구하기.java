
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
		
            
            PriorityQueue<Integer> max= new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> min =new PriorityQueue<>();

            max.add(Integer.parseInt(st.nextToken()));
            long ans=0;
            for(int i=1; i<=n; i++){
                st=new StringTokenizer(br.readLine());
            	max.add(Integer.parseInt(st.nextToken()));
                min.add(Integer.parseInt(st.nextToken()));
 
                if(!max.isEmpty()&&!min.isEmpty()&&max.peek()>min.peek()){
                	int t1=max.poll();
                    int t2=min.poll();
                	max.add(t2);
                    min.add(t1);
                }
                ans=(ans+max.peek())%20171109;
            }
            System.out.println("#"+test_case+" "+ans);
		}
	}
}