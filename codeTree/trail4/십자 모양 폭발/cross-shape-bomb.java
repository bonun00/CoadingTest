import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) grid[i][j] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()) - 1;
        int c = Integer.parseInt(st.nextToken()) - 1;

        int t = grid[r][c] - 1;
        int[][] move = {{1,0},{0,1},{0,-1},{-1,0}};
        grid[r][c] = 0;
        for (int[] d : move) {
            int mr = r, mc = c;
            for (int j = 0; j < t; j++) {
                mr += d[0]; mc += d[1];
                if (mr < 0 || mc < 0 || mr >= n || mc >= n) break; // continue → break
                grid[mr][mc] = 0;
            }
        }

   
        int from = Math.max(0, c - t), to = Math.min(n - 1, c + t);
        for (int col = from; col <= to; col++) {
            int idx = n - 1;
            for (int row = n - 1; row >= 0; row--) {
                if (grid[row][col] > 0) grid[idx--][col] = grid[row][col];
            }
            while (idx >= 0) grid[idx--][col] = 0;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) sb.append(grid[i][j]).append(' ');
            sb.append('\n');
        }
        System.out.print(sb);
    }
}