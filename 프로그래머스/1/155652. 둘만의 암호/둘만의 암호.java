// class Solution {
//     public String solution(String s, String skip, int index) {
//         String answer = "";
      
//         for(int i=0; i<s.length; i++){
//             int idx=1;
//             int ch=(int) s.charAt(i);
//             if(index>idx){
//                 for(int u=0; u<skip.length; u++){
//                     int ch2=(int)skip.charAt(u);
//                     if(ch!=ch2){
//                         idx++;
//                         ch++;
//                     };
//                 }    
            
//             }
//             answer+=(char)ch;
                
//         }
        
//         return answer;
        
//     }
// }

import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> banned = new HashSet<>();
        for (int i = 0; i < skip.length(); i++) {
            banned.add(skip.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int moved = 0;
            while (moved < index) {
     
                c = (char) (c + 1);
                if (c > 'z') c = 'a';
             
                if (!banned.contains(c)) {
                    moved++;
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }
}