import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
      
        Queue<Integer> nowS=new ArrayDeque<>();
        
        for(int i=0; i<players.length; i++){
            int p=players[i];
          
//             if(nowS.size()>0){
//                 while(nowS.peek()<=i){
//                     nowS.poll();
//                 }
//             }
            while (!nowS.isEmpty() && nowS.peek() <= i) {
                 nowS.poll();
            }
  
   
            int nowSC=nowS.size(); // 현재 증설된 서버 갯수
        
            if(p<m)continue; //  현재 플레이어가 m명미만이라면 서버 증설 필요 x
            
            int n=p/m; // 현재 필요한 서버 증설 
            
            if(nowSC<n){  // 현재 있는 서버보다 필요한 서버 보다 작으면 그만금을  answer에 더 해줌 
                answer=answer+n-nowSC;
                for(int u=0; u<n-nowSC; u++){
                    nowS.add(i+k); // 서버 리스트에 저장 
                }
            }
         
                
        }
        
        return answer;
    }
    
    
    
    static int server( int m, int p){
        int n=1;
        while((n+1)*m<=p){
            n++;
        }
       
        
        return n-1;
    }
    
    
}