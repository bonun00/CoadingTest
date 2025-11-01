
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<10;i++) {
            int num=Integer.parseInt(reader.readLine());

            int[] box=new int[100];
            StringTokenizer st=new StringTokenizer(reader.readLine());
            for(int j=0; j<100;j++) {
                box[j]=Integer.parseInt(st.nextToken());
            }

            Arrays.sort(box);

            for(int j=0; j<num;j++) {
                box[99]--;
                box[0]++;
                Arrays.sort(box);
            }

            System.out.println("#"+(i+1)+" "+ (box[99]-box[0]));

        }




    }
}




