import java.util.*;
class Solution {
    
    public int solution(String str1, String str2) {
        
        List<String> s1=new ArrayList<>();
        List<String> s2=new ArrayList<>();
       
       for(int i=0; i<str1.length()-1; i++){
           String temp=str1.substring(i,i+2);
            if(!temp.matches(".*[^a-zA-Z].*")){
                s1.add(temp.toUpperCase());
            }
        }
        int same=0;
       for(int i=0; i<str2.length()-1; i++){
          String temp=str2.substring(i,i+2);
           if(!temp.matches(".*[^a-zA-Z].*")){
                s2.add(temp.toUpperCase());
            }
       }
       int hap=s1.size()+s2.size();
       for(int i=0; i<s2.size(); i++){
           if(s1.contains(s2.get(i))){
                s1.remove(s2.get(i));
               same++;
           }
          
            
       }
        hap-=same;
 
        if(same!=0||hap!=0){
            float f= (float)same/hap;
            return  (int)(f*65536);
        }else{
            return 65536;
        }
        
        
    }
   
    
}