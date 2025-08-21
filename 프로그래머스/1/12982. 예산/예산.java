import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = d.length;
        Arrays.sort(d);
        int money=0;
       for(int i =0; i<d.length; i++){
            money+=d[i];
           if(money<=budget){
                
           }else{
               answer=i;
               break;
           }
       }
        
        
        return answer;
    }
}