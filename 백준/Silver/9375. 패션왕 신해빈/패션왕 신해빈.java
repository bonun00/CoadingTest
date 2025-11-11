

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int  n = Integer.parseInt(reader.readLine());
            for(int i=0;i<n;i++) {
                Map<String,Integer> map = new HashMap<>();
                int cloths=Integer.parseInt(reader.readLine());

                for(int j=0;j<cloths;j++) {
                    StringTokenizer st=new StringTokenizer(reader.readLine());
                    st.nextToken();
                    String b= st.nextToken();
                    map.put(b,map.getOrDefault(b,0)+1);
                }
                int answer=1;
                for (String a:map.keySet()) {
                    answer*=(map.get(a)+1);
                }

                System.out.println(answer-1);


            }

        }

    }

