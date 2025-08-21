class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] str=phone_number.split("");
         int len=str.length;
        for(int i =0; i<len; i++){
            if(i>=len-4){
               answer+=str[i];
            }else{
                answer+="*";
            }
            
        }
        
     return answer;   
    }
}