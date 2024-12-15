import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int len = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String ,Integer> pocket= new HashMap<>();
        HashMap<Integer,String> mon= new HashMap<>();
        for(int a=1; a<=len; a++){
            String name= reader.readLine();
            pocket.put(name,a);
            mon.put(a,name);
        }
        for(int b=1; b<=m; b++){
           String result = reader.readLine();
           try{
               int answer=Integer.parseInt(result);
               System.out.println(mon.get(answer));
           } catch (NumberFormatException e) {
               System.out.println(pocket.get(result));
           }
        }
    }
}
