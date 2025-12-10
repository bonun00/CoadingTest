

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int S=Integer.parseInt(br.readLine());
        String str =br.readLine();
        String ioi="I";
        int answer=0;

        for(int i=0;i<N;i++){
            ioi+="OI";
        }

        for(int i=0; i<S; i++){
            if((str.charAt(i)+"").equals("I")){

                if(i+ioi.length()-1>str.length()-1)continue;
//                System.out.println(ioi+" "+str.substring(i,i+ioi.length()));
                if(ioi.equals(str.substring(i,i+ioi.length()))){
                    answer++;
                }
            }

        }
        System.out.println(answer);


    }


}


