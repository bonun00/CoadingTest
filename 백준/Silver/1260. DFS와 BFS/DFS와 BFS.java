import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();
    static boolean[] check;
    static int[][] arr;

    static int node, line, start;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];
        for(int i=0; i<line; i++){
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b]=arr[b][a]=1;

        }
        dfs(start);
        sb.append("\n");
        check = new boolean[node+1];
        bfs(start);
        System.out.println(sb);

    }
    public static void dfs(int now){
        check[now]=true;
        sb.append(now+" ");
        for(int i=0; i<=node; i++ ){
            if(arr[now][i]==1 && !check[i]){
                dfs(i);
            }
        }


    }
    public static void bfs(int now){
        q.add(now);
        check[now]=true;
        while(!q.isEmpty()){
            now=q.poll();
            sb.append(now+" ");
            for(int i=0; i<=node; i++){
                if(arr[now][i]==1 && !check[i]){
                    q.add(i);
                    check[i]=true;
                }
            }
        }
    }
}



