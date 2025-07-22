import java.util.*;

class Solution {
    static int answer;

    public int solution(int n, int[][] q, int[] ans) {
        answer=0;
        dfs(1,n,0, new ArrayList<>(), q, ans);
        return answer;
    }
    private void dfs(int start, int n, int count, List<Integer> list, int[][] q, int[] ans){
         if(count==5){
            isPossible(list,q,ans);
            return;
        }
        for(int i=start; i<=n; i++){
            list.add(i);
            dfs(i+1,n,count+1, list, q, ans);
            list.remove(list.size()-1);
        
        }
    }
    
    private void isPossible(List<Integer> list, int[][]q, int[] ans){
        Set<Integer>set= new HashSet<>(list);
        for(int i=0; i<ans.length; i++){
            int[] now= q[i];
            int count=0;
            
            for(int n :now){
                if(set.contains(n)){
                    count++;
                }
            }
            if(count != ans[i]) return;

        }
        answer++;
        
        
        
    } 
    
}