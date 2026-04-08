import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String>set=new HashSet<>();
        int[] start={0,0};
        
        for(int i=0; i<dirs.length(); i++){
            char dir=dirs.charAt(i);
            int pX=start[0];
            int pY=start[1];
            if(dir=='L'&&-6<start[1]-1){
                start[1]-=1;
            }else if(dir=='R'&&start[1]+1<6){
                start[1]+=1;
            }else if(dir=='U'&&start[0]+1<6){
                start[0]+=1;
            }else if(dir=='D'&&-6<start[0]-1){
                start[0]-=1;
            }else{continue;}
            

            String p1=""+pX+pY+start[0]+start[1];
            String p2=""+start[0]+start[1]+pX+pY;
            
            if(!set.contains(p1)){
                set.add(p1);
                set.add(p2);
                answer++;
            }
            
            
            
        }
        
        
        
        return answer;
    }
}