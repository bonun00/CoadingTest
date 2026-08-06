import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer= new ArrayList<>();
        Map<String, Integer> m=new HashMap<>();
        TreeMap<Integer, String> tm=new TreeMap<>();
        Map<String, List<int[]>> mm=new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            String g=genres[i];
            m.put(g,m.getOrDefault(g,0)+plays[i]);
            mm.put(g,mm.getOrDefault(g,new ArrayList<int[]>()));
            mm.get(g).add(new int[]{i,plays[i]});
        }
        
        for(String s: m.keySet()){
            tm.put(m.get(s),s);
        }
        
       for(Integer i:tm.descendingKeySet()){
           List<int[]> temp=mm.get(tm.get(i));
           
           if(temp.size()==1){
               answer.add(temp.get(0)[0]);
           }else{
               Collections.sort(temp,(a,b)->{
               if(a[1]!=b[1]){
                   return b[1]-a[1];
               }else{
                   return a[0]-b[0];
               }
           });
               answer.add(temp.get(0)[0]);
               answer.add(temp.get(1)[0]);
           }
       }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}