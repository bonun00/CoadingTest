import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
           int num = Integer.parseInt(reader.readLine());

            if(num>0){
                list.add(num);
            } else {
                               list.remove(list.size()-1);

            }
        }

        if(list.size()==0){
            System.out.println("0");
        }else{
            int sum=0;
         for(int i=0; i<list.size(); i++){
             sum+=list.get(i);
         }
            System.out.println(sum);

        }




    }

}



