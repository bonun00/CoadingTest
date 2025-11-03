import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String,Integer> map= new HashMap<>();
        for(int i=0; i<survey.length; i++){
            String s1=survey[i].split("")[0];
            String s2=survey[i].split("")[1];
            int c=choices[i];
                switch(c){
                    case 1: 
                        map.put(s1,map.getOrDefault(s1,0)+3);
                        break;
                    case 2:
                         map.put(s1,map.getOrDefault(s1,0)+2);
                        break;
                    case 3 :
                         map.put(s1,map.getOrDefault(s1,0)+1);
                        break;
                    case 5 :
                         map.put(s2,map.getOrDefault(s2,0)+1);
                        break;
                    case 6 :
                         map.put(s2,map.getOrDefault(s2,0)+2);
                        break;
                    case 7 :
                         map.put(s2,map.getOrDefault(s2,0)+3);
                        break;
                        
                        
                } 
        }
            StringBuilder sb=new StringBuilder();
       
                if(map.getOrDefault("R",0)>=map.getOrDefault("T",0)){
                    sb.append("R");
                }else{
                    sb.append("T");
                }
                
                if(map.getOrDefault("C",0)>=map.getOrDefault("F",0)){
                    sb.append("C");
                }else{
                    sb.append("F");
                }
                  if(map.getOrDefault("J",0)>=map.getOrDefault("M",0)){
                    sb.append("J");
                }else{
                    sb.append("M");
                }
                
                  if(map.getOrDefault("A",0)>=map.getOrDefault("N",0)){
                    sb.append("A");
                }else{
                    sb.append("N");
                  }
        
        return sb.toString();
    }
}