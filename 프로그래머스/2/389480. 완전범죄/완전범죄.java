import java.util.*;

class Solution {

    int[][] in;
    int ans;
    int[][] memo;
    
    public int solution(int[][] info, int n, int m) {
        in=info;
        ans=Integer.MAX_VALUE;
        memo=new int[info.length][m];
        
        for(int i=0; i<info.length; i++){
            Arrays.fill(memo[i],Integer.MAX_VALUE);
            
        }
        
        
        
        dfs(0,0,n,m, 0);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    
    
    void  dfs (int a, int b, int n,int m, int idx){
        if(ans<=a)return;
        
        if(idx==in.length){
            ans=Math.min(ans,a);
            return;
        } 
       
   
        if(memo[idx][b]<=a)return;
        
             memo[idx][b]=a;
        
        
        
        if(a+in[idx][0]<n)dfs(a+in[idx][0],b,n,m,idx+1);
        if(b+in[idx][1]<m)dfs(a,b+in[idx][1],n,m,idx+1);
        

    
    }
}