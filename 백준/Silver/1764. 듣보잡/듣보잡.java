

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st=new StringTokenizer(reader.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            Map<String,Integer> map =new TreeMap<>();
            for(int i=0;i<N;i++){
                map.put(reader.readLine(),0);
            }
            int num=0;
            for(int i=0;i<M;i++){
                String temp=reader.readLine();
                if(map.getOrDefault(temp,-1)>=0){
                    map.put(temp,map.get(temp)+1);
                    num++;
                }
            }
            System.out.println(num);
            for(String m: map.keySet()){
                if(map.get(m)>=1){
                    System.out.println(m);
                }
            }



        }

    }

