import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        int[] answer = new int[len];
        long[] num = new long[101];
        for (int i = 0; i < len; i++) {
            answer[i] = Integer.parseInt(reader.readLine());

            for (int u = 7; u <= answer[i]; u++) {
                num[1] = 1;
                num[2] = 1;
                num[3] = 1;
                num[4] = 2;
                num[5] = 2;
                num[6] = 3;
                num[u] = num[u - 1] + num[u - 5];

            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(num[answer[i]]);
        }


    }
}

