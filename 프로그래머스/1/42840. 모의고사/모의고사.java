import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int[] s1={1,2,3,4,5};
        int[] s2={2,1,2,3,2,4,2,5};
        int[] s3={3,3,1,1,2,2,4,4,5,5};
//         int a1=0; int a2=0; int a3=0;
//         int idx1=0; int idx2=0; int idx3=0;
//         for(int a: answers){
//            if(a==s1[idx1++]){
//                a1++;
//            }
//             if(a==s2[idx2++]){
//                a2++;
//            }
//             if(a==s3[idx3++]){
//                a3++;
//            }
//             if(idx1==5) idx1=0;
//             if(idx2==8) idx2=0;
//             if(idx1==10) idx1=0;
            
//         }
        
          int a1 = 0, a2 = 0, a3 = 0;

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == s1[i % 5]) a1++;
            if(answers[i] == s2[i % 8]) a2++;
            if(answers[i] == s3[i % 10]) a3++;
        }
        
        int temp= Math.max(a1,Math.max(a2,a3));
        
        List<Integer> list =new ArrayList<>();
        if(temp==a1) list.add(1);
        if(temp==a2) list.add(2);
        if(temp==a3) list.add(3);
        
        
        return list.stream().mapToInt(i->i).toArray();
    }
}