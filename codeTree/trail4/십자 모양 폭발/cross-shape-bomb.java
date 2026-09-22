import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
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

        int[][] move={{1,0},{0,1},{0,-1},{-1,0}};
        int t=grid[r][c]-1;
        grid[r][c]=0;
        for(int i=0; i<4; i++){
            int mr=r;
            int mc=c;
            for(int j=0; j<t; j++){
                mr+=move[i][0];
                mc+=move[i][1];
                if(mr<0||mc<0||mr>=n||mc>=n)continue;
                grid[mr][mc]=0;
            }
        }

        for(int i=0; i<n; i++){
            int[] temp=new int[n];
            int idx=n-1; 
            for(int j=n-1; j>=0; j--){
                if(grid[j][i]>0){
                    temp[idx--]=grid[j][i];
                }
            }
             for(int j=0; j<n; j++){
                    grid[j][i]=temp[j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
