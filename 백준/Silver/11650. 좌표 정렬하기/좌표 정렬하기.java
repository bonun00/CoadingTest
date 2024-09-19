import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());  // 좌표의 개수를 입력받음
        List<int[]> points = new ArrayList<>();

        // 좌표를 입력받아 리스트에 저장
        for (int i = 0; i < len; i++) {
            String[] input = reader.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            points.add(new int[]{x, y});
        }

        // x값을 기준으로 정렬하고, x값이 같으면 y값을 기준으로 정렬
        Collections.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); // x값이 같으면 y값 비교
            }
            return Integer.compare(a[0], b[0]); // x값 비교
        });

        // 정렬된 좌표를 출력
        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}