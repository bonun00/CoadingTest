import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        
        Map<String ,Integer> m =new HashMap<>();
     

        for(int r[] : routes){
            int t=0;
            
            m.merge(""+(t++)+","+ points[r[0]-1][0] +","+ points[r[0]-1][1],1,Integer::sum);
            for(int i=0; i<r.length-1; i++){
                int x=points[r[i]-1][0];
                int y=points[r[i]-1][1];
                int[] end=points[r[i+1]-1];
             
                
                while(x!=end[0]||y!=end[1]){
                    if(x<end[0]){
                        x++;
                    }else if(x>end[0]){
                        x--;
                    }else{
                        if(y<end[1]){
                            y++;
                        }else if(y>end[1]){
                            y--;
                        }
                    }
                    m.merge(""+(t++)+","+ x +","+ y,1,Integer::sum);                
                }
            }
        }
        for(int a:m.values()){
            if(a<2)continue;
            answer++;
            
        }
        
        
        
        
        return answer;
    }
}