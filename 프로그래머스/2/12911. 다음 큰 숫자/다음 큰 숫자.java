// class Solution {
//     public int solution(int n) {
//         int num=n;
//         String [] temp = Integer.toBinaryString(n).split("");
//         int count=0;
//         for(String t: temp){
//             if(t.equals("1")){
//                 count++;
//             }
//         }
       
//         while(true){
//         num++;
//         int count2=0;
//         String [] temp2 = Integer.toBinaryString(num).split("");
//         for(String t: temp2){
//             if(t.equals("1")){
//                 count2++;
//             }
//         }
//             if(count==count2)break;
//         }
                
//         return num;
//     }
// }


class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int num = n + 1;

        while (Integer.bitCount(num) != count) {
            num++;
        }

        return num;
    }
}


