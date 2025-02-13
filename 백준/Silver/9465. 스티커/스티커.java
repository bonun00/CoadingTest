import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());

        for (int i = 0; i < len; i++) {
            int stic = Integer.parseInt(reader.readLine());
            StringTokenizer st = new StringTokenizer(reader.readLine());


            int[][] pic = new int[2][stic+1];
            int[][] dp = new int[2][stic+1];

            for (int u = 0; u < stic; u++) {
                pic[0][u] = Integer.parseInt(st.nextToken());
            }
            StringTokenizer st2 = new StringTokenizer(reader.readLine());
            for (int u = 0; u < stic; u++) {
                pic[1][u] = Integer.parseInt(st2.nextToken());
            }


            dp[0][0] = pic[0][0];
            dp[1][0] = pic[1][0];

            if (stic > 1) {
                dp[0][1] = pic[0][1] + dp[1][0];
                dp[1][1] = pic[1][1] + dp[0][0];
            }

            for (int j = 2; j <=stic; j++) {
                dp[0][j]=Math.max(dp[1][j-1],dp[1][j-2])+pic[0][j];
                dp[1][j]=Math.max(dp[0][j-1],dp[0][j-2])+pic[1][j];
            }
            System.out.println(Math.max(dp[0][stic-1], dp[1][stic-1]));

        }

    }

}


