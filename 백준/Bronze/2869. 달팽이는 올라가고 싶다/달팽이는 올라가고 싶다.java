import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int plus = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());

        int result =(len-minus)/(plus-minus);

        if((len-minus)%(plus-minus)!=0){
            result++;
        }
        System.out.println(result);
    }
}
