import java.util.Scanner;
public class Main {
    static int[][] grid;
    static int[][]  g1={{-1,1},{-1,-1},{1,-1},{1,1}};
    static int[][]  g2={{-1,-1},{-1,1},{1,1},{1,-1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
   
        int r = sc.nextInt();
        int c = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int dir = sc.nextInt();
        
    
      
        if(dir==0){
            int temp=grid[r-1][c-1];
            int[] q=move1(m4,0,r-1,c-1);
            q=move1(m3,1,q[0],q[1]);
            q=move1(m2,2,q[0],q[1]);
            move1(m1-1,3,q[0],q[1]);
            grid[r+g2[1][0]-1][c+g2[1][1]-1]=temp;
        }else{
            int temp=grid[r-1][c-1];
            int[] q=move2(m1,0,r-1,c-1);
            q=move2(m2,1,q[0],q[1]);
            q=move2(m3,2,q[0],q[1]);
            move2(m4-1,3,q[0],q[1]);
            grid[r+g1[1][0]-1][c+g1[1][1]-1]=temp;

            
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(grid[i][j]+" ");

            }
            System.out.println();
        }

    }
    static int[] move1(int m, int z,int mr, int mc){
        for(int j=0; j<m; j++){
            mr+=g2[z][0];
            mc+=g2[z][1];
            grid[mr-g2[z][0]][mc-g2[z][1]]=grid[mr][mc];
    
        }
        return new int[]{mr, mc};
    }
    static int[] move2(int m, int z,int mr, int mc){
        for(int j=0; j<m; j++){
            mr+=g1[z][0];
            mc+=g1[z][1];
            grid[mr-g1[z][0]][mc-g1[z][1]]=grid[mr][mc];
    
        }
        return new int[]{mr, mc};
    }

}