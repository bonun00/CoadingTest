

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  n = Integer.parseInt(reader.readLine());
            long [] dp=new long[n+1];
            for(int i=1;i<=n;i++) {
                if (i%2==0){
                    dp[i]=(dp[i-1]*2+1)%10007;
                }else{
                    dp[i]=(dp[i-1]*2-1)%10007;
                    dp[1]=1;
                }
            }
            System.out.println(dp[n]);

        }

    }

