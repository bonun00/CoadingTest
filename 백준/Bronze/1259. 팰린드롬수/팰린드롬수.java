import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] arr = reader.readLine().split("");
            if (arr[0].equals("0")) {
                break;
            }
            boolean isPalindrome = true; // 기본값을 true로 설정

            for (int i = 0; i < arr.length / 2; i++) {
                if (!arr[i].equals(arr[arr.length - 1 - i])) {
                    isPalindrome = false; // 조건을 만족하지 않으면 false로 설정
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}