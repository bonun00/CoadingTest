import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;


class Solution {
    
  
    static int answer=0;
    public int solution(String begin, String target, String[] words) {
    
        List<String> list =Arrays.asList(words);
        boolean go =false;
        
        for(int i=0; i<list.size(); i++){
            if(words[i].equals(target)){
                go =true;
            }
        }
        
        if(go){
            bfs(begin, target,list);
            return answer;
        }else{
            return 0;
        }
        
    }
    

    public static void bfs( String begin,String target, List<String> words){
        Queue<String> q=new LinkedList<>();
        boolean[] check =new boolean[words.size()];
        q.add(begin);
        while(!q.isEmpty()){
            
            for(int u=0; u<q.size();u++){
            String start = q.poll();
            if(start.equals(target)){
                return;
            }
             for(int i=0; i<words.size(); i++){
                if(diff(start, words.get(i))&&check[i]==false){
                    q.add(words.get(i));
                    check[i]=true;
                    
                }
            }
            
            }
            
            answer++;
            
        } 
    }
    
    public static boolean diff(String str1, String str2){
        int a=0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                a+=1;
            }
        }
        if(a==1){
            return true;
        }
        return false;
        
        
        
    }
    
}