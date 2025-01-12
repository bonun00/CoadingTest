class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        
        return search(diffs, times, limit);
        
        }
    
    
    public int search(int[]diffs,int[] times,long limit ){
       int max = 1; int min = 100000; 
        while (max <= min){
            int level = (max+min)/2; 
            long mid = puzzl(diffs,times, level);
            if(mid > limit) {
                max = level + 1;
                }else{ 
                min = level - 1;
                } 
        }
        return max;
        
        
    }

    
    public long puzzl(int[] diffs,int[] times,int level ){
        long mm=0;
        int len = times.length;
        for(int i=0; i<len; i++){
            if(diffs[i]<=level){
              mm+=times[i];
            }else{
                mm+=(times[i]+times[i-1])*(diffs[i]-level)+times[i];
            }
        }
            return mm;
                        
    }        
}
