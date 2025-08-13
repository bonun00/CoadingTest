import java.util.*;

class Solution {
    public int solution(int[] sequence, int k) {
      Queue<int[]> qu= new ArrayDeque<>();
      for(int i=0; i<sequence.length; i++){
         qu.add(new int[]{sequence[i], i});
      }
      int order=0;
      while (!qu.isEmpty()) {
        int[] current = qu.poll();
        boolean hasHigher = false;
          
        for (int[] process : qu) {
            if (process[0] > current[0]) {
                hasHigher = true;
                break;
            }
        }

        if (hasHigher) {
    
            qu.offer(current);
        } else {
       
            order++;
            if (current[1] == k) {
                return order; 
            }
        }
    }
    return -1;
    }        
}