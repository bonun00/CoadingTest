
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<numbers.length; i++){
            for(int u=i+1; u<numbers.length; u++){
                set.add(numbers[i]+numbers[u]);
            }
        }
        // Integer[] answer = set.toArray(new Integer[0]);
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}