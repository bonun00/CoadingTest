class Solution {
    public int solution(int[] nums) {
        int answer=0;
        int len = nums.length;
        for(int i=0;i<len; i++){
            for(int u=i+1; u<len; u++){
                for(int j=u+1; j<len; j++){
                    int temp=nums[i]+nums[u]+nums[j];
                    if(isPrime(temp)){
                        answer++;
                    }
                
                }
            }
        }
        return answer;
    }
    public boolean isPrime(int num){
        if(num==2) return true;
        for(int i=2;i<=(int)Math.sqrt(num); i++){
            if(num%i==0)return false;
        }
        return true;
    }
}