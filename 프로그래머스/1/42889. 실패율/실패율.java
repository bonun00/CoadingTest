import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
 
        int len= stages.length;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i =0; i<len; i++){
            map.put(stages[i], map.getOrDefault(stages[i],0)+1);
        }
        double [] fail=new double[N+1];
        int lenM=len;
        for(int i=1; i<=N; i++){
            if(map.getOrDefault(i,0)==0){
                fail[i]=0.0;
                continue;
            };
            fail[i]=(double) map.getOrDefault(i,0)/lenM;
            lenM-=map.getOrDefault(i,0);
        }
        Integer[] order =new Integer[N];
        for(int i=0; i<N; i++)order[i]=i+1;
        
        Arrays.sort(order, (a,b)->{
            int cmp= Double.compare(fail[b],fail[a]);
            return (cmp==0)?Integer.compare(a,b):cmp;     
        });
        

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) answer[i] = order[i];
        return answer;
    }
}