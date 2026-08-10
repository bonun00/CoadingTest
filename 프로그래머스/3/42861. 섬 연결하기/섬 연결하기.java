import java.util.*;
class Solution {
    int[] p;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        p=new int[n+1];
        for(int i=1; i<n+1; i++){
            p[i]=i;
        }
        
        
        Arrays.sort(costs, (a,b)->{
            return a[2]-b[2];
        });
        int cnt=0;
        for(int[] c:costs){
            if(find(c[0])!=find(c[1])){
                union(c[0],c[1]); 
                cnt++;
                answer+=c[2];
            }
            
            if(cnt==n-1)break;
            
            
        }
        
        

        return answer;
    }
    int find(int a){
        if(p[a]==a){
            return a;
        }else{
            return p[a]=find(p[a]);
            
        }
        
    }
    
    void union(int a,int b){
        int fa=find(a);
        int fb=find(b);
        
        if(fa!=fb){
            p[fb]=fa;
        }
        
    }
    
}