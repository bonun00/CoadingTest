// import java.util.*;

// class Solution {
//     public int solution(String message, int[][] spoiler_ranges) {
//         int answer = 0;
//         String [] str=message.split("");
   
//         Set<String> s=new HashSet();
//         List<String> ss= new ArrayList();
//         boolean spo=false;
//         int idx=0;
        
//         String temp="";
        
//         for(int i=0; i<str.length; i++){
            
            
//              while(idx<spoiler_ranges.length&&spoiler_ranges[idx][1]<i){
//                 idx+=1;
//             }
            
//           if(idx < spoiler_ranges.length &&
//                spoiler_ranges[idx][0] <= i &&
//                spoiler_ranges[idx][1] >= i){
//                 spo = true;
//             }
           
            
            
//             if(str[i].equals(" ")){
//                 if(spo){
//                     ss.add(temp);
//                 }else{
//                     s.add(temp);
//                 }
//                 temp="";
//                 spo=false;
        
//             }else{
//                 temp+=str[i];
//             }
            
       
            
//         }
        
            
//         if(!temp.equals("")){
//             if(spo) ss.add(temp);
//             else s.add(temp);
//         }          
            
//         for(String a:ss){
//             if(!s.contains(a)){
//                 answer+=1;
//                 s.add(a);
//             }
//         }
      
        
        
//         return answer;
//     }
// }



import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        // 1. Ensure ranges are sorted by start index for the idx pointer logic to work
        Arrays.sort(spoiler_ranges, (a, b) -> Integer.compare(a[0], b[0]));

        Set<String> safeWords = new HashSet<>();
        Set<String> spoilerWords = new HashSet<>(); // Use a Set to track unique spoilers
        
        StringBuilder currentWord = new StringBuilder();
        boolean isCurrentWordSpoiler = false;
        int rangeIdx = 0;

        char[] chars = message.toCharArray();
        for (int i = 0; i <= chars.length; i++) {
            // Process the word if we hit a space or the end of the string
            if (i == chars.length || chars[i] == ' ') {
                if (currentWord.length() > 0) {
                    String word = currentWord.toString();
                    if (isCurrentWordSpoiler) {
                        spoilerWords.add(word);
                    } else {
                        safeWords.add(word);
                    }
                }
                // Reset for next word
                currentWord.setLength(0);
                isCurrentWordSpoiler = false;
                continue;
            }

            // Check if current character index i is within any spoiler range
            while (rangeIdx < spoiler_ranges.length && spoiler_ranges[rangeIdx][1] < i) {
                rangeIdx++;
            }
            if (rangeIdx < spoiler_ranges.length && 
                i >= spoiler_ranges[rangeIdx][0] && i <= spoiler_ranges[rangeIdx][1]) {
                isCurrentWordSpoiler = true;
            }

            currentWord.append(chars[i]);
        }

        // Count spoilers that never appeared as safe words
        int answer = 0;
        for (String word : spoilerWords) {
            if (!safeWords.contains(word)) {
                answer++;
            }
        }

        return answer;
    }
}