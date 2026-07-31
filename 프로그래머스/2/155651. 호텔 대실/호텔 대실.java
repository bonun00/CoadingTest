import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 1;
        PriorityQueue<String[]> pq=new PriorityQueue<>((a,b)->{
            int[] ans=time(a[0],b[0]);
            return ans[0]-ans[1];
        });
        
        for(int i=0; i<book_time.length; i++){
            pq.add(book_time[i]);
        }
        
        Map<Integer,Integer> room=new HashMap<>();
        while(!pq.isEmpty()){
            String[] temp=pq.poll();
            int t1=mm(temp[0]);
            int t2=mm(temp[1])+10;
            boolean flag=true;
            
            for(int i=1; i<=answer; i++){
                if(room.getOrDefault(i,0)<=t1){                                
                    room.put(i,t2);
                    flag=false;
                    break;
                }
            }
            if(flag){
                room.put(++answer, t2);
            };
                
                
        }

        return answer;
    }
    int mm(String a){
        String[] temp=a.split(":");
        
        return Integer.parseInt(temp[0])*60+Integer.parseInt(temp[1]);
        
    }
                   
                   
                   
    int[] time(String a,String b){
        String[] t1=a.split(":");
        String[] t2=b.split(":");

        int r1= Integer.parseInt(t1[0])*60+Integer.parseInt(t1[1]);
        int r2= Integer.parseInt(t2[0])*60+Integer.parseInt(t2[1]);
        return new int[]{r1,r2};      
    }
}