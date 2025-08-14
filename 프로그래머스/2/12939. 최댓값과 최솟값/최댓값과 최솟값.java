import java.util.*;
class Solution {
    public String solution(String s) {
  
        int[] num =Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(num);
    
        String answer=num[0]+" "+num[num.length-1];
        
        return answer;
    }
}