

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());
        int ans=0;
        Set<String> set=new HashSet<>();

        for(int i=0; i<num; i++){
            String str=br.readLine();
            if(str.equals("ENTER")){
                ans+=set.size();
                set=new HashSet<>();
            }else {
                set.add(str);
            }
        }
        ans+=set.size();
        System.out.println(ans);

    }


}