import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
      
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
         PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> arr=new ArrayList<>();
        for(String o:operations){
            String a=o.substring(0,1);
            if(a.equals("I")){
                int b=Integer.parseInt(o.substring(2));
                pq1.add(b);
                pq2.add(b);
            }else if(a.equals("D")){
                int b=Integer.parseInt(o.substring(2));
                if(b==-1){
                        pq2.remove(pq1.poll());
                }else{
                    pq1.remove(pq2.poll());
                }
            }
        }
        
 
        return new int[]{pq2.peek()==null?0:pq2.peek(),pq1.peek()==null?0:pq1.peek()};
    }

}