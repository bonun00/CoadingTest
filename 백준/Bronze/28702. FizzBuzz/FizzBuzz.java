
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line1 = reader.readLine();
        String line2 = reader.readLine();
        String line3 = reader.readLine();

        int num1= 0;
        int num2= 0;
        int num3= 0;

        if(!line1.contains("z")){
             num1=Integer.parseInt(line1);
             num2=num1+1;
            num3=num2+1;
        }else if(!line2.contains("z")){
             num2=Integer.parseInt(line2);
             num1=num2-1;
             num3=num2+1;
        }else{
            num3=Integer.parseInt(line3);
            num2=num3-1;
            num1=num2-1;
        }
        int next=num3+1;

        if(next%3==0 && next%5==0){
            System.out.println("FizzBuzz");
        }else if(next%3==0 ){
            System.out.println("Fizz");
        }else if(next%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(""+next);
        }



    }

}



