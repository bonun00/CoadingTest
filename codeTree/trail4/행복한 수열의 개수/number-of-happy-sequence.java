import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        int ans=0;
        for(int i=0; i<n;i++){
            if(m==1){
                ans=2*n;
                break;
            }
            int cnt=1;
            for(int j=1; j<n; j++){
                if(grid[i][j]==grid[i][j-1]){
                    cnt++;
                    if(cnt>=m){
                        ans++;
                        break;
                    }
                }else{
                    cnt=1;
                }
            }
            cnt=1;
            for(int j=1; j<n; j++){
               if(grid[j][i]==grid[j-1][i]){
                    cnt++;
                    if(cnt>=m){
                        ans++;
                        break;
                    }
                }else{
                    cnt=1;
                }
            }

        }
        System.out.print(ans);
    }
}