class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int num=1;
        for(int i=2; i<=a; i++){
            if(a%i==0&&b%i==0){
                num=i;
            }
        }
        b=b/num;
        while(b>1){
            if(b%2==0){
            b/=2;
            }else if(b%5==0){
                b/=5;
            }else{
                answer=2;
                break;
        }
    }
    return answer;
    }
}