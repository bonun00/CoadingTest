
    import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;

    
    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(reader.readLine());
            Bstack bstack= new Bstack();
            for(int i=0; i <len; i++){
                String command = reader.readLine();
                if(command.startsWith("push")){
                    int value= Integer.parseInt(command.split(" ")[1]);
                    bstack.push(value);
                }else if(command.equals("pop")){
                    System.out.println(bstack.pop());
                }else if(command.equals("size")){
                    System.out.println(bstack.size());
                }else if(command.equals("empty")){
                    System.out.println(bstack.empty()? 1:0);
                }else if(command.equals("top")){
                    System.out.println(bstack.top());
                }
            }
            }
        }


class Bstack{
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int value){
        stack.add(value);
    }
    public int pop(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.remove(stack.size() - 1);

    }

    public int size(){
        return stack.size();
    }
    public int top(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.get(stack.size()-1);
    }
    public boolean empty(){
        return stack.isEmpty();
    }
}