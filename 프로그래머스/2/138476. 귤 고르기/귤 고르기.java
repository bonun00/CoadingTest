import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int t: tangerine){
            count.put(t,count.getOrDefault(t,0)+1);
        }
        List<Integer> list =new ArrayList<>(count.values());
        list.sort(Comparator.reverseOrder());
        int sum=0;
        int answer=0;
        for(int l: list){
            sum+=l;
            answer++;
            if(sum>=k) break;
        }
        
        return answer;
    }
}