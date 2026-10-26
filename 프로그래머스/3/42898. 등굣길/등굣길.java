class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp=new int[n+1][m+1];
        dp[1][1]=1;
        
        int[] dx={0,-1};
        int[] dy={-1,0};
        
         boolean flag=false;
        for(int p=0; p<puddles.length; p++){
            dp[puddles[p][1]][puddles[p][0]]=-1;
                    
        }
         
        
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m; j++){
               if(dp[i][j]==-1)continue;
                
         
                for(int k=0; k<2; k++){
                    int x=i+dx[k];
                    int y=j+dy[k];
                    if(0>=x||0>=y||n<x||y>m)continue;
                    
                    if(dp[x][y]>0){
                        dp[i][j] += dp[x][y];
                        dp[i][j] %= 1000000007;
                    }

                }
                
            }
            
            
        }
        
        
        return dp[n][m];
    }
}