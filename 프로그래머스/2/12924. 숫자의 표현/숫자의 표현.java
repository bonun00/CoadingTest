class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum=0;
        for(int i=1; i<n/2+1; i++){
            int temp=i;
            while(sum<n){
                sum+=temp;
                temp++;
            }
            if(sum==n){
                answer++;
            }
            sum=0;
        }
        
        return answer;
    }
}