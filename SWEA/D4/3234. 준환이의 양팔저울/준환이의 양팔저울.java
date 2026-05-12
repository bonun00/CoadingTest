import java.util.*;
import java.io.*;

class Solution {
    static int n;
    static int[] weight;
    static int ans;
    static boolean[] visited;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int test_case = 1; test_case <= T; test_case++) {
            n = Integer.parseInt(br.readLine().trim());
            weight = new int[n];
            visited = new boolean[n];
            ans = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                weight[i] = Integer.parseInt(st.nextToken());
            }


            dfs(0, 0, 0);

            System.out.println("#" + test_case + " " + ans);
        }
    }

    static void dfs(int depth, int leftSum, int rightSum) {

        if (depth == n) {
            ans++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            

            dfs(depth + 1, leftSum + weight[i], rightSum);


            if (rightSum + weight[i] <= leftSum) {
                dfs(depth + 1, leftSum, rightSum + weight[i]);
            }

            visited[i] = false;
        }
    }
}