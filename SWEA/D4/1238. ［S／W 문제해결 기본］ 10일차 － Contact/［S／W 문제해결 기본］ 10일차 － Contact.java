import java.util.*;
import java.io.FileInputStream;

class Solution
{
    static int len;
    static int start;
    static List<Integer>[] node;
    static int ans;
    static boolean[] visited;
    
    
   public static void main(String args[]) throws Exception
   {

      Scanner sc = new Scanner(System.in);

      for(int test_case = 1; test_case <= 10; test_case++)
      {
         len=sc.nextInt();
            start=sc.nextInt();
            node=new ArrayList[101];
            for(int i=0; i<101; i++){
               node[i]=new ArrayList<>();
            }
            for(int i=0; i<len/2; i++){
               int a=sc.nextInt();
                int b=sc.nextInt();
                node[a].add(b);
         
            }
            
            visited=new boolean[101];
            ans=0;
           bfs(start);
            System.out.println("#"+test_case+" "+ans);

      }
   }
    static void bfs(int s){
       
        Deque<Integer> q=new ArrayDeque<>();
        visited[s]=true;
        q.add(s);

        while(!q.isEmpty()){
            int max=0;
            int st=q.size();
            for(int i=0; i<st; i++){
                int cur=q.poll();
                
                if(max<cur)max=cur;
                    
               for(int n: node[cur]){
               	if(visited[n])continue;
                visited[n]=true;             
                q.add(n);
               }
            }
            ans=max;
        
        }
        
    
    
    }
    
    
}