import java.util.*;

class Solution {
    static char[][] s;
    static int[][] move = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    static boolean[][] out;

    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        int R = storage.length;
        int C = storage[0].length();

        s = new char[R][C];
        out = new boolean[R][C];

        for (int u = 0; u < R; u++) {
            for (int i = 0; i < C; i++) {
                s[u][i] = storage[u].charAt(i);
            }
        }

        for (String req : requests) {
            if (req.length() == 1) {
                bfs(req);
            } else {
                for (int u = 0; u < R; u++) {
                    for (int i = 0; i < C; i++) {
                        if (req.charAt(0) == s[u][i]) out[u][i] = true;
                    }
                }
            }
        }

        for (int u = 0; u < R; u++) {
            for (int i = 0; i < C; i++) {
                if (!out[u][i]) answer++;
            }
        }

        return answer;
    }

    static void bfs(String req) {
        int R = s.length;
        int C = s[0].length;
        List<int[]> remove = new ArrayList<>();
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[R][C];

        char target = req.charAt(0);

        // 1. 테두리에서 시작점 찾기
        for (int i = 0; i < R; i++) {
            for (int u = 0; u < C; u++) {
                if (i == 0 || i == R - 1 || u == 0 || u == C - 1) {
                    if (out[i][u]) {
                        if (!visited[i][u]) {
                            q.add(new int[]{i, u});
                            visited[i][u] = true;
                        }
                    } else if (s[i][u] == target) {
                        remove.add(new int[]{i, u});
                        visited[i][u] = true; 
                    }
                }
            }
        }

        // 2. 외부 탐색
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            for (int i = 0; i < 4; i++) {
                int mx = x + move[i][0];
                int my = y + move[i][1];

                if (mx < 0 || my < 0 || mx >= R || my >= C || visited[mx][my]) continue;

                if (out[mx][my]) {
                    q.add(new int[]{mx, my});
                    visited[mx][my] = true;
                } else if (s[mx][my] == target) {
                    remove.add(new int[]{mx, my});
                    visited[mx][my] = true;
                }
            }
        }

        // 3. 찾은 컨테이너들 일괄 제거
        for (int[] r : remove) {
            out[r[0]][r[1]] = true;
        }
    }
}