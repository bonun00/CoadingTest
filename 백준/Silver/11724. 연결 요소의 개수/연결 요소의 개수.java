
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
        static int [][] l;
        static boolean[] visited;
        static  ArrayList<ArrayList<Integer>> list;
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st=new StringTokenizer(reader.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            l=new int[M][2];
            list=new ArrayList<>();
            visited=new boolean[N+1];

            for(int i=0;i<=N;i++){
                list.add(new ArrayList<>());
            }

            for(int i=0; i<M; i++){
                StringTokenizer st2=new StringTokenizer(reader.readLine());
                int a=Integer.parseInt(st2.nextToken());
                int b=Integer.parseInt(st2.nextToken());
                list.get(a).add(b);
                list.get(b).add(a);
            }
            int answer=0;
            for(int i=1;i<=N;i++){
                if (!visited[i]){
                    dfs(i);
                    answer++;
                }
            }
            System.out.println(answer);
        }

        static void dfs(int i){

            visited[i]=true;

            for(int next:list.get(i)){
                if(!visited[next]){
                    dfs(next);
                }
            }

        }


    }

