class Solution {
    
    static char[][] grid;
    
    public int[] solution(String[] park, String[] routes) {
        grid= new char[park.length][park[0].length()];
        int[] start=new int[2];
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[0].length(); j++){
                grid[i][j]=park[i].charAt(j);
                if(grid[i][j]=='S'){
                    start[0]=i;
                    start[1]=j;
                }
            }
        }
        
        
        for(String r: routes){
            start=move(start,r.split(" ")[0],Integer.parseInt(r.split(" ")[1]));
        }
        
        
        
        
        return start;
    }
    
    static int[] move(int[] start, String m, int n ){
        boolean go=true;
        if(m.equals("E")){
            if(start[1]+n>=grid[0].length) return start;
            for(int i=start[1]; i<=n+start[1]; i++){
                if(grid[start[0]][i]=='X')go=false;
            }
            
            if(go)start[1]+=n;
        }else if(m.equals("W")){
            if(start[1]-n<0) return start;
            for(int i=start[1]-n; i<start[1]; i++){
                if(grid[start[0]][i]=='X')go=false;
            }
            
            if(go)start[1]-=n;
        
        }else if(m.equals("N")){
            if(start[0]-n<0) return start;
            for(int i=start[0]-n; i<start[0]; i++){
                if(grid[i][start[1]]=='X')go=false;
            }
            
            if(go)start[0]-=n;
        }else{
            if(start[0]+n>=grid.length) return start;
            for(int i=start[0]; i<=n+start[0]; i++){
                if(grid[i][start[1]]=='X')go=false;
            }
            
            if(go)start[0]+=n;
        }
        
        
        return start;
        
    } 
    
    
    
}