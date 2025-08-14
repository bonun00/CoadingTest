import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
       
        int[] a ={1,2,3,4,5};
        int[] b ={2,1,2,3,2,4,2,5};
        int[] c ={3,3,1,1,2,2,4,4,5,5};
        int an=0; int bn=0; int cn=0;
        int ao=0; int bo=0; int co=0;
        for(int i =0; i<answers.length; i++){
            if(a[ao]==answers[i])an++;
            if(b[bo]==answers[i])bn++;
            if(c[co]==answers[i])cn++;
            ao++;bo++;co++;
            if(ao>a.length-1)ao=0;
            if(bo>b.length-1)bo=0;
            if(co>c.length-1)co=0;
        }
        int maxnum=Math.max(an, Math.max(bn,cn));
        List<Integer> list= new ArrayList<>();
        if(maxnum==an)list.add(1);
        if(maxnum==bn)list.add(2);
        if(maxnum==cn)list.add(3);
        

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}