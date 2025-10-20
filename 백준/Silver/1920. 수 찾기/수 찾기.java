
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1=Integer.parseInt(reader.readLine());
        int[] num1=new int[n1];
        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        for(int i=0;i<n1;i++) {
            num1[i]=Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(num1);
        int n2=Integer.parseInt(reader.readLine());

        StringTokenizer st2 = new StringTokenizer(reader.readLine());
        for(int i=0;i<n2;i++) {
            int temp=Integer.parseInt(st2.nextToken());
            writer.write(Arrays.binarySearch(num1,temp)>=0? "1":"0");
            writer.newLine();
        }
        writer.flush();
    }

}



