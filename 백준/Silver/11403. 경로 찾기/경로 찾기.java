

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.List;

public class Main {

    static int N;
    static int[][] result;
    static ArrayList<Integer> [] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        result=new int[N][N];
        graph=new ArrayList[N];


        for(int i=0;i<N;i++){
            graph[i]=new ArrayList<>();
        }


        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                int temp=Integer.parseInt(st.nextToken());
                if(temp==1){
                    graph[i].add(j);
                }

            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(bfs(i,j)){
                    result[i][j]=1;
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }


    static boolean bfs(int a,int b){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(a);
        visited=new boolean[N];

        while(!l.isEmpty()){
            int cur=l.poll();
            List<Integer>temp= graph[cur];
            if(visited[cur])continue;
            visited[cur]=true;
            if(temp.contains(b)){
                return true;
            }else{
                l.addAll(temp);
            }
        }
        return false;
    }
}
// (0, 1) (1,2), (2,0)