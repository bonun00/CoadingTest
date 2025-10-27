
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Queue<Integer> q = new LinkedList<>();

        for (int i =1 ; i <= n; i++) {
            q.add(i);
        }
        int temp=1;
        while(q.size()!=1) {
            int num =q.peek();
            if(temp%2==1) {
                q.remove(num);
                temp++;
            }else {
                q.remove(num);
                q.add(num);
                temp++;
            }
        }
        System.out.println(q.peek());



    }



}





