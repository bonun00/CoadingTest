
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

public class Solution {

    static int [][] route;
    static int [][] best;
    static int size;
    static int answer;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for(int i=1;i<=n;i++) {
            size=Integer.parseInt(reader.readLine());
            route=new int[size][size];
            for(int j=0;j<size;j++) {
                String[] temp=reader.readLine().split("");
                for(int k=0;k<size;k++) {
                    route[j][k]=Integer.parseInt(temp[k]);
                }
            }

            best=new int[size][size];
            for(int j=0;j<size;j++) {
                for (int k = 0; k < size; k++) {
                    best[j][k] = Integer.MAX_VALUE;
                }
            }
            answer=Integer.MAX_VALUE;
            dfs(0,0,0);
            System.out.println("#"+i+" "+answer);
        }
    }


    public static void dfs(int x, int y,int time){
        if(time>=best[x][y]) return;
        best[x][y]=time;


        if(x==size-1 && y==size-1) {
            if(time<answer) {
                answer=time;
            }
            return;
        }

            if(y+1<size) {
                dfs(x,y+1,time+route[x][y+1]);
            }
            if(x+1<size) {
                dfs(x+1,y,time+route[x+1][y]);
            }
            if(x-1>=0) {
                dfs(x-1,y,time+route[x-1][y]);
            }
            if(y-1>=0) {
                dfs(x,y-1,time+route[x][y-1]);
            }






    }
}




