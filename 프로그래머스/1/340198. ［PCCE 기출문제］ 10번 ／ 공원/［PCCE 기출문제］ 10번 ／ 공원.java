import java.util.Arrays;
class Solution {
    static String[][] p;

    public int solution(int[] mats, String[][] park) {
        p=park;
        
        Arrays.sort(mats);
        for(int a=mats.length-1; a>=0; a--){
            int m=mats[a];
            for(int i=0; i<park.length; i++){
                for(int u=0; u<park[0].length; u++){
                    if(park[i][u].equals("-1")){
                        if (mat(i,u,m)){return m;}
                    }
                }
            }
        }
        
        
        return -1;
    }
    
    
    public boolean mat(int x, int y, int m){
        for(int i=x; i<x+m; i++){
            for(int u=y; u<y+m; u++){
                if(i>=p.length||u>=p[0].length||!p[i][u].equals("-1"))return false;
            }
        }
        return true;
    }
}

