import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static int[] arr;
    public static StringBuilder result= new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        int N =Integer.parseInt(input.split(" ")[0]);
        int M =Integer.parseInt(input.split(" ")[1]);
        arr=new int[M];

        dfs(N,M,0);
        System.out.println(result);

    }public static void dfs(int N,int M, int depth){

        if(depth==M){
            for(int val: arr){

                result.append(val).append(' ');
            }
            result.append('\n');
            return;
        }
        for(int i=0; i<N;i++){
            arr[depth]=i+1;
            dfs(N,M,depth+1);

            }

    }
}