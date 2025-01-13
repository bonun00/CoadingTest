import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        int com=0;
        for(int i= 0; i< len; i++){
            com+= Integer.parseInt(reader.readLine());
        }
        len-=1;
        System.out.println(com-len);



    }
}

