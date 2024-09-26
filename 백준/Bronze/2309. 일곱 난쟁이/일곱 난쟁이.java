import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int one= -1;
        int two=-1;
        List<Integer> arr = new ArrayList();
        for (int i = 0; i < 9; i++) {
            arr.add(Integer.parseInt(reader.readLine()));
            result += arr.get(i);
        }
        for (int i = 0; i < 9; i++) {
            for (int u = i + 1; u < 9; u++) {
                if (result-arr.get(i)-arr.get(u) == 100) {
                    one=i;
                    two=u;
                    break;
                }
            }
            if (one!=-1&&two!=-1) {
                break;
            }
        }

        arr.remove(two);
        arr.remove(one);
        Collections.sort(arr);
        for (int i = 0; i < 7; i++) {
            System.out.println(arr.get(i));
        }
    }

}