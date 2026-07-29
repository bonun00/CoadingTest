import java.util.*;

class Solution {
    record Work (int id, int start, int time) {}
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Work> pq=new PriorityQueue<>((a,b) ->{
           if(a.time()-b.time()!=0){
               return a.time()-b.time();
           }else if(a.start()-b.start()!=0){
               return a.start()-b.start();
           }else{
               return a.id()-b.id();
           }
        });

        int time=0;
        int idx=0;
        int n=0;
 
        Arrays.sort(jobs,(a,b)->{
            return a[0]-b[0];
        });
        
        
        while(true){
            
           while(idx<jobs.length&&time>=jobs[idx][0]){
               pq.add(new Work(n++, jobs[idx][0], jobs[idx][1]));
               idx++;
           }
            if(!pq.isEmpty()){
                    Work temp=pq.poll();
                    time=time+temp.time();
                    answer+=(time-temp.start());
                    
             }else if(idx<jobs.length){
               time=jobs[idx][0];
           }else{
                break;
            }
            
            
        }
        
        return answer/jobs.length;
    }
}
//작업 소요시간 < 작업 요청시각 빠른것 < 작업의 번호가 작은것 순으로 우선순위가 높다
// 반환시간 평균 = 작업 종료 시각 - 요청시각 