import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String[] arr = reader.readLine().split(" ");
            int a=Integer.parseInt(arr[0]);
            int b =Integer.parseInt(arr[1]);
            int c= Integer.parseInt(arr[2]);
            if (a==0){break;}
            else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b +c*c==a*a)) System.out.println("right");
            else{
                System.out.println("wrong");
            }
        }
    }
}