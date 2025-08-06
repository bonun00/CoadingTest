
class Solution {
    int answer=0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visit=new boolean[dungeons.length];
        dfs(k,visit,0,dungeons);
        return answer;
    }
    void dfs(int k, boolean[] visit,int cnt,int[][]dungeons ){
        answer=Math.max(answer,cnt);
        for(int i =0; i<dungeons.length; i++){
            int min = dungeons[i][0];
            int d= dungeons[i][1];
            if(!visit[i]&&k>=min){
                visit[i]=true; 
                dfs(k-d,visit,cnt+1 ,dungeons);
                visit[i]=false;
                
            }
        }
    }
    
}