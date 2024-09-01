import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Collections.max;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        long len = Integer.parseInt(input[0]);
        long num = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            list.add(Integer.parseInt(reader.readLine()));

        }
        long start = 1;
        long end = max(list);
        long ans = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long result = 0;
            for (int i = 0; i < len; i++) {
                result += (list.get(i) / mid);
            }
            if (result >= num) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        System.out.println(ans);
    }
}