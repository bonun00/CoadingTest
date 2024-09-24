import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        int[] plus=new int[12];
        for(int i =1; i<=len; i++) {
            int num=Integer.parseInt(reader.readLine());
            for (int u = 1; u <= num; u++) {
                plus[1] = 1;
                plus[2] = 2;
                plus[3] = 4;
                if (u > 3) {
                    plus[u] = plus[u - 1] + plus[u - 2] + plus[u - 3];
                }
            }
        System.out.println(plus[num]);
    }
    }
}