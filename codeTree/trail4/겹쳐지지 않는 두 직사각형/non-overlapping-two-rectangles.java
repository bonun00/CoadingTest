import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
     List<Rect> rects = new ArrayList<>();

    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = j; l < m; l++) {
                        
                        int currentSum = 0;
                        for (int r = i; r <= k; r++) {
                            for (int c = j; c <= l; c++) {
                                currentSum += grid[r][c];
                            }
                        }
                        rects.add(new Rect(i, j, k, l, currentSum));
                        
                    }
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        int size = rects.size();


        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                Rect r1 = rects.get(i);
                Rect r2 = rects.get(j);

                if (!isOverlapped(r1, r2)) {
                    ans = Math.max(ans, r1.sum + r2.sum);
                }
            }
        }


        System.out.println(ans);
    }


    static class Rect {
        int x1, y1, x2, y2;
        int sum;

        public Rect(int x1, int y1, int x2, int y2, int sum) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.sum = sum;
        }
    }



    static boolean isOverlapped(Rect r1, Rect r2) {
        if (r1.x2 < r2.x1 || r2.x2 < r1.x1) {
            return false;
        }
 
        if (r1.y2 < r2.y1 || r2.y2 < r1.y1) {
            return false;
        }

        return true; 
    }
}