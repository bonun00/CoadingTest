import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] num=new int [number+1];
        for(int i=1; i<=number; i++){
            int count=0;
            // for(int u=i; u*u<=i; u++){
            //     if(num[i-1]%u==0){
            //         count++;
            //     }
            // }
            
            for(int u=i; u<=number; u+=i){
               num[u]++;
            }
            
            
        }
        
        for(int i=1; i<=number; i++){
            if(num[i]<=limit){
                answer+=num[i];
            }else{
                answer+=power;
            }
        }
        
        
        return answer;
    }
}