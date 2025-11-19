

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

        static int N;
        static int M;
        static char[][] school;
        static boolean[][] visited;
        static int[][] move={{0,1},{0,-1},{1,0},{-1,0}};
        static int result=0;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            school = new char[N][M];
            visited = new boolean[N][M];
            int[] start=new int[2];
            for (int i = 0; i < N; i++) {
                String temp= br.readLine();
                for (int j = 0; j < M; j++) {
                    char c=temp.charAt(j);
                    school[i][j] = c;
                    if(c=='I'){
                        start[0]=i;
                        start[1]=j;
                    }

                }
            }

            dfs(start[0],start[1]);

            // bfs(start[0],start[1]);
            System.out.println(result==0?"TT":result);
        }
    static void dfs(int x, int y){
        if(visited[x][y]||school[x][y]=='X')return;
        visited[x][y]=true;

        if(school[x][y]=='P') result++;

        for(int i=0;i<4;i++){
            int nx=x+move[i][0];
            int ny=y+move[i][1];
            if(nx<N&&nx>=0&&ny<M&&ny>=0)dfs(nx,ny);
        }


    }





        }




    
