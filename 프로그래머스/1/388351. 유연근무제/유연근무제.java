class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        String[] days={"mon","tue","wed","thu","fri","sat","sun"};
        int s=startday-1;
        for(int u=0; u<schedules.length; u++){
            for(int i=0; i<7; i++){
                
                if(s==5){
                    s++;
                    continue;
                }else if(s==6){
                    s=0;
                    continue;
                }
                
                int scheduledHour = schedules[u] / 100;
                int scheduledMin = schedules[u] % 100;
                int limitTime = (scheduledHour * 60) + scheduledMin + 10;

                int arriveHour = timelogs[u][i] / 100;
                int arriveMin = timelogs[u][i] % 100;
                int arriveTime = (arriveHour * 60) + arriveMin;


                if (limitTime < arriveTime) {
                    answer--;
                    break;
                }
                s++;
               
            }
            s=startday-1;
        }
        
        
        return answer;
    }
}