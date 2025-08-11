import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String[] p=s.substring(2, s.length() - 2).split("\\},\\{");
        
        List<List<Integer>> arr=new ArrayList<>();
        for(String part: p){
            List<Integer> num= new ArrayList<>();
            for(String n: part.split(",")){
                num.add(Integer.parseInt(n));
            }
            arr.add(num);
        }
        arr.sort(Comparator.comparingInt(List::size));
        
        List<Integer> answerList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (List<Integer> nums : arr) {
            for (int num : nums) {
                if (seen.add(num)) {
                    answerList.add(num);
                }
            }
        }
    
        return answerList.stream().mapToInt(i -> i).toArray();
        
     
    }
}