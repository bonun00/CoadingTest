import java.util.Stack;


class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack =new Stack<>();
        int len = s.length();

        for(int i=0; i<len; i++){
            char str=s.charAt(i);
            if(str=='('){
                stack.push(str);
            }else{
                if(stack.isEmpty()){
                    stack.push(str);
                    break;
                }else if(stack.peek()=='('){
                    stack.pop();
                }
            }                   
    
}
                         
        if(stack.isEmpty()){
            answer=true;
        }

        return answer;
    }
}