// class Solution {
//     public int solution(String[] babbling) {
//         int answer = 0;
//         int len=babbling.length;
//         String[] str={"aye","ye","woo","ma"};
//         for(int i=0; i<babbling.length; i++){
//             for(int u=0; u<str.length; u++){
//              if(babbling[i].contains(str[u])){
//                 answer++;
//                 String[] ba =babbling[i].split("");
//                 for(int j=0; j<str[u].split("").length; j++){
//                     if(ba[j]==str[u].split("")[j]){
//                         ba[j]="";
//                     }
//                 }
//                  for(int j=0; j<ba.length; j++){
//                      babbling[i]+=ba[j];
//                  }
                 
//              }
        
//             }
//         }
//         for(int i=0; i<babbling.length; i++){
//             if(babbling[i].equals("")) answer++;
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int len = babbling.length;
        String[] str = {"aya", "ye", "woo", "ma"}; // 오타 수정

        for (int i = 0; i < len; i++) {
            String t = babbling[i];

            // (옹알이2) 같은 음절이 연속으로 나오면 패스
            if (t.matches(".*(aya|ye|woo|ma)\\1.*")) continue;

            // 허용 음절 제거 후 비었는지 확인
            for (String sy : str) {
                t = t.replace(sy, " ");
            }
            t = t.replace(" ", "");

            if (t.isEmpty()) answer++;
        }

        return answer;
    }
}