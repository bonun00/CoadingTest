import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String>arr= new ArrayList<>();
        if(cacheSize==0){
            return cities.length*5;
        }
        
        for(String city:cities){
            String str=city.toUpperCase();
            if(arr.contains(str)){
                arr.remove(str);
                arr.add(str);
                answer+=1;
            }else{
                if(arr.size()==cacheSize){
                    arr.remove(0);
                }
                    arr.add(str);
                    answer+=5;
                }
            
        }
        
        return answer;
    }
}