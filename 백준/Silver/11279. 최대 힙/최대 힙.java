

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0; i < n; i++){
                int tmep=Integer.parseInt(reader.readLine());
                if(tmep==0){
                    System.out.println(q.isEmpty()?"0":q.poll());
                }else{
                    q.add(tmep);
                }
            }




        }

    }

