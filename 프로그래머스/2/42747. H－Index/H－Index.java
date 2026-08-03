import java.util.*;

class Solution {
    public int solution(int[] citations) {

        
        Arrays.sort(citations);
        int idx=0;
        int answer=citations[idx];
        int temp=citations.length-idx;
        
        while(answer<temp){
            if(citations.length<=idx+1){
                temp=0;
                break;
            }
            idx++;
            answer=citations[idx];
            temp=citations.length-idx;
            
                
        }
        
        
        return temp;
    }
}