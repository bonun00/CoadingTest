

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int[] size=new int[6];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<6;i++){
            size[i]=Integer.parseInt(st.nextToken());
        }
        StringTokenizer st2=new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st2.nextToken());
        int p=Integer.parseInt(st2.nextToken());


        int answerT=0;

        for(int s:size){
            int T=1;
            if(s==0)continue;
            while(t*T<s){
                T++;
            }
            answerT+=T;

        }
        int P1=n/p;
        int P2=n%p;

        System.out.println(answerT);
        System.out.println(P1+" "+P2);



    }

}


