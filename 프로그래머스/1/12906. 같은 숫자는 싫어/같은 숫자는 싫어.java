import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
   
        Deque<Integer>q=new ArrayDeque<>();
            
        
        for(int a: arr){
            if(q.isEmpty()){
                q.add(a);
            }else{
                if(q.peekLast()!=a){
                    q.add(a);
                }
            }
        }
        int[] answer =new int[q.size()];
        for(int i=0;i<answer.length; i++){
            answer[i]=q.poll();
            
        }
        

        return answer;
    }
}