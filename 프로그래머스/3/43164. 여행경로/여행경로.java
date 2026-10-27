import java.util.*;

class Solution {
    
    boolean[] used;
    int len;
    String[][] tic;
    String[] answer;
    
    public String[] solution(String[][] tickets) {
        
        len=tickets.length;
        used=new boolean[len];
        
        Arrays.sort(tickets,(a,b)->a[1].compareTo(b[1]));
        tic=tickets;
        answer=new String[len +1];
      
        dfs("ICN",0);
       
        return answer;
    }
    
    
    boolean dfs(String str, int cnt){
       if(cnt==len){
           answer[cnt]=str;
           
           return true;
           
           };
        
        
        for(int i=0; i<len; i++){
            if(used[i])continue;
            used[i]=true;
            if(tic[i][0].equals(str)){
                answer[cnt]=tic[i][0];
                if(dfs(tic[i][1],cnt+1))return true;
            }
                
             
            used[i]=false;
            
            
            
        }
        return false;
        
        
    }
    
    
    
    
    
}