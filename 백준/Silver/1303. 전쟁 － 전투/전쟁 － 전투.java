import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

        static boolean [][] visited;
        static String[][] war;
        static int w=0;
        static int b=0;
        static int[][] m={{1,0},{0,1},{-1,0},{0,-1}};
        static int n=0;
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st=new StringTokenizer(reader.readLine());
            int M=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());

            visited =new boolean[N][M];
            war=new String[N][M];
            for(int i=0;i<N;i++){
               String temp=reader.readLine();
                for(int j=0;j<M;j++){
                    war[i][j]=temp.split("")[j];
                }
            }


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (!visited[i][j] & "W".equals(war[i][j])) {
                        dfs(i, j,"W");
                        w+=(n*n);
                        n=0;
                    }else if(!visited[i][j] & "B".equals(war[i][j])){
                        dfs(i, j,"B");
                        b+=(n*n);
                        n=0;
                    }
                }
            }

            System.out.println(w + " " + b);

        }

        static void dfs(int i,int j,String t) {
            if (visited[i][j])return;

            visited[i][j] = true;
            n++;

            for (int k = 0; k < 4; k++) {
                int a = i + m[k][0];
                int b = j + m[k][1];
                if (a >= 0 && a < war.length && b >= 0 && b < war[0].length) {
                    if(war[a][b].equals(t))dfs(a, b,t);
                }
            }
        }


}

