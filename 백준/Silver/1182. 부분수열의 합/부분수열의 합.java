import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
public class Main {
    static int len, sum,result=0;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(reader.readLine());
         len = Integer.parseInt(st.nextToken());
         sum = Integer.parseInt(st.nextToken());
         arr= new int[len];
        st = new StringTokenizer(reader.readLine());
        for(int i =0; i<len; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        dfs(0,0);
        if (sum == 0) {
            System.out.println(result - 1);
        } else {
            System.out.println(result);
        }
        }
        public static void dfs(int depth,int num){

        if(depth==len){
            if(sum==num) result++;
            return;
        }
        dfs(depth+1,num+arr[depth]);
        dfs(depth+1,num);
    }


    }
