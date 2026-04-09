import java.util.*;

class Solution {
    
    
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++){
            q.add(scoville[i]);
        }
        
        while(q.peek()<K){
            int scov1=q.poll();
            int scov2=q.poll();
            
            q.add(scov1+(scov2*2));
            answer++;
            if(q.size()==1&&q.peek()<K){
                answer=-1;
                break;
            }
            
        }
        
        return answer;
    }
}