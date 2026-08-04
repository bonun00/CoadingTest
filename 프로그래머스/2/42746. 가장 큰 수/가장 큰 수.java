import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        
        List<Integer>arr=Arrays.stream(numbers).boxed().collect(Collectors.toList());
        

        Collections.sort(arr,(a,b)->{
            return (""+b+a).compareTo(""+a+b);
        });
        
        if(arr.get(0)==0)return "0";
    
        return arr.stream().map(String::valueOf).collect(Collectors.joining());
    }
}