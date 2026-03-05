

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static int[][] numPad;
    static int[][] move={{0,1},{1,0},{-1,0},{0,-1}};
    static Set<String> s;


    public static void main(String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numPad=new int[5][5];
        s= new HashSet<>();

        for(int i=0; i<5; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                numPad[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        for(int j=0; j<5; j++){
            for(int i=0; i<5; i++){
                dfs(i,j,0,"");
            }
        }
        System.out.println(s.size());

    }


    static void dfs(int x,int y,int count ,String ans ){


        ans+=numPad[x][y];
        if(count==5)
        {
            s.add(ans);
            return;
        };

        for(int i=0; i<4; i++){
            int mx=x+move[i][0];
            int my=y+move[i][1];
            if(mx<0 || my<0 || mx>=5 || my>=5)continue;


            dfs(mx,my,count+1,ans);
        }


    }

}







