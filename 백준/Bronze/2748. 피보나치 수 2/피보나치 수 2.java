import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());

        long[] dp = new long[len + 1];

        dp[0] = 0;
        dp[1] = 1;
        if (len == 0) {
            System.out.println(0);
        } else if (len == 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i <= len; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            System.out.println(dp[len]);
        }
    }
}

