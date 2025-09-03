import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String,Integer> map= new HashMap<>();
        for(int i=0; i<name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        for(int i =0; i<photo.length; i++){
            for(int u =0; u<photo[i].length; u++){
                answer[i]+= map.getOrDefault(photo[i][u],0);
                    
            }
        }
        
        return answer;
    }
}