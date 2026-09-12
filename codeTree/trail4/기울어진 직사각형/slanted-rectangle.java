import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int maxSum = 0;
        
        for (int r = 2; r < n; r++) {
            for (int c = 1; c < n - 1; c++) {
                int maxW = Math.min(n - 1 - c, r - 1);
                for (int w = 1; w <= maxW; w++) {
                    int maxH = Math.min(c, r - w);
                    for (int h = 1; h <= maxH; h++) {
                        
                        int sum = 0;
                        int currR = r, currC = c;
                        
                        for (int i = 0; i < w; i++) {
                            currR--; currC++;
                            sum += grid[currR][currC];
                        }
                        
                        for (int i = 0; i < h; i++) {
                            currR--; currC--;
                            sum += grid[currR][currC];
                        }
                        
                        for (int i = 0; i < w; i++) {
                            currR++; currC--;
                            sum += grid[currR][currC];
                        }
                        
                        for (int i = 0; i < h; i++) {
                            currR++; currC++;
                            sum += grid[currR][currC];
                        }
                        
            
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }
        
        System.out.println(maxSum);
    
    }
}