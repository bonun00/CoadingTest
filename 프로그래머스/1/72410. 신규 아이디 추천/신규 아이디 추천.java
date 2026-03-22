// class Solution {
//     public String solution(String new_id) {
//         String answer = "";
        
//         answer=new_id.toLowerCase();
//         String[] str={"~","!","@","#","$","%","^","&","*","=","+","[","{","]","}",":","?",
//                     "<",">","/"};
        
//         for(int i=0; i<str.length; i++){
//             answer=answer.replace(str[i],"");
//         }
        
        
//         answer = answer.replaceAll("\\.{2,}", ".");
// //         if(answer.split("")[0].equals(".")){
// //             StringBuilder sb= new StringBuilder(answer);
// //             sb.deleteCharAt(0);
// //             answer=sb.toString();
// //         }   

// //         if(answer.split("")[answer.length()-1].equals(".")){
// //             StringBuilder sb= new StringBuilder(answer);
// //             sb.deleteCharAt(answer.length()-1);
// //             answer=sb.toString();
// //         }
//         if(answer.startsWith(".")){
//             // answer=answer.substring(1,answer.length());
//             answer=answer.substring(1);
        
//         }
//         if(!answer.isEmpty()&&answer.endsWith(".")){
//             answer=answer.substring(0,answer.length()-1);
//         }
        
        
        
//         if(answer.isEmpty()){
//             answer="a";
//         }
      
//         if(answer.length()>15){
//             answer=answer.substring(0,15);
//             if (answer.endsWith(".")) {
//         answer = answer.substring(0, answer.length() - 1);
//     }
//         }  
        
//         while(answer.length()<=2){
//             // answer+=answer.split("")[answer.length()-1];
// answer += answer.charAt(answer.length() - 1);
//         }
        
//         return answer;
//     }
// }


class Solution {
    public String solution(String new_id) {
        // 1단계
        String answer = new_id.toLowerCase();
        
        // 2단계 (배열 순회보다 정규식이 누락 방지에 유리합니다)
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        
        // 3단계
        answer = answer.replaceAll("\\.{2,}", ".");
        
        // 4단계 (앞뒤 마침표 제거)
        answer = answer.replaceAll("^\\.|\\.$", "");
        
        // 5단계
        if (answer.isEmpty()) {
            answer = "a";
        }
      
        // 6단계: 15자 제한
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            // 자른 후 끝에 마침표가 남으면 '반드시' 제거 (이건 4단계의 반복이 아니라 6단계의 일부입니다)
            answer = answer.replaceAll("\\.$", "");
        }  
        
        // 7단계: 2자 이하일 때 (반드시 6단계를 거친 후에 수행)
        while (answer.length() <= 2) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}