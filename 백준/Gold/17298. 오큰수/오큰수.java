import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[len];
        int[] num = new int[len];
        String secondLine = reader.readLine();
        String[] numberStrings = secondLine.split(" ");
        for (int i = 0; i < len; i++) {
            num[i] = Integer.parseInt(numberStrings[i]);
        }
        for (int i =0; i<len; i++){
            result[i]=-1;
        }
        for(int i=0; i<len; i ++) {
            while (!stack.empty() && num[stack.peek()]<num[i]){
                result[stack.pop()]=num[i];
            }
            stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(result[i]).append(" ");
        }

        // 최종 결과 출력
        System.out.println(sb.toString().trim());

    }
}