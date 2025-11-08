
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int[] atm=new int[n];
            for(int i = 0; i < n; i++){
                atm[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(atm);

            int answer=0;
            int temp=0;
            for(int i = 0; i < n; i++){
                temp+=atm[i];
                answer+=temp;
            }

        System.out.println(answer);







    }
}
