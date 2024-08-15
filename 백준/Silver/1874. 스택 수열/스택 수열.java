
    import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;

    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(reader.readLine());
            LinkedList<Integer> stack = new LinkedList<>();
            ArrayList<String> result = new ArrayList<>();
            int current=1;
            for (int i=0; i <len; i++) {
                int command =Integer.parseInt(reader.readLine());

                while (current<=command){
                        stack.push(current);
                        result.add("+");
                        current++;
                    }
                if (stack.peek()==command) {
                        result.add("-");
                        stack.pop();
                }else{
                    System.out.println("NO");
                    return;
                }
            }
            for (String operation : result) {
                System.out.println(operation);
            }
            }
        }


