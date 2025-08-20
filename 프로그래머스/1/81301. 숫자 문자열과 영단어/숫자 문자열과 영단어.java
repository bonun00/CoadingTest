import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String num ="";
        String temp="";
        Map<String,String> map=new HashMap<>();
        map.put("zero","0"); map.put("six","6");
        map.put("one","1");  map.put("seven","7");
        map.put("two","2");  map.put("eight","8");
        map.put("three","3"); map.put("nine","9");
        map.put("four","4"); map.put("five","5");
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            if(map.containsValue(str[i])){
                num+=str[i];
            }else {
                temp+=str[i];
                if(map.containsKey(temp)){
                    num+=map.get(temp);
                temp="";
                }
                
            }
            

        }
     

        return Integer.parseInt(num);
    }
}