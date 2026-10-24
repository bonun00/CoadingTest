import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 1;
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }else{
                return a[1]-b[1];
            }
        });
         
        int len=book_time.length;
        for(int i=0; i<len; i++){
            int[] a=new int[2];
            for(int j=0; j<2; j++){
                String[] t=book_time[i][j].split(":");
                
                a[j]=Integer.parseInt(t[0])*60+Integer.parseInt(t[1]);
              
            }
            a[1]+=10;
            pq.add(a); 
        }
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(int i=0; i<len; i++){
           int[] cur=pq.poll();
               
            while(!q.isEmpty()&& cur[0]>=q.peek()[1]){

                q.poll();
            }
            
            q.add(cur);
            answer=Math.max(answer,q.size());
            
        }
        
        
        
        
        
        return answer;
    }
}