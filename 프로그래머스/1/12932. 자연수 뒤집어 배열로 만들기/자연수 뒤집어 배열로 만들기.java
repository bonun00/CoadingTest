class Solution {
    public int[] solution(long n) {
        
        String str =String.valueOf(n);
        int[] answer = new int[str.length()];
        char[] s= str.toCharArray();
        
        for(int i=str.length()-1; i>=0; i-- ){
            answer[str.length()-i-1]=str.charAt(i)-'0';   
        }
        return answer;
    }
}