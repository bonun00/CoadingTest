import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] building = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                building[i][j] = sc.nextInt();
        int[][] queries = new int[q][4];
        for (int i = 0; i < q; i++)
            for (int j = 0; j < 4; j++)
                queries[i][j] = sc.nextInt();

        int[][] move={{1,0},{0,1},{-1,0},{0,-1}};
        boolean[][] visited=new boolean[n][m];

        for(int i=0; i<q; i++){
            int cnt=0;
            int x=queries[i][0]-1;
            int y=queries[i][1]-1;
            int x1=queries[i][0]-1;
            int y1=queries[i][1]-1;
            int x2=queries[i][2]-1;
            int y2=queries[i][3]-1;
            int temp=building[x][y];
            while(true){
                int cx=x;
                int cy=y;
                int nx=cx+move[cnt][0];
                int ny=cy+move[cnt][1];
                if(nx==x1&&ny==y1)break;
                x+=move[cnt][0];
                y+=move[cnt][1];
                if(nx>x2||ny>y2||nx<x1||ny<y1||cx>x2||cy>y2||cx<x1||cy<y1){
                     x-=move[cnt][0];
                     y-=move[cnt][1];
                    cnt++;
                }else{
               
                    building[cx][cy]=building[nx][ny];
                }
          
                
            } 
      
           building[x1][y1+1]=temp;

              building[x1][y1+1]=temp;

            // 평균 계산 (직사각형 내부 전체, 자기 자신 포함, 동시에)
            int[][] tmp = new int[n][m];
            for (int r = x1; r <= x2; r++) {
                for (int c = y1; c <= y2; c++) {
                    int hap = building[r][c];
                    int count = 1;
                    for (int j = 0; j < 4; j++) {
                        int t1 = r + move[j][0];
                        int t2 = c + move[j][1];
                        if (t1 < 0 || t2 < 0 || t1 >= n || t2 >= m) continue;
                        hap += building[t1][t2];
                        count++;
                    }
                    tmp[r][c] = hap / count;
                }
            }
            for (int r = x1; r <= x2; r++)
                for (int c = y1; c <= y2; c++)
                    building[r][c] = tmp[r][c];
        }
                   

         for(int t=0; t<n; t++){
                for(int j=0; j<m; j++){
                    System.out.print(building[t][j]+" ");
                }
             System.out.println();
        }

        

        // Please write your code here.
    }
}