import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(reader.readLine());
        String num = "666";
        for(int i=1; i<len; i++){
            int numb= Integer.parseInt(num);
            numb++;
            num=String.valueOf(numb);
            while(!num.contains("666")){
                numb++;
                num=String.valueOf(numb);
            }{

            }
        }
        System.out.println(num);

    }
}