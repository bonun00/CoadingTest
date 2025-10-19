import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001]; // 값의 범위가 1~10000

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            count[x]++;
        }

        // 작은 수부터 개수만큼 출력
        for (int v = 1; v <= 10000; v++) {
            int c = count[v];
            while (c-- > 0) {
                bw.write(Integer.toString(v));
                bw.newLine();
            }
        }
        bw.flush();
    }
}