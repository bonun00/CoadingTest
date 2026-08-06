import java.util.*;
class Solution {
    
    Set<Integer> arr;
    
    public int solution(String numbers) {
        int answer = 0;
        boolean[] visited=new boolean[numbers.length()];
        arr=new TreeSet<>();
        String[] s=numbers.split("");
        
        for(int i=1; i<=numbers.length(); i++){
            ans(visited,s,"",0,i);
        }
        
        for(int a:arr){
            if(isDecimal(a))answer++;
        }
        return answer;
    }
    
    boolean isDecimal(int a){
        if(a<=1)return false;
        for(int i=2; i<=Math.sqrt(a);i++){
            if(a%i==0)return false;
        }
        return true;
    }
    void ans(boolean[] v,String[] numS, String s,int idx, int depth){
        if(s.length()>0&&idx==depth){
            arr.add(Integer.parseInt(s));
            return;
        }
        
        for(int i=0; i<numS.length; i++){
            if(v[i])continue;
            v[i]=true;
            ans(v,numS,s+numS[i],idx+1,depth);
            v[i]=false;
        }
    }
    
}