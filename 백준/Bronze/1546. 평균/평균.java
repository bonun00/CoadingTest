import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] num = new double[N];
        double max = 0;

        for (int i = 0; i < N; i++) {
            num[i] = Double.parseDouble(st.nextToken());
            if (num[i] > max) max = num[i];
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (num[i] / max) * 100.0;
        }

        System.out.println(sum / N);
    }
}
