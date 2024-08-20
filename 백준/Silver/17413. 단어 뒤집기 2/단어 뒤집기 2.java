
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        boolean tags = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '<') {
                tags = true;
                while (!stack.empty()) {
                    sb.append(stack.pop());
                }
                sb.append(command.charAt(i));
            } else if (command.charAt(i) == '>') {
                tags = false;
                sb.append(command.charAt(i));
            } else if (tags) {
                sb.append(command.charAt(i));
            } else if (!tags) {
                if (command.charAt(i) == ' ') {
                    while (!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(command.charAt(i));
                } else {
                    stack.push(command.charAt(i));
                }
            }
        }
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        System.out.print(sb.toString());
    }
}
