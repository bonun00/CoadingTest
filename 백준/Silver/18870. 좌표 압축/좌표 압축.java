
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer,Integer> map=new HashMap<>();
            int[] input=new int[n];
            int[] num =new int[n];

            int p=0;
            for (int i = 0; i < n; i++) {
                int temp=Integer.parseInt(st.nextToken());
                num[i] = temp;
                input[i]=temp;
            }
            Arrays.sort(num);
            for(int i=0;i<n;i++){
                if(map.getOrDefault(num[i],-1)==-1){
                    map.put(num[i],p++);
                }
            }

       StringBuilder sb=new StringBuilder();

          for(int i:input){
              sb.append(map.get(i)+" ");
          }

            System.out.println(sb);






        }


}

