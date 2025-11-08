

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Main {
        static int[] answer;
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());

            for(int i = 0; i < n; i++) {
                int f = Integer.parseInt(reader.readLine());
                int [][] dp=new int[f+1][2];
                dp[0][0]=1;dp[0][1]=0;
                if(1<=f) {
                    dp[1][0] = 0;
                    dp[1][1] = 1;

                    for (int j = 2; j <= f; j++) {
                        dp[j][0] = dp[j - 2][0] + dp[j - 1][0];
                        dp[j][1] = dp[j - 2][1] + dp[j - 1][1];
                    }
                }
                System.out.println(dp[f][0]+" "+dp[f][1]);



            }
        }

    }

