
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int num= Integer.parseInt(st.nextToken());
        int money= Integer.parseInt(st.nextToken());
        int temp;
        int answer=0;
        int[] m=new int[num];
        for(int i=0;i<num;i++){
            m[i]=Integer.parseInt(reader.readLine());
        }
        for(int j=num-1;j>=0;j--){
            if (m[j]<=money){
                int a=0;
                temp=m[j];
                while(temp<=money){
                   a++;
                   temp=m[j]*a;
                }
                    money=money-temp+m[j];
                    a--;


                answer+=a;
            }
        }
        System.out.println(answer);


    }
}




