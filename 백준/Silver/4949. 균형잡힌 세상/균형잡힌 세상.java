import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break;      
            Deque<Character> stack = new ArrayDeque<>();
            boolean ok = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') { ok = false; break; }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') { ok = false; break; }
                }
            }

            out.append(ok && stack.isEmpty() ? "yes" : "no").append('\n');
        }

        System.out.print(out.toString());
    }
}