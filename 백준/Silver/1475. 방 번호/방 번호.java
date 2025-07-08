import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String num=scanner.next();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), 0);
        }
        String[] n = num.split("");

        int count = 0;

        for(int i=0;i<n.length;i++){
            if (n[i].equals("6")||n[i].equals("9")) {
                count++;

            }else {
                Integer temp=map.get(n[i]);

                map.put(n[i],temp+1);
            }

        }

        int max = 0;
        for(int i=0; i<n.length;i++){
            max=Math.max(max,map.get(n[i]));
        }

        if(max>(count/2+count%2)){
            System.out.println(max);
        }else{
            System.out.println(count/2+count%2);
        }




    }

}



