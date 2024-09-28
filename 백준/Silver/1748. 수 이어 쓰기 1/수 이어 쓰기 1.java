import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input =Integer.parseInt(reader.readLine());
        int result=0;
        int cnt=1;
        int size=10;
        for(int i=1; i<=input;i++){
            if(i==size){
                cnt++;
                size*=10;
            }
                result+=cnt;
        }
        System.out.println(result);
    }
}