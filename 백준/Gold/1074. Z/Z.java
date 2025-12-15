

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static int N, r,c,answer;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        z(r,c,(int)Math.pow(2,N));
    }
    static void z(int r, int c, int size){

        if(size==1){
            System.out.println(answer);
            return;
        }

        int s=size/2;

        if(r<s&&c<s){
            z(r,c,s);
        }else if(r<s&&c>=s){
            answer+=(size*size/4);
            z(r,c-s,s);
        }else if(r>=s&&c>=s){
            answer+=(size*size/4)*3;
            z(r-s,c-s,s);
        }else if(r>=s&&c<s){
            answer+=(size*size/4)*2;
            z(r-s,c,s);
        }



    }
}







