import java.util.*;

class Solution {
    
    int answer,k;
    int[] coun;
    int[][] r; 
    public int solution(int k, int n, int[][] reqs) {
        answer = Integer.MAX_VALUE;
        coun=new int[k];
        Arrays.fill(coun,1);
        r=reqs;
        k=k;
        dfs(0,0, n-k);
        
        return answer;
    }

    void dfs(int depth,int start,int n){
        if(depth==n){
            answer=Math.min(func(),answer);
            return;
        }
        
        for(int i=start; i<coun.length; i++){
           coun[i]+=1;
           dfs(depth+1,i,n); 
            coun[i]-=1;
        }        
    }
    
    int func(){
        
       int temp=0; 
        for(int i=0; i<coun.length; i++){
            PriorityQueue<Integer> q=new PriorityQueue<>();
            for(int j=0; j<r.length; j++){
                if(i==r[j][2]-1){
                    int start=r[j][0];
                    
                    while(!q.isEmpty()&&q.peek()<=start){
                        q.poll();
                    }  
                    
                    if(q.size()<coun[i]){
                        q.add(start+r[j][1]);
                    }else{
                        int t= q.poll();
                        temp+=t-start;
                        q.add(t+r[j][1]);
                    }
                      
                }
            }              
        }
        return temp;
    }
    
    
}