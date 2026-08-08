import java.util.*;

class Solution {
    
    int [][] item;
    int[][] move={{0,1},{-1,0},{0,-1},{1,0}};
    int[][] idx={{0,3},{2,3},{2,1},{0,1},{0,3}};
    int answer;
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        answer = 0;
        item=new int[101][101];
        boolean[][] visited =new boolean[101][101];

        for(int i=0;i<rectangle.length; i++){
            for(int j=0; j<4; j++){
                int[] r=rectangle[i];
                int[] start ={r[idx[j][0]]*2,r[idx[j][1]]*2};
                int[] end ={r[idx[j+1][0]]*2,r[idx[j+1][1]]*2};
                if(!cross(rectangle, start[0],start[1])){
                    item[start[1]][start[0]]=1;
                };
           
                if(!cross(rectangle, end[0],end[1])){
                    item[end[1]][end[0]]=1;
                };
     
                while(start[0]!=end[0]||start[1]!=end[1]){
                    int s1=start[0];
                    int s2=start[1];
                    start[0]+=move[j][1];
                    start[1]+=move[j][0];
                    if(cross(rectangle, start[0],start[1]))continue;
                    item[start[1]][start[0]]=1;
                }
            }
           
        }
        
        bfs(visited,characterX*2,characterY*2,itemX*2,itemY*2);

        return answer/2;
    }
    
    void bfs(boolean[][] v, int cx, int cy, int ix,int iy){
        Deque<int[]> q=new ArrayDeque<>();
        
        v[cy][cx]=true;
        q.add(new int[]{cx,cy,answer});
        
        while(!q.isEmpty()){
            int[] a=q.poll();
        
            
            for(int i=0; i<4; i++){
                int dx=a[0]+move[i][1];
                int dy=a[1]+move[i][0];
                int ans=a[2];
                if(dy<0||dx<0||dx>=101||dy>=101)continue;
                if(item[dy][dx]==0||v[dy][dx])continue;
                v[dy][dx]=true;
                ans++;
                if(dx==ix&&dy==iy){
                    answer=ans;
                    return;
                }
                q.add(new int[]{dx,dy,ans});         
           
            } 
        } 
    }
    
    boolean cross(int[][] rec, int a, int b){
        for(int i=0; i<rec.length; i++){
            int[] r=rec[i];
            if(r[0]*2<a&&r[1]*2<b&&r[2]*2>a&&r[3]*2>b)return true; 
        }
        return false;
        
    }
}