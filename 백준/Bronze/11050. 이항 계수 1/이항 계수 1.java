import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num= reader.readLine();
        int n=Integer.parseInt(num.split(" ")[0]);
        int k=Integer.parseInt(num.split(" ")[1]);
        int result = 1;
        for(int i=2; i<=n;i++ ){
            result*=i;
        }

        for(int i=1; i<=k; i++){
            result/=i;
        }
        for(int i=1; i<=n-k; i++){
            result/=i;
        }
        System.out.println(result);


    }
}