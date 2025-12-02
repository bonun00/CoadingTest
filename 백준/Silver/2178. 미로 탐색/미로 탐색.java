import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] miro;
    static int[][] dist;
    static final int[][] move = {{1,0},{-1,0},{0,1},{0,-1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        miro = new int[n][m];
        dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = s.charAt(j) - '0'; 
                dist[i][j] = -1;               
            }
        }

        bfs(0, 0);

        System.out.println(dist[n - 1][m - 1]);
    }

    static void bfs(int sx, int sy) {
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{sx, sy});
        dist[sx][sy] = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + move[i][0];
                int ny = y + move[i][1];

         
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
     
                if (miro[nx][ny] == 0) continue;
            
                if (dist[nx][ny] != -1) continue;

                dist[nx][ny] = dist[x][y] + 1;
                q.add(new int[]{nx, ny});
            }
        }
    }
}
