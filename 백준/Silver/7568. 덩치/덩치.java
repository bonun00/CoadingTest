import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(reader.readLine());
        }
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int ww = Integer.parseInt(list.get(i).split(" ")[0]);
            int hh = Integer.parseInt(list.get(i).split(" ")[1]);
            for (int u = 0; u < len; u++) {
                int www = Integer.parseInt(list.get(u).split(" ")[0]);
                int hhh = Integer.parseInt(list.get(u).split(" ")[1]);
                if (ww < www && hh < hhh) {
                    result[i]++;
                }

            }
        }
        for (int i = 0; i < len - 1; i++) {
            System.out.print(result[i]+1 + " ");
        }
        System.out.print(result[len-1]+1);
    }
}