import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long[] tile = new long[1001];
        int num = Integer.parseInt(reader.readLine());
        for (int u = 1; u <= num; u++) {
            tile[1] = 1;
            tile[2] = 2;
            if (u > 2) {
                tile[u] = (tile[u - 1] + tile[u - 2])%10007;
            }
        }
        System.out.println(tile[num]);
    }

}