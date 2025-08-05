import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }
        if(map.size()>1){
            int count=1;
            for(int c: map.values()){
                count*=(c+1);
            }
            return count-1;
            
        }else{
            return clothes.length;
        }
    }
}
