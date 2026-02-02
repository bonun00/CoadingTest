class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        int box=1;
        int[][] line=new int[(n + w - 1) / w][w];
        int l=0;
        int x=0;
        int y=0;
        boolean b=true;
        while(box<=n){
            if(b){
            for(int u=0; u<w; u++){
                if(box>n){
                    line[l][u]=0;
                }else{
                     line[l][u]=box++;
                }
                if(box-1==num){
                    x=l;
                    y=u;
                }
                
               
            }
            }else{
               for(int u=w-1; u>=0; u--){
                if(box>n){
                    line[l][u]=0;
                }else{
                     line[l][u]=box++;
                }
                if(box-1==num){
                    x=l;
                    y=u;
                }
               
            }
         
            } 
            
            if(b){
                b=false;
            
            }else{
                b=true;
            }
            l++;
        }
    
//        while(x!=n/w+1){
//            x++;
//            answer++;
//            if(line[x-1][y]==0){
//                answer--;
//            }
           
//        }
        for (int i = x + 1; i < line.length; i++) {
            if (line[i][y] != 0) {
              answer++;
         }
    }

        
        
        return answer;
    }
}