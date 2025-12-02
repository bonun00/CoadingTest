

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] Args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine().toUpperCase();

        for(int i=65; i<91;i++) {
            boolean flag=true;
            for (int j=0; j<str.length();j++) {
                if((int)str.charAt(j)==i) {
                    System.out.print(j+" ");
                    flag=false;
                    break;
                }
            }
            if(flag) {
                System.out.print(-1+" ");
            }


        }



    }


}


