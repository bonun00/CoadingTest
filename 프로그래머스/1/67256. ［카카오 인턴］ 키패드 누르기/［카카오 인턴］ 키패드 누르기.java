class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] key = new int[10][];
        key[1] = new int[]{0, 0}; key[2] = new int[]{0, 1}; key[3] = new int[]{0, 2};
        key[4] = new int[]{1, 0}; key[5] = new int[]{1, 1}; key[6] = new int[]{1, 2};
        key[7] = new int[]{2, 0}; key[8] = new int[]{2, 1}; key[9] = new int[]{2, 2};
        key[0] = new int[]{3, 1};

        int[] keyl = new int[]{3, 0}; // * 시작
        int[] keyr = new int[]{3, 2}; // # 시작
        
        for(int i=0; i<numbers.length; i++){
            int n =numbers[i];
            if(n==1 || n==4 || n==7){
                answer+="L";
                keyl=key[n];
            }else if(n==3 || n==6 || n==9){
                answer+="R";
                keyr=key[n];
            }else{
                int lenr=len(keyr,key[n]);
                int lenl=len(keyl,key[n]);
                if(lenr>lenl){
                    keyl=key[n];
                    answer+="L";
                }else if(lenr<lenl){
                    keyr=key[n];
                    answer+="R";
                }else{
                    if(hand.equals("right")){
                        keyr=key[n];
                        answer+="R";
                    }else{
                         keyl=key[n];
                         answer+="L";
                    }
                }
                
            }
        }
        
        return answer;
        
    }
     public int len(int[] a, int[] b){
        return Math.abs(a[0]-b[0])+Math.abs(a[1]-b[1]);
    }
}