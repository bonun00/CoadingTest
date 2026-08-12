import java.util.*;
class Solution {
    
    int[] p;
    
    
    public int solution(int n, int[][] computers) {
        
        p=new int[n];
        for(int i=0; i<n; i++){
            p[i]=i;   
        }
        for(int i=0; i<computers.length;i++){
            int[] c=computers[i];
            for(int j=0; j<computers.length; j++){
                if(j!=i&&c[j]==1){
                    union(i,j);
                } 
            }
        }

        Set<Integer> answer=new HashSet<>();
        
        for(int a:p){
            answer.add(find(a));
        }
        
        return answer.size();
        

    }

    public void union(int a, int b){
        if(find(a)!=find(b)){
            p[find(b)]=find(a);
        }
    }
    
    public int find(int a){
        if(p[a]==a){
            return a;
        }else{
            return p[a]=find(p[a]);
        }
        
        
    }
}




// class Solution {
//     int answer=0;
//     boolean[] visited;
    
//     public int solution(int n, int[][] computers) {
//         visited=new boolean[n];
//         for(int i=0;i<n;i++){ 
//             if(!visited[i]){
//             dfs(n,i,computers);
//             answer++;
//             }
//         }
//         return answer;
//     }
    
//     public void dfs(int n , int start, int[][] computers){
//         visited[start]=true;
//         for(int i=0; i<n; i++){
//             if(i==start) continue;
//             if(!visited[i]&&computers[start][i]==1){
//                 dfs(n,i,computers);
//             }
//         }
//     }
    
    
// }