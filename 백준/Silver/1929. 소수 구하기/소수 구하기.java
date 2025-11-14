
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st=new StringTokenizer(reader.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            for (int i=a;i<=b;i++) {
                boolean n=true;
                if(i < 2) continue;
                for(int j=2;j<=Math.sqrt(i);j++) {
                    if(i%j==0) {
                        n=false;
                        break;
                    }
                }

                if(n) System.out.println(i);



            }


        }

    }

