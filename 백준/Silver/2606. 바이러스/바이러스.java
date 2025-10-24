import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[][] num;
    static boolean[] virus;
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int com= Integer.parseInt(reader.readLine());
        int line= Integer.parseInt(reader.readLine());
        num= new int[line+1][2];

        for(int i=0;i<line;i++){
            StringTokenizer st = new StringTokenizer(reader.readLine());
            num[i][0]=Integer.parseInt(st.nextToken());
            num[i][1]=Integer.parseInt(st.nextToken());

        }
            virus= new boolean[com+1];
            virus[1]=true;
            dfs(1);
        int answer= -1;
        for(boolean b:virus){
            if(b){
                answer++;
            }
        }

        System.out.println(answer);

    }
    public static void dfs (int n){
        virus[n]=true;
        for (int i=0;i<num.length;i++){
            int a=num[i][0];
            int b=num[i][1];
            if(a==n&&!virus[b])dfs(b);
            if (b==n&&!virus[a])dfs(a);


        }

    }



}

