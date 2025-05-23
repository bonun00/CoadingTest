import java.util.*;
class Solution {
    
    private boolean[][] visited;
    private final Set<Integer> set = new HashSet<>();
    
    public int solution(int[][] land) {
        int rows=land.length;
        int cols=land[0].length;
        
        visited= new boolean[rows][cols];
        int[][] map = new int[rows][cols];
        List<Integer> oilCount =new ArrayList<>();
        
        
        for (int w=0; w<land[0].length; w++){
            for(int d=0; d<land.length; d++){
                if(!visited[d][w]&& land[d][w]==1){
                int count= search(land ,d,w,oilCount.size()+1, map);
                
                oilCount.add(count);
                }
                }
        }
        return getMaxCount(map, oilCount,rows,cols);
    }
    
    private int getMaxCount(int[][]map, List<Integer> list, int rows, int cols ){
        int max =0;
        
        for(int col=0; col<cols; col++){
            int count=0;
            for(int row =0; row<rows; row++){
                if(map[row][col]>0 ){
                    set.add(map[row][col]);
                }
            }
            for(Integer id : set){
                count += list.get(id-1);
            }
            
            max = Math.max(max,count);
            set.clear();
            
            
        }
        return max;
        
        
    }
    private int search(int [][] land, int d, int w, int oilId, int[][] oilMap){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{d,w});
        visited[d][w]=true;
        oilMap[d][w]=oilId;
        
        int[] dd ={0,0,1,-1};
        int[] dw ={1,-1,0,0};
        
        int count =0;
        while(!queue.isEmpty()){
            int size =queue.size();
            count +=size;
            
            
            for(int i=0; i<size; i++){
                int []poll= queue.poll();
                int curr_d=poll[0];
                int curr_w=poll[1];
                
                for(int j=0; j<4; j++){
                    int new_d = curr_d + dd[j];
                    int new_w= curr_w+dw[j];
                    
                    if (isVaild(new_d, new_w, land.length, land[0].length)&&!visited[new_d][new_w]&&land[new_d][new_w]==1){
                        visited[new_d][new_w]=true;
                        oilMap[new_d][new_w]=oilId;
                        queue.offer(new int[]{new_d, new_w});
                    }
                    
                }
                
                
            }
                
                
                
                
        }
        return count;
        
        
        
        
        
    }
    
    
    private boolean isVaild(int d, int w, int depth, int width){
        return d>=0 && d<depth && w>=0 && w<width;
    }
    
}