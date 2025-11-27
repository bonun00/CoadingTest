import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int max=200000;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if(N>=M){
            System.out.println(N-M);
            return;
        }


        System.out.println( bfs());

    }

    static int bfs() {
        int[] dist = new int[max+1];
        Arrays.fill(dist, -1);
        Queue<Integer> list = new LinkedList<>();
        list.add(N);
        dist[N] = 0;
        while (!list.isEmpty()) {
            int cur = list.poll();
            if (cur == M) {
                return dist[cur];
            }
            int[] move = {cur - 1, cur + 1, cur * 2};

            for (int m : move) {
                if (m < 0 || m > max)
                    continue;
                if (dist[m] == -1) {
                    dist[m] = dist[cur] + 1;
                    list.add(m);
                }

            }
        }
        return -1;
    }

}
