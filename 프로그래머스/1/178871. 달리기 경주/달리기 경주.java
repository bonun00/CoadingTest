import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer ={};
        
        // for(String call : callings){
        //     for(int i=0; i<players.length; i++){
        //         if(call.equals(players[i])){
        //             String temp=players[i];
        //             players[i]=players[i-1];
        //             players[i-1]=temp;
        //         } 
        //     }
        // }
        // answer=players;
        
        Map<String, Integer> map =new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(String c: callings){
            int call=map.get(c);
            map.put(c,call-1);
            
            String changePlayer=players[call-1];
            int changeNum=map.get(changePlayer);
            map.put(changePlayer, call);
            
            players[call]=changePlayer;
            players[changeNum]=c;
            
        }
        answer=players;
        
        
        
        return answer;
    }
    
}