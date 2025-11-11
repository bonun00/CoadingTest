

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] nums =reader.readLine().split("-");
            int[] n=new int[nums.length];
            int answer=0;
            for(int i=0;i<nums.length;i++) {
                String[] temp=nums[i].split("\\+");
                for(String t:temp){
                    n[i]+=Integer.parseInt(t);
                }
                if(i==0){
                 answer+=n[i];
                }else{
                    answer-=n[i];
                }
            }
            System.out.println(answer);

        }

    }

