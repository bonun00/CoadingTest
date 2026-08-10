import java.util.*;
class Solution {

    public int solution(int[][] routes) {
        int answer = 0;

        Arrays.sort(routes, (a,b)->{
            return Integer.compare(a[1],b[1]);
        });
        int camera=-30001;
        
        for(int i=0; i<routes.length; i++){
            if(routes[i][0]>camera){
                answer++;
                camera=routes[i][1];
            }
            
    
        }
        
  
    
        
        
        return answer;
    }

    
    
    
}