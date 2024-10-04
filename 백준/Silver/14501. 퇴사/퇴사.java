import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        StringTokenizer st;
        int[] T = new int[len];
        int[] P = new int[len];
        for (int i = 0; i < len; i++) {
            st = new StringTokenizer(reader.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        int[]dp=new int[len+1];
        for(int i=0; i<len; i++) {
            if (i + T[i] <= len) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
            dp[i +1]=Math.max(dp[i+1],dp[i]);

        }
        System.out.println(dp[len]);
    }
}