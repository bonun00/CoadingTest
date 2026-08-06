import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<int[]> q=new ArrayDeque<>();       
        int time=0;
        int bl=bridge_length;
        int w=0;
        int idx=0;
        while(true){
            
            if(!q.isEmpty()&&q.peek()[0]==time){
                w-=q.poll()[1];
            }
            
            if(idx<truck_weights.length){
                int tw=truck_weights[idx];
               if(w+tw<=weight){
                w+=tw;
                idx++;
                q.add(new int[]{time+bl,tw});
                
                
                if(idx==truck_weights.length){
                   time+=bl+1;
                    break;
                }
            }
            }
            
            time++;


        }
        
    
    
        return time;
    }
}



 