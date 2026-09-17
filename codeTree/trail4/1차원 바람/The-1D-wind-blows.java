import java.util.Scanner;

public class Main {
    static int[][] a;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        int q = sc.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int r = sc.nextInt();
            char d = sc.next().charAt(0);
            move(r-1,d);
            boolean up=false;
            boolean down=false;
            for(int j=0; j<m; j++){

                if(0<=r-2&&a[r-1][j]==a[r-2][j]){
                    up=true;
                }
                if(r<n&&a[r-1][j]==a[r][j]){
                    down=true;
                }
            }
            int upR=r-2;
            int upD=d;
            while(up){
                if(upD=='L'){
                    upD='R';
                }else{
                    upD='L';
                }
                if(upR<0)break;
                move(upR,upD);
                boolean flag=true;
                for(int j=0; j<m; j++){

                    if(0<=upR-1&&a[upR][j]==a[upR-1][j]){
                        flag=false;
                    }


                }
                if(flag)break;
                upR--;
            }
            int downR=r;
            while(down){
                if(d=='L'){
                    d='R';
                }else{
                    d='L';
                }
                if(downR>=n)break;
                move(downR,d);
                boolean flag=true;
                for(int j=0; j<m; j++){

                    if(downR+1<n&&a[downR][j]==a[downR+1][j]){
                        flag=false;
                    }

                }
                if(flag)break;

                downR++;
            }

           
        }

         for(int[] x:a){
                for(int y:x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
    }

    static void move(int r, int d ){

        if(d=='L'){
            int temp=a[r][m-1];
            for(int u=m-1; u>0; u--){
                a[r][u]=a[r][u-1];
            }
            a[r][0]=temp;

        }else{
            int temp=a[r][0];

            for(int u=0; u<m-1; u++){
                a[r][u]=a[r][u+1];
            }

            a[r][m-1]=temp;
        }
    }

}