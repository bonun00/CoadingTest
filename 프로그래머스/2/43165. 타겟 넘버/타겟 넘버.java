class Solution {
    static int answer=0;
    static int t;
    static int numSize;
    static int[] number;
    public int solution(int[] numbers, int target) {
        t=target;
        numSize=numbers.length;
        number=numbers;
        dfs(0,0);
        return answer;
    }
    
    public static void dfs(int n,int temp ){
        if(n==numSize&&temp==t){
            answer++;
          
        }
        if(n<numSize){
        dfs(n+1, temp+number[n]);
        dfs(n+1, temp-number[n]);
        }
        
        
        
        
    }
    
    
    
}