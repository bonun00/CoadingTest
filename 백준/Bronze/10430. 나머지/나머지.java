import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] len = reader.readLine().split(" ");
        int[] arr =new int[len.length];
        for(int i =0; i< len.length; i++){
            arr[i] =Integer.parseInt(len[i]);
        }
//        (A+B)%C
        System.out.println((arr[0]+arr[1])%arr[2]);
//        ((A%C) + (B%C))%C
        System.out.println(((arr[0]%arr[2])+(arr[1]%arr[2]))%arr[2]);
//        (A×B)%C
        System.out.println((arr[0]*arr[1])%arr[2]);
//        ((A%C) × (B%C))%C
        System.out.println(((arr[0]%arr[2])*(arr[1]%arr[2]))%arr[2]);
    }
}