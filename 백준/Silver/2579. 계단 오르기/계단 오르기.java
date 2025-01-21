import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        int[] up = new int [len+1];
        for(int i =1; i <=len; i++){
             up[i]=Integer.parseInt(reader.readLine());
        }
        int[] dp= new int[len+1];
        dp[0]=0;
        dp[1]=up[1];
        if (len>=2){
        dp[2]=up[1]+up[2];
        }
        if (len>2){
            for(int i =3; i<=len; i++){
                dp[i]=Math.max(dp[i-2],dp[i-3]+up[i-1])+up[i];
            }
        }

        System.out.println(dp[len]);
        
    }
}

