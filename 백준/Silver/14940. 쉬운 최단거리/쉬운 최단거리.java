import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static int n;
    static int m;
    static int[][] route;
    static int[][] dist;
    static int[][] move = {{1,0},{-1,0},{0,1},{0,-1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        route = new int[n][m];
        dist  = new int[n][m];

        int startX = 0, startY = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                route[i][j] = Integer.parseInt(st2.nextToken());

                if (route[i][j] == 2) {      // 시작점
                    startX = i;
                    startY = j;
                    dist[i][j] = 0;
                } else if (route[i][j] == 0) {
                    dist[i][j] = 0;          // 못 가는 땅은 결과도 0
                } else { // route[i][j] == 1
                    dist[i][j] = -1;         // 갈 수 있는 땅, 아직 미방문
                }
            }
        }

        bfs(startX, startY);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    sb.append(dist[i][j]);
                } else {
                    sb.append(dist[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int a, int b) {
        LinkedList<int[]> q = new LinkedList<>();

        q.add(new int[]{a, b});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + move[i][0];
                int ny = y + move[i][1];

                // 범위 체크
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                // 못 가는 땅(0)은 스킵
                if (route[nx][ny] == 0) continue;

                // 이미 방문한 칸이면 스킵
                if (dist[nx][ny] != -1) continue;

                dist[nx][ny] = dist[x][y] + 1;
                q.add(new int[]{nx, ny});
            }
        }
    }
}
