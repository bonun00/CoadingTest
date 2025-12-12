
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] num=new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }

        int ans=0;
        for(int i =0; i<N;i++){
            if(num[i]<2)continue;
            boolean flag=true;
            for (int j=2; j<=Math.sqrt(num[i]); j++){
                if(num[i]%j==0){
                    flag=false;
                }
            }
            if(flag){
                ans++;
            }
        }
        System.out.println(ans);


    }
}







