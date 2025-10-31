import java.util.ArrayDeque;
import java.util.Arrays;

class Solution {

    static int[] size;
    static int[][] move=new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
    static int[][] best;
    static ArrayDeque<int[]> arr =new ArrayDeque<>();
    
    public int solution(int[][] maps) {
 
        size=new int[3];
        size[0]=maps.length;
        size[1]=maps[0].length;
        best=new int[size[0]][size[1]];
        
        for(int i=0; i<size[0]; i++)Arrays.fill(best[i],-1);
        
        best[0][0]=1;
        
        arr.offer(new int[]{0,0});
        
         while(!arr.isEmpty()){
             int[] q=arr.poll();
             int x=q[0];
             int y=q[1];
             
             if(x==size[0]-1&&y==size[1]-1)return best[x][y];
             
             
             for(int i=0; i<4; i++){
                 int dx=x+move[i][0];
                 int dy=y+move[i][1];
                 
                 if(0<=dx&&dx<size[0]&&0<=dy&&dy<size[1]){
                     if(maps[dx][dy]==0)continue;
                     if(best[dx][dy]!=-1)continue;
                     
                     best[dx][dy]=best[x][y]+1;
                     arr.offer(new int[]{dx,dy});
                 }
    
                 
             }
            
         }
         return -1;
        
    }
}
//     public static void bfs(int x,int y,int time, int[][] maps){
        
        
        
//         if(time>=answer)return;
  
        
//         if(x==size[0]-1&&y==size[1]-1){
//             if(time<answer)answer=time;
            
//             return;
//         }
        
//         if(maps[x][y]==1){
            
//             for(int i=0; i<4; i++){
//                 int dx=x+move[i][0];
//                 int dy=y+move[i][1];
                
//                 if(0<=dx&&dx<size[0]&&0<=dy&&dy<size[1]){
//                     if(maps[dx][dy]==1) dfs(dx,dy,time+1,maps);
//                 }
               
//             }
            

//         }
        
    
        
        
        

       