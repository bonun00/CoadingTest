import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer ="";
        Map<String, Integer> map =new HashMap<>();
        for(String p : participant){
            map.put(p,map.getOrDefault(p,0)+1);
        }

        for(String c : completion){
            map.put(c ,map.getOrDefault(c,0)-1);
        }
        
        for(String k :map.keySet()){
            if(map.get(k)==1){
                answer=k;
            }
        }
        
        return answer;
    }
}
        
        
        
        
        
        
        // String answer = "";
//         List<String> list =new ArrayList<>();
//             for(String c: completion){
//                     list.add(c);
//             }
//             for(int i=0; i<participant.length; i++){
//                 if (list.contains(participant[i])) {
//                     list.remove(participant[i]); 
//                 } else {
//                     answer = participant[i];     
//                 }
          
//         }
        
//         return answer;
//     }
// }