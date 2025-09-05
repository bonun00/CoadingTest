class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int [] answer=new int[2];
        int zero=0;
        int same=0;
        for(int i =0; i<lottos.length; i++){
            if(lottos[i]==0){
                zero++;
                continue;
            }
            for(int u=0; u<lottos.length; u++)
                if(lottos[i]==win_nums[u]){
                    same++;
                }
        }
        answer[0]=Math.min(7-(same+zero),6);
        
        if(same==0){
            answer[1]=6;
        }else{
            answer[1]=7-same;
        }
        
        return answer;
    }
}