// import java.util.*;

// class Solution{
//     public int solution(String s){
    
//         List<String> list=new ArrayList<>();
//         for(char c: s.toCharArray()){
//             list.add(String.valueOf(c));
//         }
//         while(list.size()>1){
//             for(int i =1;list.size()>i; i++){
//                 if(list.get(i-1).equals(list.get(i))){
//                     list.remove(i);
//                     list.remove(i-1);
//                 }
//             }          
//         }
//         if(list.size()==1){
//             return 0;
//         }else return 1;
//     }
// }


import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}
