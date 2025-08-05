class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for(int i=citations.length; i>=0;i--){
            int count=0;
            for(int c: citations){
              if(c>=i)count++;
            }
             if(count>=i){
                return i;
            }
        }  
     return answer;
    }  
}

