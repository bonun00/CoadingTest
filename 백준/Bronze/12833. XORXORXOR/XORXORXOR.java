
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        for(int i=0; i<c; i++){
            a=a^b;

        }

        System.out.println(a);


    }

}



