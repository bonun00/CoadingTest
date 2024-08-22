import java.util.Stack;


class Solution {
   public int[] solution( int[] prices) {
        int[] answer =new int [prices.length];
        Stack<Integer> stack= new Stack<>();
        int tmp;
        for(int i=0;i< prices.length;i++ ) {
            answer[i]= prices.length-1-i;
        }
        for(int i=0; i<prices.length; i++) {
          while(!stack.isEmpty()&&prices[stack.peek()]>prices[i]){
              tmp=stack.peek();
              answer[stack.pop()]=i-tmp;
          }
          stack.push(i);
        }
        return answer;
    }
}