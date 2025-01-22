import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        int[] up = new int [len+1];
        StringTokenizer st =new StringTokenizer(reader.readLine());

        int[] dp=new int[len+1];

        for (int i=0; i<len; i++) {
            up[i] = Integer.parseInt(st.nextToken());
            dp[i] =1;
        }
        
        int result =0;

        for(int i=0; i<len; i++){
            for(int u=0; u<i; u++) {
                if (up[i] < up[u]) {
                    dp[i] =Math.max(dp[i], dp[u]+1);
                }
            }
            result= Math.max(result,dp[i]);
        }
        System.out.println(result);
    }
}

