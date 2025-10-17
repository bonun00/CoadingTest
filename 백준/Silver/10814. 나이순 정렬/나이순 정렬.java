import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        List<Integer> list = new ArrayList<>();
        Set<Integer> same = new HashSet<>();
        Map<Integer, String > map = new HashMap<>();
        int num = Integer.parseInt(st.nextToken());
        for (int i = 0; i < num; i++) {
            StringTokenizer st2 = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st2.nextToken());
            String b = st2.nextToken();
            if(!list.contains(a)){
                list.add(a);
            }

            if(map.containsKey(a)){
                map.put(a,map.get(a)+" "+b);
                same.add(a);
            }else{
                map.put(a,b);
            }

        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if(same.contains(list.get(i))){
                String[] str=map.get(list.get(i)).split(" ");
                for(int j=0;j<str.length;j++){
                    System.out.println(list.get(i)+" "+str[j]);
                }
                same.remove(list.get(i));
            }else{
                System.out.println(list.get(i)+" "+map.get(list.get(i)));
            }

        }


    }

}



