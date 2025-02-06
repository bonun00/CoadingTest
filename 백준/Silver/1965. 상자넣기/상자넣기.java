import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int[] num = new int[len];
        int[] dp = new int[len];
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
            for (int u = 0; u < i; u++) {
                if (num[i] > num[u]) {
                    dp[i] = Math.max(dp[i], dp[u]+1);
                }
            }
            result=Math.max(result,dp[i]);
        }
        System.out.println(result);

    }
}

