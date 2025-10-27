

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
      
        for(int i = 0; i < n; i++){
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int w = Integer.parseInt(tokenizer.nextToken());
            int p= Integer.parseInt(tokenizer.nextToken());
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> q = new LinkedList<>();
            StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
            for(int j = 0; j < w; j++){
                queue.add(Integer.parseInt(tokenizer2.nextToken()));
                if(p==j){
                    q.add(1);
                 
                }else{
                    q.add(0);
                }
            }
            int answer=0;
            while(true){
                int max=queue.stream().max(Integer::compare).get();
                if(queue.peek()==max){
                    int a=queue.peek();
                    queue.remove(a);
                    answer++;
                    if(q.peek()==1){
                        break;
                    }else{
                        q.remove(q.peek());
                    }

                }else{
                    int a= queue.peek();
                    int b= q.peek();
                    queue.remove(a);
                    q.remove(b);
                    queue.add(a);
                    q.add(b);
                }
            }
            System.out.println(answer);



        }
    }
}




