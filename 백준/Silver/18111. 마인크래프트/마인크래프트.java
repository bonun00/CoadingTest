import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] mc = new int[N][M];

        int minH = 256;
        int maxH = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < M; j++) {
                mc[i][j] = Integer.parseInt(st.nextToken());
                minH = Math.min(minH, mc[i][j]);
                maxH = Math.max(maxH, mc[i][j]);
            }
        }

        int resultTime = Integer.MAX_VALUE;
        int resultHeight = 0;
        for (int h = 0; h <= 256; h++) {
            int time = 0;
            int inventory = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = mc[i][j] - h;

                    if (diff > 0) {
               
                        time += 2 * diff;
                        inventory += diff;
                    } else if (diff < 0) {
                 
                        int need = -diff;
                        time += need;
                        inventory -= need;
                    }
                }
            }

            if (inventory < 0) {
                // 블록이 부족해서 이 높이는 불가능
                continue;
            }

            if (time < resultTime || (time == resultTime && h > resultHeight)) {
                resultTime = time;
                resultHeight = h;
            }
        }

        System.out.println(resultTime + " " + resultHeight);
    }
}