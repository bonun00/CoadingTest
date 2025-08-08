class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str =s.split("");
        boolean frist=true;
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){
                frist=true;
            }else if(frist){
                str[i]=str[i].toUpperCase();
                frist= false;
            }else{
                str[i]=str[i].toLowerCase();
                frist=false;
            }
        }
        answer=String.join("",str);
        return answer;
    }
}