
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;

import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new int[]{x, y});
        }
        Collections.sort(list,
            (a,b)->{
            if(a[1] == b[1]) {
                return a[0] - b[0];
            }else{
                return a[1] - b[1];
            }
            });

        for (int i = 0; i < list.size(); i++) {
            System.out.println((list.get(i)[0] +" "+ list.get(i)[1]));
        }

    }
}



