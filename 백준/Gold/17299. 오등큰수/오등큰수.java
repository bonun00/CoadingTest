import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());

        int[] arr = new int[len];
        int[] count = new int[1000001]; 
        int[] result = new int[len];

        String[] input = reader.readLine().split(" ");
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(input[i]);
            count[arr[i]]++;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && count[arr[stack.peek()]] < count[arr[i]]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (result[i] == 0) {
                sb.append(-1).append(" ");
            } else {
                sb.append(result[i]).append(" ");
            }
        }
        System.out.print(sb.toString().trim());
    }
}