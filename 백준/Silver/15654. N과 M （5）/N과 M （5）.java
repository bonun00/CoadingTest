import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int[] arr;
    public static StringBuilder result= new StringBuilder();
    public static boolean visit [];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        int N =Integer.parseInt(input.split(" ")[0]);
        int M =Integer.parseInt(input.split(" ")[1]);
        List<Integer> list = new ArrayList();
        String line=reader.readLine();
        arr=new int [M];
        visit =new boolean[N];
        for(int i =0; i<N;i++) {
            list.add(Integer.parseInt(line.split(" ")[i]));
        }
        Collections.sort(list);
        dfs(N,M,0,list);
        System.out.println(result);

    }public static void dfs(int N,int M, int depth,List list){

        if(depth==M){
            for(int val: arr){

                result.append(val).append(' ');
            }
            result.append('\n');
            return;
        }
        for(int i=0; i<N;i++){
            if(!visit[i]) {
                visit[i]=true;
                arr[depth] = (int) list.get(i);
                dfs(N, M, depth + 1, list);
                visit[i]=false;
            }
            }

    }
}