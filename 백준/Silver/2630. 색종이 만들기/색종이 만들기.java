

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        static int[][] paper;
        static int b=0;
        static int w=0;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            paper = new int[n][n];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    paper[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            dfs(0,0,n);

            System.out.println(w);
            System.out.println(b);


        }

        static void dfs(int x,int y, int n){

            int first=paper[x][y];
            boolean s=false;

            for(int i=x;i<x+n;i++){
                for(int j=y;j<y+n;j++){
                    if(paper[i][j]!=first){
                        s=true;
                        break;
                    }
                }
                if(s){
                    break;
                }
            }
            if(!s){
                if(first==1){
                    b++;
                }
                if (first==0){
                    w++;
                }
                return;
            }
            int half=n/2;
            dfs(x,y,half);
            dfs(x+half,y,half);
            dfs(x,y+half,half);
            dfs(x+half,y+half,half);
        }




}

