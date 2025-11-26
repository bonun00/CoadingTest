import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int answer = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            int sum = bfs(i);   // i번 사람의 케빈 베이컨 수 (= 최단거리 합)
            if (sum < minSum) {
                minSum = sum;
                answer = i;
            }
        }

        System.out.println(answer);
    }

    // start번 사람에서 모든 사람까지의 최단 거리 합을 구하는 BFS
    static int bfs(int start) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        int sum = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int next : graph[cur]) {
                if (dist[next] == -1) {          // 아직 방문 X
                    dist[next] = dist[cur] + 1; // 거리 갱신
                    sum += dist[next];          // 거리 합에 추가
                    q.add(next);
                }
            }
        }

        return sum;
    }
}