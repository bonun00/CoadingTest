import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer=new ArrayList<Integer>();
        for(int i=0; i<commands.length; i++){
            List<Integer> temp=new ArrayList<Integer>();
            for (int u=commands[i][0]; u<=commands[i][1]; u++){
                temp.add(array[u-1]);
            }
            Collections.sort(temp);
            answer.add(temp.get(commands[i][2]-1));
        }
        
        // return answer.toArray(new int[answer.size()]);
        
        return answer.stream().mapToInt(i->i).toArray();
                      
    }
}
                       