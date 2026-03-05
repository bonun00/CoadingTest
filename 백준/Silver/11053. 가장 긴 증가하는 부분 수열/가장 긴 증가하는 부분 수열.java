

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {



    public static void main(String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());
        int[] n=new int[num];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp=new int[num+1];


        for(int j=0;j<num;j++) {

            dp[j]=1;
            for(int i=0;i<j;i++) {
                if(n[i] < n[j] && dp[j] < dp[i] + 1) {
                    dp[j]=dp[i]+1;
                }

            }
        }


        int ans=0;
        for(int d:dp){
            if(ans<d){
                ans=d;
            }
        }
        System.out.println(ans);

    }


}







