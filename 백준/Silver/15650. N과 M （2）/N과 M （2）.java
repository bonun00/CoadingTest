import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean visit[];
    public static int[] arr;
    public static StringBuilder result= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        int N =Integer.parseInt(input.split(" ")[0]);
        int M =Integer.parseInt(input.split(" ")[1]);
        visit=new boolean[N];
        arr=new int[M];

        dfs(N,M,0,1);
        System.out.println(result);

    }public static void dfs(int N,int M, int depth,int num){

        if(depth==M){
            for(int val: arr){

                result.append(val).append(' ');
            }
            result.append('\n');
            return;
        }
        for(int i=num; i<=N;i++){
            arr[depth]=i;
            dfs(N,M,depth+1,i+1);

            }

    }
}