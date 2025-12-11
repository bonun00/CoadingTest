

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> h = new LinkedList<>();
        int min = Integer.MAX_VALUE;


        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int aa = Math.abs(a);
            int bb = Math.abs(b);
            if (aa == bb) {
                return a - b;
            } else {
                return aa -bb ;
            }

        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp != 0) {
                pq.add(temp);
            }
            if (temp == 0 && pq.isEmpty()) {
                sb.append(0).append("\n");
            } else if (temp == 0) {
                sb.append(pq.poll()).append("\n");
            }

        }
        System.out.println(sb);
    }
}





