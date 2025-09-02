import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer=new int[score.length];
        for(int i=0; i<score.length; i++){
            if(list.size()<k){
                list.add(score[i]);
                Collections.sort(list,Collections.reverseOrder());
                answer[i]=list.get(i);
            }else{
                list.add(score[i]);
                Collections.sort(list,Collections.reverseOrder());
                answer[i]=list.get(k-1);
            }
        }
        
        return answer;
    }
    
}