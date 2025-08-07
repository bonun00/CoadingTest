class Solution {
    static String[] words = {"A", "E", "I", "O", "U"};
    static int answer = 0;
    static int count = 0;
    static boolean found = false;
    public int solution(String word) {
      
        dfs("",word);
        
        return answer;
    }
    public void dfs(String current,String target){
        if(current.equals(target)){
            answer=count;
            found=true;
            return;
        }
        
        if(current.length()==5||found) return;
        
        for(int i=0; i<5;i++){
            count++;
            dfs(current+words[i],target);
        }
        
        
    }
    
}