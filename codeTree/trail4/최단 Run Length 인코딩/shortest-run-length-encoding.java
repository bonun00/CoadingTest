import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char[] a=A.toCharArray();
        int len= A.length();
        int ans=Integer.MAX_VALUE;
        if(len==1){
            ans=2; 
        }else{
            for(int i=1; i<len; i++){
                String temp="";
                for(int j=i; j<len; j++){
                    temp+=a[j];
                }

                for(int j=0; j<i; j++){
                    temp+=a[j];
                }
                
                ans=Math.min(rle(temp).length(),ans);
                // System.out.println(rle(temp));

            }
        }

        System.out.println(ans);




    }


    static String rle(String a){
        String ans="";
        char[] ch =a.toCharArray();

        char temp=ch[0];
        ans+=temp;
        int cnt=1;
        int idx=1;
        while(idx!=a.length()){
            if(temp==ch[idx]){
                cnt++;
            }else{
                ans+=cnt;
                temp=ch[idx];
                ans+=temp;
                cnt=1;
             
            }
            idx++;
        }

        return ans+cnt;
            

    }

}