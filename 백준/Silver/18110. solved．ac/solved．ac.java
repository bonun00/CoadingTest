
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] nums = new int[n+1];


        for (int i = 1; i <= n; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(nums);
        long not=Math.round(n*0.15);
        int notNum=0;
        int answer=0;

        for(int i=1;i<=n;i++){

            if(i<=not){
                notNum++;
                continue;
            }
            if(n-not<i){
                notNum++;
                continue;
            }
            answer+=nums[i];
        }
        System.out.println(Math.round((double)answer/(n-notNum)));


    }
}




