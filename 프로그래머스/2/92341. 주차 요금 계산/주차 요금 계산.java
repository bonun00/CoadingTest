import java.util.TreeMap;
import java.util.Map;
class Solution {
    public int[] solution(int[] fees, String[] records) {
     
        Map<String ,Integer> map=new TreeMap<>();
        for(int i =0; i<records.length; i++){
            String[] car=records[i].split(" ");   
            if(car[2].equals("IN")){
            for(int u=i; u<records.length; u++){
                String[] outCar=records[u].split(" ");
                if(outCar[2].equals("OUT")&&outCar[1].equals(car[1])){
                    map.put(car[1],map.getOrDefault(car[1],0)+time(car[0],outCar[0]));
                    break;
                }else if(u==records.length-1){
                    map.put(car[1],map.getOrDefault(car[1],0)+time(car[0],"23:59"));
                }
                
            
            }
           }
        }
        int[] answer =new int[map.size()];
        int idx=0;
        for(String s :map.keySet()){
            if(map.get(s)<=fees[0]){
                answer[idx]=fees[1];
                idx++;
            }else{
            int money=(int)Math.ceil((double)(map.get(s)-fees[0])/fees[2]);
            answer[idx]=money*fees[3]+fees[1];
            idx++;
            }
            
            
        }
    
        
        
        return answer;
    }
    
    public static int time(String start, String end){
        
        String[] s=start.split(":");
        String[] e=end.split(":");

        return Integer.parseInt(e[0])*60+Integer.parseInt(e[1])-(Integer.parseInt(s[0])*60+Integer.parseInt(s[1]));
        
        
        
    }
    
    
    
    
}