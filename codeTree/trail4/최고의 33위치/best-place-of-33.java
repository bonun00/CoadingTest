import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        
        int[][] arr=new int[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int ans=0; 
         for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                int sum=0;
                for(int a=i; a<i+3; a++){
                    for(int b=j; b<j+3; b++){
                        if(arr[a][b]==1)sum++;
                    }
                }
                ans=Math.max(ans,sum);
            }
        }

        System.out.println(ans);
    }
}