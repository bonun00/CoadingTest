
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.PriorityQueue;
    import java.util.Queue;

    public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            if(num==0){
                if(!q.isEmpty()){
                    System.out.println(q.poll());
                }else{
                    System.out.println("0");
                }
            }else{
                q.add(num);
            }
        }

    }
}
