import java.util.Scanner;

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
        
        int ans=0; 
        int[][] move={{1,0},{0,1},{0,-1},{-1,0}};
        int[][] move2={{0,1},{-1,0},{0,-1},{1,0},{0,1}};

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int o=0; o<4; o++){
                    int temp=grid[i][j];
                    int x=i;
                    int y=j;
                      for(int u=0; u<2; u++){
                        x+=move[o][0];
                        y+=move[o][1];
                        if(x<0||y<0||x>=n||y>=m){
                            break;
                        }
                        temp+=grid[x][y];

                    }
                    ans=Math.max(ans,temp);
                }
                for(int o=0; o<4; o++){
                    int temp=grid[i][j];
                    int x=i+move2[o][0];
                    int y=j+move2[o][1];
                     if(x<0||y<0||x>=n||y>=m)continue;
                    temp+=grid[x][y];
                    x=i+move2[o+1][0];
                    y=j+move2[o+1][1];
                     if(x<0||y<0||x>=n||y>=m)continue;
                    temp+=grid[x][y];

                    ans=Math.max(ans,temp);
                    
                }
              


            }
        }
        System.out.print(ans);
    }

}