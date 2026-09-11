import java.util.Scanner;

public class Main {
    
    static int n, m;
    static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int maxGold = 0;
  

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= 2 * (n - 1); k++) {
                    int numGold = countGold(i, j, k);
                    int cost = getCost(k);
                    if (numGold * m >= cost) {
                        maxGold = Math.max(maxGold, numGold);
                    }
                }
            }
        }

        System.out.println(maxGold);
    }

    static int getCost(int k) {
        return k * k + (k + 1) * (k + 1);
    }

    static int countGold(int row, int col, int k) {
        int goldCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(row - i) + Math.abs(col - j) <= k) {
                    goldCount += grid[i][j];
                }
            }
        }
        return goldCount;
    }
}