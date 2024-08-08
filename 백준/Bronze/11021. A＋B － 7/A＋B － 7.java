
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int numberOfLines = Integer.parseInt(reader.readLine());


        for (int i = 1; i <= numberOfLines; i++) {
            String[] parts = reader.readLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            System.out.println("Case #" + i + ":" + " " + (a+b)); // 예시 출력
        }


        }
    }