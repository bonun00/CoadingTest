

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] num=new double[N];
        double max=Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            if(max<num[i]){
                max=num[i];
            }
        }
        double sum=0;


        for(int i=0;i<N;i++){
           if(num[i]!=max){
               sum+=(num[i]/max*100.0);

           }else{
               sum+=100;
           }
        }
        System.out.println(sum/N);



    }
}







