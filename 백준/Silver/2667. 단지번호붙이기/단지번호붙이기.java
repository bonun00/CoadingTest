

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int num;
    static int[][] apt;
    static boolean[][] visited;
    static int r=1;
    static List<Integer> result=new ArrayList<>();
    static int[][] move={{1,0},{-1,0},{0,1},{0,-1}};

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        num= Integer.parseInt(br.readLine());
        apt =new int[num][num];
        visited=new boolean[num][num];
        for(int i =0; i<num; i++){
            String a= br.readLine();
            for(int j=0; j<num; j++){
                apt[i][j]=Integer.parseInt(a.charAt(j)+"");
            }
        }
        for(int i =0; i<num; i++){
            for(int j=0; j<num; j++){
                if(visited[i][j])continue;
                if(apt[i][j]==0)continue;
                bfs(i,j);
                if(r!=0) result.add(r);
                r=1;
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for(int r : result ){
            System.out.println(r);
        }


    }
    static void bfs(int a,int b){
        LinkedList<int[]> q=new LinkedList<>();

        visited[a][b]=true;
        q.add(new int[] {a,b});

        while(!q.isEmpty()){
            int[] cur=q.poll();
            for (int[] m:move) {
                int x=cur[0]+m[0];
                int y=cur[1]+m[1];
                if(x<0||y<0||x>=num||y>=num){continue;}
                if(visited[x][y])continue;
                if (apt[x][y]==0)continue;
                visited[x][y]=true;
                r++;
                q.add(new int[] {x,y});

            }



        }


    }


}


