
    import java.io.IOException;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.LinkedList;


    public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(reader.readLine());
            queue que= new queue();
            for (int i = 0; i < len; i++) {
                String command = reader.readLine();
                if(command.startsWith("push")){
                    int value=Integer.parseInt(command.split(" ")[1]);
                    que.push(value);
                }else if(command.equals("pop")){
                    System.out.println(que.pop());
                }else if(command.equals("size")){
                    System.out.println(que.size());
                }else if (command.equals("empty")){
                    if(que.empty()){
                    System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                } else if (command.equals("front")) {
                    System.out.println(que.front());
                } else if (command.equals("back")) {
                    System.out.println(que.back());
                }


            }
        }

    }
    class queue{
        LinkedList<Integer> que =new LinkedList<>();


        public void push(int value){
            que.add(value);
        }
        public int pop(){
            if(que.isEmpty()){
                return -1;
            }
           return que.pop();
        }
        public int size(){
            return que.size();
        }
        public boolean empty(){
            return que.isEmpty();
        }
        public int front(){
            if(que.isEmpty()){
                return -1;
            }
            return que.getFirst();
        }
        public int back(){
            if(que.isEmpty()){
                return -1;
            }
            return que.getLast();
        }
    }