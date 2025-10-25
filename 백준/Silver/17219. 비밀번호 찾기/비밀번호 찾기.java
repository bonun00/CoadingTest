

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int f= Integer.parseInt(st.nextToken());

        Map<String,String> map=new HashMap<>();
      

        for(int i=0;i<n;i++){
            st = new StringTokenizer(reader.readLine());
            map.put(st.nextToken(),st.nextToken());
        }
        for (int i=0;i<f;i++){
            st = new StringTokenizer(reader.readLine());
            String find=st.nextToken();
            System.out.println(map.get(find));

        }
    }
}




