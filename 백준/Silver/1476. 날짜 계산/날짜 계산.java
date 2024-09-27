import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input= reader.readLine();
        int Ea=Integer.parseInt( input.split(" ")[0]);
        int Sa =Integer.parseInt( input.split(" ")[1]);
        int Ma =Integer.parseInt( input.split(" ")[2]);
        int year=1;
        int E=1,S=1, M=1;
        while(true){
            if(Ea==E && Sa==S && Ma==M){
            break;
        }
            E+=1;
            S+=1;
            M+=1;
            year+=1;
            if(E>15){
                E=1;
            }
            if(S>28){
                S=1;
            }
            if(M>19){
                M=1;
            }

        }
        System.out.println(year);

    }
}