import java.util.*;

class Solution {
    public String solution(String number, int k) {

        
        char[] n=number.toCharArray();
        int idx=0;
    
        Deque<Character> q=new ArrayDeque<>();
        for(int i=0; i<number.length(); i++){
           
            while(idx<k&&!q.isEmpty()&&q.peekLast()<n[i]){
                q.pollLast();
              
                idx++;
            } 
            
            q.add(n[i]);
          
            
        }
        String answer="";
        for(int i=0; i<n.length-k; i++){
            answer+=q.poll();
        }
        
        
        
        
        return answer;
    }
}