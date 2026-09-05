import java.util.*;

class Solution {
    Map<Long, Long> map;
    
    public long[] solution(long k, long[] room_number) {
        long[] answer =new long[room_number.length];
        
        map=new HashMap<>();
        for(int i=0; i<room_number.length; i++){
            
            answer[i]=findRoom(room_number[i]);
            
        }
        return answer;
    }
    long findRoom(long rn){
        if(!map.containsKey(rn)){
            map.put(rn,rn+1);
            return rn ;
        }
        
        
        long nextRoom=map.get(rn);
        long r=findRoom(nextRoom);
        
        map.put(rn,r+1);
        
        return r;
        
        
        
        
    }
    
    
    
}