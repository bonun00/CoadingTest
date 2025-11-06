
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] n  =reader.readLine().split(" ");
        int len =Integer.parseInt(n[0]);
        int[] nums=new int[len+1];
        int[] sum=new int[len+1];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= len; i++) {
            nums[i]=Integer.parseInt(st.nextToken());
            sum[i]=sum[i-1]+nums[i];
        }

        for(int i=0;i<Integer.parseInt(n[1]);i++){
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int a=Integer.parseInt(tokenizer.nextToken());
            int b=Integer.parseInt(tokenizer.nextToken());
            
            System.out.println(sum[b]-sum[a-1]);

        }


    }
}
