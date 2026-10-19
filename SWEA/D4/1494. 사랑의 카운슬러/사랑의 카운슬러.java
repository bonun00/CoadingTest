import java.util.*;
import java.io.FileInputStream;

class Solution
{

    static int n;
    static int[][] arr;
    static boolean [] sel;
    static long ans;

    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            n=sc.nextInt();

           arr=new int[n][2];
            sel=new boolean[n];
           for(int i=0; i<n; i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                arr[i][0]=a;
                arr[i][1]=b;

            }

           ans=Long.MAX_VALUE;

           dfs(0,0);
           System.out.println("#"+test_case+" "+ans);


        }



    }

    static void dfs(int depth,int cnt){
        if(depth==n/2){
           long x=0,y=0;
            for(int i=0; i<n; i++){
                if(sel[i]){
                    x+=arr[i][0];
                    y+=arr[i][1];
                }else{
                    x-=arr[i][0];
                    y-=arr[i][1];
                }


           }
            ans=Math.min(ans,x*x+y*y);

            return;
        }

        for(int i=cnt; i<n; i++){
            sel[i]=true;
            dfs(depth+1,i+1);
            sel[i]=false;
        }


    }

}