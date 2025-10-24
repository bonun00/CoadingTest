
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[][] game;
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(reader.readLine());
        game =new int[num+1][num+1];
        visited = new boolean[num+1][num+1];
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(reader.readLine());
           for(int j=0;j<num;j++){
               game[i][j]=Integer.parseInt(st.nextToken());
           }
        }
        dfs(0,0,num);
        System.out.println(visited[num-1][num-1]?"HaruHaru":"Hing");
    }

    public static void dfs(int x,int y,int max){


        if( x<max && y<max&&!visited[y][x]) {
            int now=game[y][x];
            visited[y][x] = true;
            dfs(x + now, y, max);
            dfs(x , y+now, max);
        }


        }

    }




