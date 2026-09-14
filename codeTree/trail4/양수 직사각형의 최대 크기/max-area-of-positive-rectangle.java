import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
    
        int ans=-1;


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                for(int a=i; a<n; a++){
                    for(int b=j; b<m; b++){

                        boolean flag=true;
                        for(int c=i; c<=a; c++){
                            for(int d=j; d<=b; d++){
                                if(grid[c][d]<=0){
                                    flag=false;
                                    break;
                                }
                            }
                            if(!flag)break;
                        }
                        if(flag){
                            int temp=(a-i+1)*(b-j+1);
                            ans=Math.max(temp,ans);
                        }
                    }
                }


            }


        }
        System.out.print(ans);

    }
}