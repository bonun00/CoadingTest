

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String,Integer> map=new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str =tokenizer.nextToken();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int m=Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
        for (int i = 0; i < m; i++) {
            String num=tokenizer2.nextToken();
            builder.append(map.get(num)==null?0+" ":map.get(num)+" ");

        }
        System.out.println(builder);
    }
}




