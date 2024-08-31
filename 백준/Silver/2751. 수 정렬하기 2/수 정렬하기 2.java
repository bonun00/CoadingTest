import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList();

        for (int i = 0; i < len; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        for(Integer i :list){
            System.out.println(i);
        }
    }
}