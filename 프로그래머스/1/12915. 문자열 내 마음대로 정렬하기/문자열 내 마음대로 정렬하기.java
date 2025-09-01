// class Solution {
//     public String[] solution(String[] strings, int n) {
   
//         for(int i=0; i<strings.length; i++){
//             String ch=strings[i];
//             for(int u=i+1; u<strings.length; u++){
//                 String ch2 = strings[u];
//                 int result =com(ch,ch2,n);
//                 if(result>0){
//                  String temp =strings[i];
//                  strings[i]=strings[u];
//                  strings[u]=temp;
//                 }
                
//             }
//         }
//         return strings;
//     }
//     public int com(String s1, String s2,int n){
//         int l1=s1.split("").length; int l2=s2.split("").length;
//         int c= s1.split("")[n%l1].compareTo(s2.split("")[n%l2]);
//        if(c==0){
//         return s1.compareTo(s2);
//         }
//         return c;
//     }

// }

class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            for (int u = i + 1; u < strings.length; u++) {
                if (com(strings[i], strings[u], n) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[u];
                    strings[u] = temp;
                }
            }
        }
        return strings;
    }

    private int com(String s1, String s2, int n) {
        int c = Character.compare(s1.charAt(n), s2.charAt(n));
        return (c != 0) ? c : s1.compareTo(s2);
    }
}